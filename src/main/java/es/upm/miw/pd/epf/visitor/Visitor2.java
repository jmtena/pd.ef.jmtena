package es.upm.miw.pd.epf.visitor;

public class Visitor2 extends Visitor{

	private int numTriangles = 0;
	private int numSquares = 0;
	private int numCircles = 0;
	
	@Override
	public void visitTriangle(Triangle tr) {
		numTriangles++;
	}

	@Override
	public void visitSquare(Square sq) {
		numSquares++;
	}

	@Override
	public void visitCircle(Circle cr) {
		numCircles++;
	}

	public int getNumTriangles() {
		return numTriangles;
	}

	public int getNumSquares() {
		return numSquares;
	}

	public int getNumCircles() {
		return numCircles;
	}

}
