package es.upm.miw.pd.epf.visitor;

public interface Figure {
	
    double area();
    int numberOfSides();
    void accept(Visitor v);
}
