package es.upm.miw.pd.epf.composite;

public class Multiplicar extends Expresion{
	private Expresion valor1;
	private Expresion valor2;
	
	public Multiplicar(Expresion valor1, Expresion valor2){
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	@Override
	public int operar(){
		return valor1.operar() * valor2.operar();
	}
	
	@Override
	public String toString(){
		return "(" + valor1 + "*" + valor2 + ")";
	}
}
