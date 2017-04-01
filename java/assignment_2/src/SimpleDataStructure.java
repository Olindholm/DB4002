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
	private String[] friends = new String[2];
	private int counter = 0;
	
	/**
	 * Adds a name to the friends-list.
	 * Ensures the list is in alphabetical order.
	 * 
	 * @param name the name to be added.
	 */
	public void addSort(String name) {
		this.add(name);
		this.sort();
	}
	
	/**
	 * Sorts the list in alphabetical order.
	 */
	public void sort() {
		for (int i = 0; i < (counter - 1); i++) {
			String a = friends[i];
			String b = friends[i + 1];
			
			if (a.toLowerCase().compareTo(b.toLowerCase()) > 0) {
				friends[i] = b;
				friends[i + 1] = a;
				i = (i == 0) ? (i - 1) : (i - 2);
			}
			
			this.printFriends();
		}
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

	/**
	 * Removes the first occurrence of you friends name.
	 * Returns true if successful, false if the name was not found.
	 * 
	 * @param name the name to be removed.
	 * @return returns true if successful, false if the name was not found.
	 */
	public boolean remove(String name) {
		for (int i = 0; i < counter; i++) {
			if (friends[i].equalsIgnoreCase(name)) {
				counter--;
				
				/*
				 * If the friend's name is found, remove it.
				 * This is accomplished by shifting all names
				 * in the latter of the array one step back/lower.
				 * This leaves one friends name being duplicated in
				 * the end, no worries. It cannot be accessed and
				 * will be overridden if a new friend's name is added.
				 */
				for (int j = i; j < counter; j++) {
					friends[j] = friends[j + 1];
				}
				
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
		
		myfriends.sort();
		
		myfriends.printFriends();
	}
}
