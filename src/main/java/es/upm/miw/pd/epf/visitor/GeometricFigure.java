package es.upm.miw.pd.epf.visitor;

public abstract class GeometricFigure implements Figure{
	
	protected String description;
	
	public GeometricFigure(String description){
		this.description = description;
	}

	public abstract void area();
	public abstract void numberOfSides();
	public abstract void accept(Visitor v);

	public String getDescription() {
		return description;
	}
	
}
