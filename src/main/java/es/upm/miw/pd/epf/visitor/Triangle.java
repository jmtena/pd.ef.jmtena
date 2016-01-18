package es.upm.miw.pd.epf.visitor;

public class Triangle extends GeometricFigure{
	
	public Triangle(String description){
		super(description);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void numberOfSides() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);
	}
	
}
