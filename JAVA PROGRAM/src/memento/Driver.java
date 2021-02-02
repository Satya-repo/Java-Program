package memento;


//Memento pattern is a behavioral design pattern. 
//Memento pattern is used to restore state of an object to 
//a previous state. As your application is progressing,
//you may want to save checkpoints in your application and
//restore back to those checkpoints later.
public class Driver {
	
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("STATE 1");
		originator.setState("STATE 2");
		careTaker.add(originator.saveMementoState());
		originator.setState("STATE 3");
		careTaker.add(originator.saveMementoState());
		originator.setState("STATE 4");
		careTaker.add(originator.saveMementoState());
		System.out.println("current state :: "+originator.getState());
		originator.getMementoState(careTaker.getState(0));
		System.out.println("First saved state :: "+ originator.getState());
		originator.getMementoState(careTaker.getState(1));
		System.out.println("Second saved state :: "+ originator.getState());
		
		
	}

}
