package es.upm.miw.pd.epf.request;

public class OrderLocal1 implements Order{

	PeticionLocal peticionLocal;
	
	public OrderLocal1(PeticionLocal receptor){
		peticionLocal = receptor;
	}
	
	@Override
	public void execute() {
		peticionLocal.local1();
	}

	@Override
	public String name() {
		return "Local1";
	}

}
