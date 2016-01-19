package es.upm.miw.pd.epf.store;

public class LocalState extends State{

	private Local local;
	
	public LocalState(){
		local = new Local();
	}
	
	@Override
	public void write(Store store, String key, String value) {
		if (store.getNet().isAvailable()){
			store.setState(new NetState(store.getNet()));
			store.write(key, value);
		}
		else{
			local.keep(key, value);
		}
		
	}

	@Override
	public String read(Store store, String key) {
		if (store.getNet().isAvailable()){
			store.setState(new NetState(store.getNet()));
			return store.read(key);
		}
		else{
			return local.find(key);
		}		
	}

}
