package es.upm.miw.pd.epf.memento;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private CommandManager commandManager = new CommandManager();
	private CalculatorMementable calculator = new CalculatorMementable();
	
	@Before
    public void ini() {
        commandManager.add(new AddCommand(calculator));
        commandManager.add(new SubstractCommand(calculator));
        commandManager.add(new MultiplyCommand(calculator));
        commandManager.add(new DivideCommand(calculator));
        commandManager.add(new ResetCommand(calculator));
        commandManager.add(new PrintCommand(calculator));
	}
	
	@Test
	public void testAdd(){
		commandManager.execute("Add", new Double(5));
		assertEquals(calculator.getTotal(),5,1e-10);
	}
	
	@Test
	public void testSubstract(){
		commandManager.execute("Add", new Double(5));
		commandManager.execute("Substract", new Double(1));
		assertEquals(calculator.getTotal(),4,1e-10);
	}
	
	@Test
	public void testMultiply(){
		commandManager.execute("Add", new Double(5));
		commandManager.execute("Multiply", new Double(3));
		assertEquals(calculator.getTotal(),15,1e-10);
	}
	
	@Test
	public void testDivide(){
		commandManager.execute("Add", new Double(8));
		commandManager.execute("Divide", new Double(4));
		assertEquals(calculator.getTotal(),2,1e-10);
	}
	
	@Test
	public void testReset(){
		commandManager.execute("Add", new Double(5));
		commandManager.execute("Reset", null);
		assertEquals(calculator.getTotal(),0,1e-10);
	}	
	
}
