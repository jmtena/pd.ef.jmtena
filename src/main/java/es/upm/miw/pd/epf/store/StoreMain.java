package es.upm.miw.pd.epf.store;

public class StoreMain {

	private Store store;
	
	public StoreMain(){
		store = Store.getStore();
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
		StoreMain store = new StoreMain();
		store.write("O1", "Objeto 1");
		store.write("O2", "Objeto 2");
		store.write("O3", "Objeto 3");
		System.out.println("Recuperando objetos");
		System.out.println("Objeto recuperado: " + store.read("O1"));
		System.out.println("Objeto recuperado: " + store.read("O2"));
		System.out.println("Objeto recuperado: " + store.read("O3"));
	}
	
}
