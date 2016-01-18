package es.upm.miw.pd.epf.visitor;

public abstract class Visitor {

	public abstract void visitTriangle(Triangle tr);
    public abstract void visitSquare(Square sq);
    public abstract void visitCircle(Circle cr);
	
}
