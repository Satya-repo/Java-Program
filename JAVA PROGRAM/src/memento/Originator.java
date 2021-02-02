package memento;

public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void getMementoState(Memento mem) {
		state =  mem.getState();
		
	}
	
	public Memento saveMementoState() {
		
		return new Memento(state);
	}

}
