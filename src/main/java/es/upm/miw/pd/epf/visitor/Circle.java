package es.upm.miw.pd.epf.visitor;

public class Circle extends GeometricFigure{
	
	private int radio;

	public Circle(String description, int radio){
		super(description);
		this.radio = radio;
		this.numberOfSides = 0;
	}

	@Override
	public double area() {
		return Math.PI*radio*radio;
	}

	@Override
	public int numberOfSides() {
		return this.numberOfSides;
	}

	@Override
	public void accept(Visitor v) {
		v.visitCircle(this);
	}
	
}
