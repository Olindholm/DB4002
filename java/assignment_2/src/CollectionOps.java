/*
 * Copyright 2017 (C) Osvald Lindholm
 *
 * This file is the result of the assignments given
 * by the Algoritmer och datastrukturer (DB4002)
 * course at Halmstad University.
 *
 */

import java.util.*;

public class CollectionOps {
	/**
	 * Prints a collection of any type into the console,
	 * using each element's toString() method.
	 * 
	 * @param l the list of elements to be printed.
	 */
	public static <T> void print(Collection<T> l) {
		StringBuilder sb = new StringBuilder("[");
		
		for (T t : l) {
			sb.append(t.toString());
			sb.append(", ");
		}
		
		int length = sb.length();
		sb.replace(length - 2, length, "]");
		System.out.println(sb.toString());
	}
	
	// Start of program (assignement_2_2)
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Kalle");
		list.add("Thomas");
		list.add("Ludwig");
		list.add("Johannes");
		list.add("Linus");
		list.add("Jacob");
		list.add("Noa");
		list.add("Johan");
		
		print(list);
	}
}
