package es.upm.miw.pd.epf.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public String readString(String title) {
		String input = null;
		boolean ok = false;
		do {
			this.write(title);
			try {
				input = bufferedReader.readLine();
				ok = true;
			} catch (Exception ex) {
				this.writeError("de cadena de caracteres");
			}
		} while (!ok);
		return input;
	}

	public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				input = Integer.parseInt(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}
	
	public double readDouble(String title) {
		double input = 0;
		boolean ok = false;
		do {
			try {
				input = Double.parseDouble(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("entero");
			}
		} while (!ok);
		return input;
	}

	public String select(String[] options) {
		String msg = "";
		boolean ok;
		int response;
		
		msg += "Seleccione una opcion:\n";
		for (int i = 0; i < options.length; i++)
			msg += (i+1) + "." + options[i] + " \n";
		
		ClosedInterval closedInterval = new ClosedInterval(1,options.length);		
		do{
			response = readInt(msg);
			ok = closedInterval.includes(response);
		}while (!ok);		
		return options[response-1];
	}

	public void write(String msg) {
		System.out.println(msg);
	}

	public void writeln(String msg) {
		write(msg);
		write("\n");
	}

	private void writeError(String formato) {
		System.out.println("ERROR DE FORMATO! " + "Introduzca un valor con formato " + formato + ".");
	}
}
