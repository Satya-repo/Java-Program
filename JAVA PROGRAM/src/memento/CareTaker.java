package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> list = new ArrayList();
	
	public void add(Memento mem) {
		
		list.add(mem);
	}
	
	public Memento getState(int index) {
		
		return list.get(index);
		
	}

}
