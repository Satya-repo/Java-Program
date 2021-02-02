package Bridge;

public class Driver {

	public static void main(String[] args) {
		
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.on();

		TV philipsOldRemote = new Philips(new OldRemote());
		philipsOldRemote.on();
	}

}
