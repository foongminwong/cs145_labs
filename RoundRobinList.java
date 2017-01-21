package lab010;

import java.util.ArrayList;

public class RoundRobinList {
	ArrayList<String> list;
	private int index = 0;

	public RoundRobinList() {
		list = new ArrayList<String>();// initialize array to be empty
	}

	public int size() {
		return list.size();
	}

	public void add(String stringToBeAdded) {
		list.add(stringToBeAdded); // add to the end of list
	}

	public String get() {
		
		index = (index + size() - 1) % size(); //mygod
		// 2 for size of 3, 3 for size of 4
		// the index will keep updating here
		return list.get(index);
	}

	// can't work
	/*
	 * ListIterator<String> listIterator = list.listIterator(); return
	 * list.get(listIterator.nextIndex());
	 */

	/*
	 * Iterator<String> iterator = list.iterator(); while (iterator.hasNext()) {
	 * System.out.println(iterator.next()); }
	 */

}
