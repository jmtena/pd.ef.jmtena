package es.upm.miw.pd.epf.visitor;

public class Triangle extends GeometricFigure{
	
	private int base;
	private int height;
	
	public Triangle(String description, int base, int height){
		super(description);
		this.base = base;
		this.height = height;
		this.numberOfSides = 3;
	}

	@Override
	public double area() {
		return (base*height)/2;
	}

	@Override
	public int numberOfSides() {
		return numberOfSides;
	}

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);
	}
	
}
