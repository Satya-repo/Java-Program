package flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Flyweight {
	
	public static void main(String[] args) {
		String[] colors  = {"red","blue","green"};
		for(int i=0;i <20 ;i++) {
			
			Random random = new Random();
			int index  = random.nextInt(colors.length-1);
			String myColor = colors[index];
			
			System.out.println(myColor);
			
			Shape myShape = Shape.getInstance(myColor);
			System.out.println(myShape.hashCode());
		}
	}
}

class Shape{
	static Map<String,Shape> myMap = new HashMap();
	public static Shape getInstance(String colors) {
		
		
		 
		
		if(myMap.containsKey(colors)) {
			//System.out.println(1111);
			return myMap.get(colors);
		}
		else {
			myMap.put(colors, new Shape());
			Shape s = myMap.get(colors);
			//System.out.println("   vreation of "+s.hashCode());
			return s;
		}
	}
}
