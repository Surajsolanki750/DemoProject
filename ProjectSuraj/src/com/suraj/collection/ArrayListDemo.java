package com.suraj.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Suraj");
		alist.add("Solanki");
		alist.add("Ratnagiri");
		alist.add("Thane");
		alist.add("Mumbai");
		
		for(String str: alist) {
			System.out.println(str);
		}
	}

}
