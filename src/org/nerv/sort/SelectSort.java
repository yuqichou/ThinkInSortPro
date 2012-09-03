/*
 * @author kevin
 * @version  2012-3-21
 */
package org.nerv.sort;

/**
 * @author kevin 
 * @version 2012-3-21  下午08:21:51
 */
public class SelectSort implements Sortable<Integer>{

//	1 12 19 8 34 7 8 4 2
//	1 2 12 19 34 8 7 4
	
	
	@Override
	public Integer[] sort(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex=i;
			for (int j = i; j < array.length; j++) {
				if(array[minIndex]>array[j]){
					minIndex=j;
				}
			}
			int temp=array[i];
			array[i]=array[minIndex];
			array[minIndex]=temp;
		}
		return array;
	}
	
}
