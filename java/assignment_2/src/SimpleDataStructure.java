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
	 * Appends one of your friends to your friends' list.
	 * 
	 * @param str the name of your friend.
	 */
	public void add(String str) {
		if (friends.length == counter) {
			friends = Arrays.copyOf(friends, friends.length * 2);
		}
		
		friends[counter++] = str;
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
