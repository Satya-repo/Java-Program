package Iterator;

public class Driver {

	public static void main(String[] args) {
		
		// Iterator iterator = new IteratorRepository().getIterator();
		Container container = new IteratorRepository();
		Iterator iterator = container.getIterator();		
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
			 
		 }

	}

}
