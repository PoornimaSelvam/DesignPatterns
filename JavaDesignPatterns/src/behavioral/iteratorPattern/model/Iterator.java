package behavioral.iteratorPattern.model;

public interface Iterator<T> {
	boolean hasNext();
	T next();
	void remove();
	void add(T t);
	void reset();
}
