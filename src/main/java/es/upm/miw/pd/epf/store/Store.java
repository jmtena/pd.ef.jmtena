package es.upm.miw.pd.epf.store;

public class Store {
	//Creación temprana
	private static final Store store = new Store();

    private State state;
    private Net net;
    
    private Store(){
    	net = new Net();
    	state = new NetState(net);
    }
    
    public static Store getStore(){
    	return store;
    }

    // Se almacena un objeto
    public void write(String key, String value) {
    	state.write(this,key, value);
    }

    // Se lee un objeto
    public String read(String key) {
        return state.read(this,key);
    }
    
    public void setState(State state){
    	this.state = state;
    }

	public Net getNet() {
		return net;
	}

}
