package es.upm.miw.pd.epf.flyweight;

public abstract class Documento {
	public abstract void add(Caracter c);
	public abstract void add(Parrafo p);
	public abstract void add(Texto txt);
	
	public abstract void remove(Caracter c);
	public abstract void remove(Parrafo p);
	public abstract void remove(Texto txt);
	
	public abstract String print(boolean upperCase);
}
