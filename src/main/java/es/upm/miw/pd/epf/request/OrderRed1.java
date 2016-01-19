package es.upm.miw.pd.epf.request;

public class OrderRed1 implements Order{

	PeticionRed peticionRed;
	
	public OrderRed1(PeticionRed receptor){
		peticionRed = receptor;
	}
	
	@Override
	public void execute() {
		peticionRed.red1();
	}

	@Override
	public String name() {
		return "Red1";
	}

}
