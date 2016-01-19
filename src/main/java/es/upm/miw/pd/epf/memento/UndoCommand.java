package es.upm.miw.pd.epf.memento;

public class UndoCommand extends OperationCommand{

	public UndoCommand(CalculatorMementable calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Undo";
    }

    @Override
    public Object execute(Object value) {
        this.calculator.restoreMemento((Memento)value);
        return null;
    }
	
}
