/*
 * Copyright 2017 (C) Osvald Lindholm
 *
 * This file is the result of the assignments given
 * by the Algoritmer och datastrukturer (DB4002)
 * course at Halmstad University.
 *
 */

import java.util.*;

public class SimpleDataStructure {
	private String [] friends;
	private int counter;

	public SimpleDataStructure() {
		friends = new String[5];
		counter = 0;
	}

	/* Appends the other friend name to the end of this list. */
	public boolean add(String other){
		friends[counter] = other;
		counter++;
		return true;
	}

	/** returns the name at the specified index*/
	public String get(int index) {
		return friends[index];
	}

	/** removes the first occurrence of the specified element in this list if the list contains the name */
	public boolean remove(String name) {
		for (int i = 0; i < counter; i++) {
			if (friends[i].equals(name)) {
				friends[i] = null;
				return true;
			}
		}

		return false;
	}

	/**
	 * Prints the names of all your friends.
	 */
	public void	printFriends() {
		for (int i = 0; i < counter; i++) {
			System.out.print(friends[i] + " ");
		}

		System.out.println();
	}
	
	// Start of program!
	public static void main(String [] arg) {
		SimpleDataStructure myfriends = new SimpleDataStructure();
		myfriends.add("Kalle");
		myfriends.printFriends();
	}
}
