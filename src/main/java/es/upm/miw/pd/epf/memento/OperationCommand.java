package es.upm.miw.pd.epf.memento;

public abstract class OperationCommand implements Command{
	
	protected CalculatorMementable calculator; //Receptor
	
	public abstract Object execute(Object value);
    public abstract String name();
}
