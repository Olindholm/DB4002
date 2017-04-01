import java.util.Iterator;
public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private AnyType [] list;
	private int count;

	public MyArrayList() {
		list= (AnyType []) new Object[10 ];
		count=0;
	}

	public MyArrayList(int initialCapacity) {
		list =(AnyType [])new Object[initialCapacity];
	}

	/*Appends the specified element to the end of this list.*/

	public boolean add(AnyType o) {

		return true;
	}

	/** tests if the specified element is a component of this list*/
	public boolean contains(AnyType o) {
		return true;

	}
	/** returns the component at the specified index*/
	public AnyType get(int index) {
		return null;
	}

	/** Search for the first occurrence of the given argument testing for the equality using
equals method*/
	public int indexOf(AnyType o) {
		return -1;
	}
	/** tests if this list has no components*/
	public boolean isEmpty() {
		return true;
	}
	/** removes the first occurrence of the specified element in this list
if the list contains the */
	public boolean remove(AnyType o) {
		return true;
	}
	/** returns the number of components in this list*/
	public int size() {
		return -1;
	}
	/** returns an array containing all elements in this list in the correct order*/
	public Object [] toArray() {
		return null;
	}

	public Iterator<AnyType> iterator() {
		// return object ArrayListIterator 
		return null;
	}

}
