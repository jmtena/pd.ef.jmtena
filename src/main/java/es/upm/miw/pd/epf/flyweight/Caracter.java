package es.upm.miw.pd.epf.flyweight;

public class Caracter extends Documento{
	private char caracter;
	
	public Caracter(char caracter){
		this.caracter = caracter;
	}
	
	@Override
	public String print(boolean upperCase){
		if (upperCase)
			return new String(this.caracter + "").toUpperCase();
		else
			return this.caracter + "";
	}
	
	@Override
	public void add(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public void add(Parrafo p){} //No se hace nada. Se ignora
	
	@Override
	public void add(Texto txt){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Parrafo p){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Texto txt){} //No se hace nada. Se ignora
	
}
