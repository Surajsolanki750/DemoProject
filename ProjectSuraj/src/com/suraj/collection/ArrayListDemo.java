package com.suraj.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Suraj");
		alist.add("Solanki");
		alist.add("Ratnagiri");
		alist.add("Thane");
		alist.add("Mumbai");

		Iterator<String> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
