package es.upm.miw.pd.epf.request;

public class OrderRed3 implements Order{

	PeticionRed peticionRed;
	
	public OrderRed3(PeticionRed receptor){
		peticionRed = receptor;
	}
	
	@Override
	public void execute() {
		peticionRed.red3();
	}

	@Override
	public String name() {
		return "Red3";
	}

}
