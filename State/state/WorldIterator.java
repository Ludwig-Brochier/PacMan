package state;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WorldIterator implements Iterator<StaticElement> {
	
	private World world;
	public World getWolrd() {
		return world;
	}
	
	private int x;
	public int getX() {
		return x;
	}
	
	private int y;
	public int getY() {
		return y;
	}
	
	public WorldIterator(World world) {
		this.world = world;
		this.x = -1;
		this.y = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (x + 1 < world.getWidth()) {
			return true;
		}
		if (y + 1 < world.getHeight()) {
			return true;
		}
		return false;
	}

	@Override
	public StaticElement next() {
		if (x + 1 < world.getWidth()) {
			x++;
		}
		else if (y + 1 < world.getHeight()) {
			x = 0;
			y++;
		}
		else {
			throw new NoSuchElementException();
		}
		return world.get(x, y, Direction.NONE);
	}
	
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet");
	}
}
