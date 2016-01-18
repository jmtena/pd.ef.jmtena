package es.upm.miw.pd.epf.flyweight;

public class Texto extends Escrito{
	private int parrafos;
	
	public Texto(){
		this.parrafos = 0;
	}
	
	@Override
	public void add(Parrafo p){
		list.add(p);
		this.parrafos++;
	}
	
	@Override
	public void add(Texto txt){
		list.add(txt);
		this.parrafos += txt.getParrafos();
	}
	
	@Override
	public void add(Caracter c){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	@Override
	public void remove(Parrafo p){
		list.remove(p);
		this.parrafos--;
	}
	
	@Override
	public void remove(Texto txt){
		list.remove(txt);
		this.parrafos -= txt.getParrafos();
	}
	
	@Override
	public void remove(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public String print(boolean upperCase){
		String texto = "";
		
		for(Documento doc : list)
			texto += doc.print(upperCase);
		
		texto += "\n";
		texto += "---o---";
		
		return texto;
	}

	public int getParrafos() {
		return parrafos;
	}	
}
