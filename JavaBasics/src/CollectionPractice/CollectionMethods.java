package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) {
		
		
		Collection<Integer> cl =new ArrayList<>();
		cl.add(44);
		cl.add(33);
		cl.addAll(cl);
		cl.add(11);
		System.out.println(cl);
		
		Collection<Integer> cl1 =new ArrayList<>();
		cl1.add(90);
		cl1.add(687);
		System.out.println(cl1);
		cl1.addAll(cl);
		System.out.println(cl1);
		
		boolean bl = cl.contains(0);
		System.out.println(bl);
		boolean bl2 = cl1.containsAll(cl);
		System.out.println(bl2);
		
		cl.remove(33);
		System.out.println(cl);
		cl.removeAll(cl1);
		System.out.println(cl1);
		System.out.println(cl);
		
		boolean bl3 = cl.isEmpty();
		System.out.println(bl3);
		
		cl.add(11);
		System.out.println(cl);
		
		cl.clear();
		System.out.println(cl);
		
		boolean bl4=cl.equals(cl1);
		System.out.println(bl4);
		System.out.println(cl);
		System.out.println(cl1);
		
		Iterator<Integer> it = cl1.iterator();
		boolean blit = it.hasNext();//boolean
		System.out.println(blit);
		//it.next();//Object
		
		while(blit == true) {
			System.out.println(cl1);
			it.next();
		}

	}

}
