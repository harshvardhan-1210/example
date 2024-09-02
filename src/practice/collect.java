package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class collect {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(56);
		al.add(56);
		al.add(7);
		
		System.out.println(al.get(1));
		for(Object temp:al) {
			System.out.println(temp);
			
		}
		ArrayList<Integer> bl=new ArrayList<Integer>();
		bl.add(7990);
		bl.addAll(al);
		System.out.println(bl);
		
		System.out.println(bl.indexOf(56));
		bl.set(1, 0);
		for(int te:bl) {
			System.out.println(te);
		}
		System.out.println("the size of bl arrayList "+bl.size());
		
		Object[] list=bl.toArray();
		System.out.println(list);
		Collections.sort(bl);
		for(int temp1:bl) {
			System.out.println(temp1);
		}
		//set
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(75);
		hs.add(675);
		hs.add(434);
		for(int dup:hs) {
			System.out.println(dup);
		}
		//list to hashset
		HashSet<Integer> hs1=new HashSet<Integer>();
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		System.out.println(hs1.addAll(ls));
		System.out.println(hs1);
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("hihello");
		lhs.add("hellohi");
		System.out.println(lhs);
		//Map
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "harsha");
		hm.put(2, "sha");
		hm.put(3, "har");
		hm.put(4, "h");
		for(int i:hm.keySet()) {
			System.out.println(i);
		}
		for(HashMap.Entry b:hm.entrySet()) {
			
			
		}
		
		
		
		
		
	}

}
