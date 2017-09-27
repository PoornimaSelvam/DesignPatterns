package behavioral.iteratorPattern.anotherExample.model;

public interface ChannelCollection {
	void addChannel(Channel c);
	
	void removeChannel(Channel c);
	
	ChannelIterator iterator(ChannelTypeEnum type);
	
	public enum ChannelTypeEnum
	{
		ENGLISH, HINDI, KANNADA, ALL, NONE;
	}
}
