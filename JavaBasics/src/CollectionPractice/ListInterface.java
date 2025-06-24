package CollectionPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListInterface {

	public static void main(String[] args) {
		
		
		//It is an Interface. It allow duplicates. It follows insertion order. It is index based.
		
		//ArrayList : It present in java.util.ArrayList; package. Deletion and Insertion is worst.
		
/*		List<Integer> li = new ArrayList<Integer>();
		li.add(55);
		li.add(44);
		li.addAll(2, li);
		li.remove(0);
		System.out.println(li);
		li.addFirst(10);
		li.addLast(10);
		System.out.println(li);
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		boolean b1 = li.contains(55);
		
		
		System.out.println(li);
		System.out.println(b1);
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.addAll(li);
		li1.removeAll(li);
		boolean b2 = li1.containsAll(li);
		li1.add(33);
		System.out.println(b2);
		System.out.println(li1);
		
*/		
		
		
		//LinkedList : It present in java.util.LinkedList; package. Deletion and Insertion is Best.
		
		String [] names = {"Aravindhan","Ravi","Ravi","Aravindhan"};
		
		
		List<String> li2 = new LinkedList<String>();
		li2.addAll(Arrays.asList(names));
		System.out.println(li2);
		
		Set<String> se = new HashSet<String>();
		se.addAll(Arrays.asList(names));
		System.out.println(se);
		
		boolean b2 = se.contains(se);
		System.out.println(b2);
		
		Set<Object> se1 = new TreeSet<>();
		se1.addAll(se);
		
		System.out.println(se1);
		
	}

}
