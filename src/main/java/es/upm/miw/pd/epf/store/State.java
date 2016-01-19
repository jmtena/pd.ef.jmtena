package es.upm.miw.pd.epf.store;

public abstract class State {

	public abstract void write(Store store, String key, String value);
	public abstract String read(Store store, String key);

}
