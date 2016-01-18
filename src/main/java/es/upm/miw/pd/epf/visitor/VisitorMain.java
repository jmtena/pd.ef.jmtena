package es.upm.miw.pd.epf.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class VisitorMain {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    public VisitorMain() {
        coleccion.add(new Triangle("T1",3,2));
        coleccion.add(new Triangle("T2",4,3));
        coleccion.add(new Triangle("T3",2,5));
        coleccion.add(new Square("S1",3));
        coleccion.add(new Square("S2",4));
        coleccion.add(new Circle("C1",1));
    }

    public void visitar() {
        Visitor1 v1 = new Visitor1();
        Visitor2 v2 = new Visitor2();
        for (Figure figure : coleccion) {
            figure.accept(v1);
            figure.accept(v2);
        }
        
        System.out.println("Num. triangulos: " + v2.getNumTriangles());
        System.out.println("Num. cuadrados: " + v2.getNumSquares());
        System.out.println("Num. circulos: " + v2.getNumCircles());
    }

    public static void main(String[] args) {
        new VisitorMain().visitar();
    }
}
