package es.upm.miw.pd.epf.visitor;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {

	private Collection<Figure> coleccion = new ArrayList<Figure>();
	Visitor2 v2;
	
	@Before
    public void ini() {
		coleccion.add(new Triangle("T1",3,2));
        coleccion.add(new Triangle("T2",4,3));
        coleccion.add(new Triangle("T3",2,5));
        coleccion.add(new Square("S1",3));
        coleccion.add(new Square("S2",4));
        coleccion.add(new Circle("C1",1));
        
        v2 = new Visitor2();
        for (Figure figure : coleccion) {
            figure.accept(v2);
        }
	}
	
	@Test
    public void testVisitor() {
		assertEquals(3,v2.getNumTriangles());
		assertEquals(2,v2.getNumSquares());
		assertEquals(1,v2.getNumCircles());
	}
	
	@Test
	public void testArea(){
		assertEquals(3,new Triangle("T1",3,2).area(),1e-10);
		assertEquals(9,new Square("S1",3).area(),1e-10);
		assertEquals(Math.PI,new Circle("C1",1).area(),1e-10);
	}
	
	@Test
	public void testNumberOfSides(){
		assertEquals(3,new Triangle("T1",3,2).numberOfSides());
		assertEquals(4,new Square("S1",3).numberOfSides());
		assertEquals(0,new Circle("C1",1).numberOfSides());
	}
	
}
