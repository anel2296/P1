package approach;

import java.util.ArrayList;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import p1MainClasses.FilesGeneratorMain;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P1P2<E> extends AbstractIntersectionFinder<E> implements IntersectionFinder<E> {

	public P1P2(String name) {
		super(name);
	}
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
			MySet<E> tmp = (MySet<E>)new ArrayList();
			for (int i=0;i<50;i++) {
				for(MySet<E> e:t) {
					if(e == t[i]) {
						tmp.remove((E) e);
					}
				}
				}
		return tmp;
	}	
	}
