package behavioral.iteratorPattern.model;

import java.util.Arrays;

/**
 * Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
 * 
 * The key idea is to take the responsibility for access and traversal out of the aggregate object
 * and put it into an Iterator object that defines a standard traversal protocol.
 * 
 * eg. all implementations of java.util.Iterator 
 */
public class NameRepository implements Container<String> {

	private static String[] names = {"Poornima", "Chetna", "Kiran", "Selvam", "Indrani"};
	
	@Override
	public Iterator<String> iterator() {
		return new NameIterator();
	}
	
	private int getLength(){
		return names.length;
	}
	
	private class NameIterator implements Iterator<String> 
	{
		int index;
		
		@Override
		public boolean hasNext() {
			if(index < getLength()){
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return names[index++];
			}
			throw new RuntimeException("No more elements to display");
		}

		@Override
		public void remove() {
			if(this.hasNext()){
				names = Arrays.stream(names).filter(e -> e != names[index - 1]).toArray(String[]::new);
				//java 7
				/*String[] names2 = new String[names.length-1];
				String nameRem = names[index-1];
				int i = 0;
				for(String name: names){
					if(name != nameRem){
						names2[i++] = name;
					}
				}
				names = names2;*/
			}
			else{
				throw new RuntimeException("Cannot be removed");
			}
		}

		@Override
		public void add(String t) {
			if (this.hasNext())
			{
				String[] namesDup = Arrays.copyOf(names, getLength() + 1);
				for (int i = (index - 1); i < getLength(); i++)
				{
					namesDup[i + 1] = names[i];
				}
				namesDup[index - 1] = t;
				names = namesDup;
				++index;
			}
			else
			{
				names[0] = t;
			}
		}

		@Override
		public void reset() {
			index = 0;
		}
		
	}

}
