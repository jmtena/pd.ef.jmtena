package es.upm.miw.pd.epf.request;

public class OrderRed2 implements Order{

	PeticionRed peticionRed;
	
	public OrderRed2(PeticionRed receptor){
		peticionRed = receptor;
	}
	
	@Override
	public void execute() {
		peticionRed.red2();
	}

	@Override
	public String name() {
		return "Red2";
	}

}
