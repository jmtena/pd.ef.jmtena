package es.upm.miw.pd.epf.flyweight;

public abstract class Escrito extends Documento{
	protected java.util.List<Documento> list;
	
	protected Escrito(){
		this.list = new java.util.ArrayList<Documento>();
	}
	
	protected int size(){
		return list.size();
	}
}
