package Bridge;

public class Philips extends TV {

	Remote remoteType;
	public Philips(Remote remote) {
		//super(remote);
		this.remoteType = remote;
	}
	@Override
	void on() {
		System.out.println("PHILIPS TV ONN");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.println("PHILIPS  TV OFF");
		remoteType.off();
	}

}
