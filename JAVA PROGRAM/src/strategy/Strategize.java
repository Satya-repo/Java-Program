package strategy;

public class Strategize implements Strategy {
	
	public Strategy strategy;

	public Strategize(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	@Override
	public int doOperation(int a, int b) {
		
		int x =  strategy.doOperation(a, b);
		System.out.println(x);
		return x;
		
	}
	
	
	

}
