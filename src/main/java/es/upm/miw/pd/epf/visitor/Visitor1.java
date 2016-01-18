package es.upm.miw.pd.epf.visitor;

public class Visitor1 extends Visitor{

	@Override
	public void visitTriangle(Triangle tr) {
		System.out.println("Visitador 1 --> triangulo: " + tr.getDescription());
	}

	@Override
	public void visitSquare(Square sq) {
		System.out.println("Visitador 1 --> cuadrado: " + sq.getDescription());		
	}

	@Override
	public void visitCircle(Circle cr) {
		System.out.println("Visitador 1 --> circulo: " + cr.getDescription());	
	}

}
