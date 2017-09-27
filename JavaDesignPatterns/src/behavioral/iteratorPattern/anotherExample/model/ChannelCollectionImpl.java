package behavioral.iteratorPattern.anotherExample.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	
	private List<Channel> channels = new ArrayList<Channel>();

	@Override
	public void addChannel(Channel c) {
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl();
	}
	
	private int getLength(){
		return channels.size();
	}
	
	//private Inner class
	private class ChannelIteratorImpl implements ChannelIterator
	{
		private int index;
		
		@Override
		public boolean hasNext() {
			if(index < getLength())
			{
				return true;
			}
			return false;
		}

		@Override
		public boolean hasPrev() {
			if(index > 0){
				return true;
			}
			return false;
		}

		@Override
		public Channel next()
		{
			if (hasNext())
			{
				return channels.get(index++);
			}
			throw new RuntimeException("No more elements to display");
		}

		@Override
		public Channel prev()
		{
			if (hasPrev())
			{
				return channels.get(--index);
			}
			throw new RuntimeException("This is the first element. No prev element"); 
		}

		@Override
		public Channel first()
		{
			index = 0;
			return channels.get(index);
		}

		@Override
		public Channel last()
		{
			index = channels.size() - 1;
			return channels.get(index);
		}

		@Override
		public void add(final Channel t)
		{
			if (hasNext())
			{
				channels.add(index - 1, t);
			}
			else
			{
				channels.add(t);
			}
			++index;
		}

		@Override
		public void remove(final Channel t)
		{
			if (channels.contains(t))
			{
				channels.remove(t);
			}
			else
			{
				throw new RuntimeException("No matching channel found");
			}
		}
		
		@Override
		public void remove()
		{
			if (index > 0)
			{
				channels.remove(index - 1);
			}
			
			throw new RuntimeException("No channels to remove");
		}
		
	}

}
