package behavioral.iteratorPattern.anotherExample.model;

public interface ChannelIterator {
	boolean hasNext();
	boolean hasPrev();
	Channel next();
	Channel prev();
	Channel first();
	Channel last();
	void add(Channel t);
	void remove(Channel t);
	void remove();
}	
