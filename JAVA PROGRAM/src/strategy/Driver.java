package strategy;

public class Driver {

	public static void main(String[] args) {
		
		Strategize strategize = new Strategize(new Add());
		strategize.doOperation(12, 22);

	}

}
