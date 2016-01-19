package es.upm.miw.pd.epf.request;

public class OrderLocal2 implements Order{
	
	PeticionLocal peticionLocal;
	
	public OrderLocal2(PeticionLocal receptor){
		peticionLocal = receptor;
	}
	
	@Override
	public void execute() {
		peticionLocal.local2();
	}

	@Override
	public String name() {
		return "Local2";
	}

}
