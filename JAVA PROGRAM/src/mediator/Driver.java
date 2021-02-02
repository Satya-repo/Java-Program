package mediator;

public class Driver {

	
//	Mediator design pattern is one of the important and widely used behavioral 
//	design pattern. Mediator enables decoupling of objects by introducing a layer
//	in between so that the interaction between objects happen via the layer. 
//	If the objects interact with each other directly, the system components are
//	tightly-coupled with each other that makes higher maintainability cost and not
//	hard to extend. Mediator pattern focuses on providing a mediator between 
//	objects for communication and help in implementing lose-coupling between 
//	objects.
	public static void main(String[] args) {

		IATCMediator atcMediator = new Mediator();
		
        Flight sparrow101 = new Flight(atcMediator);
        
        Runway mainRunway = new Runway(atcMediator);
        
        atcMediator.registerFlight(sparrow101); 
        atcMediator.registerRunway(mainRunway); 
        sparrow101.getReady(); 
        
        mainRunway.land(); 
        
        sparrow101.land(); 
		
	}

}
