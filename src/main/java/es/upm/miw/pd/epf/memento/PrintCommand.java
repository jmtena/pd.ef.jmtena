package es.upm.miw.pd.epf.memento;

public class PrintCommand extends OperationCommand{

	public PrintCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Print";
    }

    @Override
    public Object execute(Object value) {
        this.calculator.print();
        return null;
    }

}
