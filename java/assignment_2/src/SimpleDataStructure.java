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
	private String[] friends;
	private int counter;

	public SimpleDataStructure() {
		friends = new String[2];
		counter = 0;
	}

	/**
	 * Appends one of your friends to your friend-list.
	 * 
	 * @param str the name of your friend.
	 */
	public void add(String str) {
		if (friends.length == counter) {
			friends = Arrays.copyOf(friends, friends.length * 2);
		}
		
		friends[counter++] = str;
	}
	
	/**
	 * Returns the name at the given index,
	 * provided it exists, else returns null.
	 * 
	 * The index must be a natural number (including zero),
	 * and must not be larger than the friends-list.
	 * 
	 * @param index the index of the friend's name.
	 * @return returns the name at the given index if it exists, else null.
	 */
	public String get(int index) {
		if (index >= 0 && index < counter) {
			return friends[index];
		}
		
		return null;
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
		
		/*
		 * Now I will be able to add all of my friends!
		 * Without having to worry that the program will crash!
		 * or...
		 */
		SimpleDataStructure myfriends = new SimpleDataStructure();
		myfriends.add("Kalle");
		myfriends.add("Thomas");
		myfriends.add("Ludwig");
		myfriends.add("Johannes");
		myfriends.add("Linus");
		myfriends.add("Jacob");
		myfriends.add("Noa");
		myfriends.add("Johan");
		
		myfriends.printFriends();
	}
}
