package es.upm.miw.pd.epf.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	//Creación temprana
	private static final FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
	
	private Map<Character,Caracter> map;
	
	private FactoriaCaracter(){
		this.map = new HashMap<>();
	}

	public static FactoriaCaracter getFactory(){
		return factoriaCaracter;
	}
	
	public Caracter getCaracter(char c){
		char cMinusc = (c + "").toLowerCase().charAt(0);
		Character key = new Character(cMinusc);
		
		if (map.containsKey(key)){
			return map.get(key);
		}
		else{
			//Construcción perezosa
			Caracter cr = new Caracter(cMinusc);
			map.put(key,cr);
			return cr;
		}
	}
}
