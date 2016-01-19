package es.upm.miw.pd.epf.memento;

public class SaveCommand extends OperationCommand{

	public SaveCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Save";
    }

    @Override
    public Memento execute(Object value) {
        return this.calculator.createMemento();
    }
	
}
