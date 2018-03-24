package approach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P4<E> extends AbstractIntersectionFinder<E> implements IntersectionFinder<E>{

	public P4(String name) {
		super(name);
	}
	
	private HashMap<E, E> elements; 

	HashMap<E, Integer> map = new HashMap<>(); 

	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		MySet<E> tmp = (MySet<E>)new ArrayList();
		
				for (MySet<E> e:t) { 
				     Integer c = map.getOrDefault(e, 0); 
				     map.put((E) e, c+1); 
				}
		for (Map.Entry<E, Integer> entry : map.entrySet())
		     if (entry.getValue() == t.length) 
		        tmp.add(entry.getKey());
		return tmp; 
	}
}


	
