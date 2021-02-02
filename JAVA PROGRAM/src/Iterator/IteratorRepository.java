package Iterator;

public class IteratorRepository implements Container {

	@Override
	public Iterator getIterator() {
		return new MyIterator();
	}
	
	private class MyIterator implements Iterator{
		
		String str[] = {"satya","tanima","samir","anni"};
		int index = 0;
		@Override
		public boolean hasNext() {
			
			if(index < str.length)
			return true;
			else {
				return false;
			}
		}

		@Override
		public Object next() {
			return str[index++];
		}
	
}

}
