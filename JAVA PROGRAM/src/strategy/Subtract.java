package strategy;

public class Subtract implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		
		return a-b;
	}

}
