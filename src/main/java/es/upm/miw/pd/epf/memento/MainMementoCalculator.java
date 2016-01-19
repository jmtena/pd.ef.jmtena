package es.upm.miw.pd.epf.memento;

import es.upm.miw.pd.epf.utils.IO;

public class MainMementoCalculator {
    private CommandManager commandManager;
    private MementoManager<Memento> mementoManager;

    public MainMementoCalculator() {
        CalculatorMementable calculator = new CalculatorMementable();
        this.mementoManager = new MementoManager<Memento>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubstractCommand(calculator));
        this.commandManager.add(new MultiplyCommand(calculator));
        this.commandManager.add(new DivideCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new UndoCommand(calculator));
    }

    public void execute() {
    	IO io = new IO();
        String key = (String) io.select(this.commandManager.keys());
        Object value;
        
        if (isOperationCommand(key)){
        	value = new Double(io.readDouble("Introduzca valor"));
        	this.commandManager.execute(key,value);
        }
        else if (isMementoOperation(key)){
        	value = io.readString("Nombre del memento");
        	if (isSaveOperation(key)){
        		Memento memento = (Memento)this.commandManager.execute(key,value);
        		this.mementoManager.addMemento((String)value, memento);
        	}else{ //Undo
        		Memento memento = this.mementoManager.getMemento((String)value);
        		this.commandManager.execute(key,memento);
        	}
        }
        else{ //Reset o Print
        	value=null;
        	this.commandManager.execute(key,value);
        }
        	
        
    }

    private boolean isOperationCommand(String key){
    	return key==new AddCommand(null).name() ||
    		   key==new SubstractCommand(null).name() ||
    		   key==new MultiplyCommand(null).name() ||
    		   key==new DivideCommand(null).name();
    }
    
    private boolean isMementoOperation(String key){
    	return isSaveOperation(key) || isUndoOperation(key);
    }
    
    private boolean isSaveOperation(String key){
    	return key==new SaveCommand(null).name();
    }
    
    private boolean isUndoOperation(String key){
    	return key==new UndoCommand(null).name();
    }
    
    public static void main(String[] args) {
    	MainMementoCalculator calculadora = new MainMementoCalculator();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    	calculadora.execute();
    }
}
