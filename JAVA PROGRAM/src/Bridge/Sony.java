package Bridge;

public class Sony extends TV {

	Remote remoteType;
	
	public Sony() {
	
	}
	
	public Sony(Remote remote) {
		//super(remote);
		this.remoteType = remote;
	}

	@Override
	void on() {
		System.out.println("SONY TV ONN");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.println("SONY TV OFF");
		remoteType.off();
	}
	
	

}
