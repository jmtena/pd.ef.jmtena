package es.upm.miw.pd.epf.visitor;

public class Square extends GeometricFigure{

	private int side; 
	
	public Square(String description, int side){
		super(description);
		this.side = side;
		this.numberOfSides = 4;
	}

	@Override
	public double area() {
		return side*side;
	}

	@Override
	public int numberOfSides() {
		return this.numberOfSides;
	}

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
	}
	
}
