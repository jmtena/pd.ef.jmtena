package es.upm.miw.pd.epf.memento;

import es.upm.miw.pd.epf.utils.IO;

public class CalculatorMementable implements Mementable<Memento>{
    private double total;

    public CalculatorMementable() {
    	this.reset();
    }
    
    public double getTotal() {
        return total;
    }
    
    protected void setTotal(double total) {
        this.total = total;
    }

    public Object add(double value) {
    	this.setTotal(this.total + value);
    	return new Double(this.total);
    }

    public void substract(double value) {
    	this.setTotal(this.total - value);
    }

    public Object multiply(double value) {
    	this.setTotal(this.total * value);
    	return new Double(this.total);
    }
    
    public Object divide(double value) {
    	this.total = this.total / value;
    	return new Double(this.total);
    }
    
    public void reset() {
        this.setTotal(0);
    }
    
    public void print(){
    	new IO().writeln(total + "");
    }

	@Override
	public Memento createMemento() {
		return new Memento(this.total);
	}

	@Override
	public void restoreMemento(Memento memento) {
		this.total = memento.getValue();		
	}
    
}
