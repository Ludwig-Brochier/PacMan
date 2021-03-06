package state;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Characters implements List<MobileElement> {
	
	private List<MobileElement> chars;
	
	public Characters() {
		chars = new ArrayList<>();
	}
	
	public List<MobileElement> get(int x, int y){
		List<MobileElement> list = new ArrayList<>();
		for (MobileElement me : chars) {
			if (me.getX() == x && me.getY() == y) {
				list.add(me);
			}
		}
		return list;
	}
	
	public List<MobileElement> getChars(){
		return chars;
	}
	
	@Override
	public int size() {
		return chars.size();
	}

	@Override
	public boolean isEmpty() {
		return chars.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return chars.contains(o);
	}

	@Override
	public Iterator<MobileElement> iterator() {
		return chars.iterator();
	}

	@Override
	public Object[] toArray() {
		return chars.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return chars.toArray(arg0);
	}

	@Override
	public boolean add(MobileElement e) {
		return chars.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return chars.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return chars.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends MobileElement> c) {
		return chars.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends MobileElement> c) {
		return chars.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return chars.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return chars.retainAll(c);
	}

	@Override
	public void clear() {
		chars.clear();
	}

	@Override
	public MobileElement get(int index) {
		return chars.get(index);
	}

	@Override
	public MobileElement set(int index, MobileElement element) {
		return chars.set(index, element);
	}

	@Override
	public void add(int index, MobileElement element) {
		chars.add(index, element);
	}

	@Override
	public MobileElement remove(int index) {
		return chars.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return chars.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return chars.lastIndexOf(o);
	}

	@Override
	public ListIterator<MobileElement> listIterator() {
		return chars.listIterator();
	}

	@Override
	public ListIterator<MobileElement> listIterator(int index) {
		return chars.listIterator(index);
	}

	@Override
	public List<MobileElement> subList(int fromIndex, int toIndex) {
		return chars.subList(fromIndex, toIndex);
	}
}
