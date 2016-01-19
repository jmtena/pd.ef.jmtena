package es.upm.miw.pd.epf.memento;

public class AddCommand extends OperationCommand{
	
	public AddCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Add";
    }

    @Override
    public Object execute(Object value) {
        return this.calculator.add((double)value);
    }
	
}
