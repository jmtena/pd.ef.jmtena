package es.upm.miw.pd.epf.memento;

public class SubstractCommand extends OperationCommand{
	
	public SubstractCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Substract";
    }

    @Override
    public Object execute(Object value) {
        this.calculator.substract((double)value);
        return null;
    }
	
}
