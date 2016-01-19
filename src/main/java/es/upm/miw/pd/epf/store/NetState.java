package es.upm.miw.pd.epf.store;

public class NetState extends State{
	
	private Net net;
	
	public NetState(Net net){
		this.net = net;
	}
	
	@Override
	public void write(Store store,String key, String value) {
		if (net.isAvailable()){
			net.write(key, value);
		}
		else{
			store.setState(new LocalState());
			store.write(key, value);
		}
	}

	@Override
	public String read(Store store,String key) {
		if (net.isAvailable()){
			return net.read(key);
		}
		else{
			store.setState(new LocalState());
			return store.read(key);
		}
	}

}
