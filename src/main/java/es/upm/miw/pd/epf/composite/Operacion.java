package es.upm.miw.pd.epf.composite;

import java.util.List;

public abstract class Operacion extends Expresion{
	private List<Expresion> lista_expresiones;
	
	@Override
	public int operar(){
		int total = 0;
		for(Expresion e : lista_expresiones)
			total += e.operar();
		return total;
	}
	
	@Override
	public String toString(){
		String exp_str = "";
		
		exp_str += "(";
		for(Expresion e : lista_expresiones)
			exp_str += e.toString();
		exp_str += ")";
		
		return exp_str;
	}
}
