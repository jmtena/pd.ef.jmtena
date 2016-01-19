package es.upm.miw.pd.epf.store;

public class StoreMain {

	private Store store;
	
	public StoreMain(){
		store = new Store();
	}
	
	private void write(String key, String value){
		store.write(key, value);
	}
	
	private String read(String key){
		return store.read(key);
	}
	
	public static void main(String[] args){
		//No se puede realizar el test de esta clase porque, como la disponibilidad de la
		//conexion es aleatoria (y eso no se puede modificar segun el enunciado)
		//no se puede programar con exactitud una prueba
		
	}
	
}
