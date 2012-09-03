package org.nerv.sort;

public class BubbleSort implements Sortable<Integer>{
	
	@Override
	public Integer[] sort(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j =0; j <array.length-i-1; j++) {
				if(array[j]>array[j+1]){
					Integer temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	
}
