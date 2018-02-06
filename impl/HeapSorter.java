package impl;

import java.util.Comparator;


/**
 * HeapSorter.java
 *
 * Class to implement the heapsort algorithm.
 *
 * @author Thomas VanDrunen
 * CSCI 345, Wheaton College   
 * Originally for CSCI 245, Spring 2007
 * Revised June 2, 2016
 */

public class HeapSorter extends Heap<Integer> {


	
    /**
     * Constructor. Take an array an sets it up as a (max-) heap.
     * @param internal The array to be used for the internal representation.
     */
    private HeapSorter(int[] array) {
		internal = new Integer[array.length];
		for (int i = 0; i < array.length; i++)
			internal[i] = array[i];
		heapSize = array.length;
		
		compy = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		for(int i = 0; i < heapSize; i++) {
			
			super.sinkKeyAt(i);
		}

    }
    
    /**
     * Sort this array, in place.
     * @param array The array to sort.
     */
    public static void sort(int[] array) {

		HeapSorter heap = new HeapSorter(array);

		// insert code for completing the heap sort algorithm,
		// with post condition that heap.internal is sorted

		// copy elements from internal (now sorted) back to array
		for (int i = 0; i < array.length; i++)
			array[i] = heap.internal[i];

    }

}
