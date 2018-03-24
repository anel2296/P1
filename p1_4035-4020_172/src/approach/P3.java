package approach;

import java.util.ArrayList;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P3<E> extends AbstractIntersectionFinder<E> implements IntersectionFinder<E> {

	public P3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		MySet<E> tmp = (MySet<E>)new ArrayList();
		for (int i=0;i<50;i++) {
			for(MySet<E> e:t) {
				if(e == t[i]) {
					tmp.add((E) e);
				}
			}
		}
		
		return tmp;
	}

}
