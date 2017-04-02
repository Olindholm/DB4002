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
	
	/**
	 * Reverses the order of all elements in the list.
	 * Returns the same (reference to the) list as provided.
	 * 
	 * @param l the list to be reversed
	 * @return returns the same list (now reversed order).
	 */
	public static <T> List<T> reverse(List<T> l) {
		/*
		 * Loops through half of all elements in the list.
		 * The c variable, is the complement of i.
		 * That being the reversed position, if i you count
		 * the number of steps (or indices) from the
		 * right-side of the list. Here's an example of a
		 * list with the size of five.
		 * 
		 * [A1, A2, A3, c(A1), c(A2)]
		 * 
		 * notice how A3 has no complement, thus does not
		 * need to be moved.
		 * 
		 */
		
		int size = l.size();
		for (int i = 0; i < size / 2; i++) {
			int c = size - (i+1);
			
			T a = l.get(i);
			T b = l.get(c);
			
			l.set(i, b);
			l.set(c, a);
		}
		
		return l;
	}
	
	// Start of program (assignement_2_2)
	public static void main(String[] args) {
		
		// Testing reverse method
		List<Integer> heltal = new ArrayList<>();
		heltal.addAll(Arrays.asList(1, 2, 3, 4, 5));

		List<Double> flyttal = new ArrayList<>();
		flyttal.addAll(Arrays.asList(1.25, 3.14, 9.7));
		
		List<String> campusLindholmen = new ArrayList<>();
		campusLindholmen.addAll(Arrays.asList("Saga", "Svea","Jupiter"));

		print(reverse(heltal));
		print(reverse(flyttal));
		print(reverse(campusLindholmen));
	}
}
