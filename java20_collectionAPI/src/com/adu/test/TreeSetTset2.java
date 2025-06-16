package com.adu.test;

import java.util.Set;
import java.util.TreeSet;

/*
 * 	Collection
 * 		|
 * 	      Set
 * 		   |
 * 		  SortedSet
 * 			  |
 * 			 TreeSet(중복 X, 순서 X, 정렬 o)
 * 
 * */
public class TreeSetTset2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
//		set.add("BBB");
//		set.add("FFF");
//		set.add("AAA");
//		set.add("QQQ");
//		set.add("AAA");
//		set.add("BBB");
//		System.out.println(set);
		
		set.add(11);
		set.add(3);
		set.add(90);
		set.add(2);
		set.add(90);
		System.out.println(set.size());
		System.out.println(set.higher(3));
		System.out.println(set.lower(3));
		System.out.println(set.headSet(11));
		System.out.println(set.tailSet(3));
		
	}

}
