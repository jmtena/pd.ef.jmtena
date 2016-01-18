package es.upm.miw.pd.epf.visitor;

public class Circle extends GeometricFigure{

	public Circle(String description){
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
		v.visitCircle(this);
	}
	
}
