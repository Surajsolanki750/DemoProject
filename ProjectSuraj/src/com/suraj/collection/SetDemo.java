package com.suraj.collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(6);
		set.add(5);
		set.add(6);

		for(Integer i:set) {
			System.out.println(i);
		}
	}

}
