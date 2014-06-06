package misterx.model.gameitems.collections;

import java.util.Collection;
import java.util.Iterator;

import misterx.model.gameitems.GameItem;



public interface GameItemList<E extends GameItem> extends GameItem, Iterable<E> {
	
	public boolean add(E gameItem);
	
	public boolean addAll(Collection<E> gameItemCollection);
	
	public boolean remove(E gameItem);
	
	public int size();
	
	public Iterator<E> iterator();

}
