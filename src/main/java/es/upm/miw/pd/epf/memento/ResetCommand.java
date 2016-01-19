package es.upm.miw.pd.epf.memento;

public class ResetCommand extends OperationCommand{
	
	public ResetCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Reset";
    }

    @Override
    public Object execute(Object value) {
        this.calculator.reset();
        return null;
    }
    
}
