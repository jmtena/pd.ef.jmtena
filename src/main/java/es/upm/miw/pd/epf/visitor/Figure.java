package es.upm.miw.pd.epf.visitor;

public interface Figure {
	
    void area();
    void numberOfSides();
    void accept(Visitor v);
}
