package es.upm.miw.pd.epf.memento;

public class DivideCommand extends OperationCommand{
	
	public DivideCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Divide";
    }

    @Override
    public Object execute(Object value) {
        return this.calculator.divide((double)value);
    }
	
}
