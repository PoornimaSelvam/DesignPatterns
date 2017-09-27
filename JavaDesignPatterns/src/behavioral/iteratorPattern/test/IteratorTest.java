package behavioral.iteratorPattern.test;

import behavioral.iteratorPattern.model.Container;
import behavioral.iteratorPattern.model.Iterator;
import behavioral.iteratorPattern.model.NameRepository;

public class IteratorTest {
	public static void main(String[] args) {
		Container<String> names = new NameRepository();
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next() + ",");
		}
		
		// will throw exception if next is done.
		// System.out.println(it.next());

		// REMOVE operation
		System.out.println();
		// it = names.iterator();
		it.reset();
		
		while (it.hasNext()) {
			String name = it.next();
			if (name != null && name.contains("Chet")) {
				it.remove();
			}
		}
		// it.remove();

		System.out.println();
		it.reset();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}

		// ADD operation
		System.out.println();
		it.reset();
		while (it.hasNext()) {
			String name = it.next();
			if (name != null && name.contains("Kir")) {
				it.add("Chetna");
			}
		}

		System.out.println();
		it.reset();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
	}
}
