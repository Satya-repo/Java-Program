package facade;

public class ShapeMaker {
	
	Circle circle;
	Square square;
	Rectangle rectangle;
	public ShapeMaker() {
		
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
		
	}
	
	public void drawCircle() {
		
		circle.draw();
		
	}
	
	public void drawSquare() {
			
			square.draw();
			
		}
	
	public void drawRectangle() {
		
		rectangle.draw();
	}
	
	
	
	

}
