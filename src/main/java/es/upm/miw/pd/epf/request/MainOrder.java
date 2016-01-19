package es.upm.miw.pd.epf.request;

import es.upm.miw.pd.epf.utils.IO;

public class MainOrder {

	private Invoker invocador;

    public MainOrder() {
    	PeticionLocal receptorLocal = new PeticionLocal();
    	PeticionRed receptorRed = new PeticionRed();
        this.invocador= new Invoker();
        this.invocador.add(new OrderLocal1(receptorLocal));
        this.invocador.add(new OrderLocal2(receptorLocal));
        this.invocador.add(new OrderRed1(receptorRed));
        this.invocador.add(new OrderRed2(receptorRed));
        this.invocador.add(new OrderRed3(receptorRed));
    }

    public void invoke() {
        String key = (String) new IO().select(this.invocador.keys());
        this.invocador.execute(key);
    }
    
    public static void main(String[] args){
    	new MainOrder().invoke();
    }
	
}
