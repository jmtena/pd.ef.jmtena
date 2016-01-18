package es.upm.miw.pd.epf.visitor;

public abstract class GeometricFigure implements Figure{
	
	protected String description;
	protected int numberOfSides;
	
	public GeometricFigure(String description){
		this.description = description;
	}

	public abstract double area();
	public abstract int numberOfSides();
	public abstract void accept(Visitor v);

	public String getDescription() {
		return description;
	}
	
}
