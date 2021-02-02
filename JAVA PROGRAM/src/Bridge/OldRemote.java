package Bridge;

public class OldRemote implements Remote {

	@Override
	public void on() {
		
		System.out.println("switching ON TV with Old Remote");
		
	}

	@Override
	public void off() {
		
		System.out.println("Switching Off TV with Old remote");
	}
	
	

}
