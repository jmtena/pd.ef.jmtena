package es.upm.miw.pd.epf.memento;

public class MultiplyCommand extends OperationCommand{
	
	public MultiplyCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Multiply";
    }

    @Override
    public Object execute(Object value) {
        return this.calculator.multiply((double)value);
    }
	
}
