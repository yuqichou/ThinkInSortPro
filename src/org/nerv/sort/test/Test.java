/*
 * @author kevin
 * @version  2012-3-16
 */
package org.nerv.sort.test;

import java.util.Arrays;

import org.nerv.sort.SelectSort;
import org.nerv.sort.Sortable;

/**
 * @author kevin 
 * @version 2012-3-16  下午08:19:00
 */
public class Test {
	
	public static int i=10;
	
	/**
	 * @author kevin
	 * @param args
	 * @version 2012-3-16  下午08:19:00
	 */
	public static void main(String[] args) {
		Integer[] array={12,11,10,9,
						 8,546, 7, 6,5,
						 4,3, 2,1};
		
		
//		Sortable<Integer> sort=new BubbleSort();
		Sortable<Integer> sort=new SelectSort();
		
		sort.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
