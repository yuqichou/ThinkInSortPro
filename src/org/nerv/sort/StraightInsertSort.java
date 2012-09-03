/*
 * @author kevin
 * @version  2012-3-16
 */
package org.nerv.sort;




/**
 * 直接插入排序
 * @author kevin 
 * @version 2012-3-16  下午08:58:26
 */
public class StraightInsertSort implements Sortable<Integer> {

	@Override
	public Integer[] sort(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			//把最末位的元素放入临时变量里
			int temp=array[i];
			int j=i;
			for (; j >0 && temp<array[j-1]; j--) {
				array[j]=array[j-1];
			}
			array[j]=temp;
		}
		return array;
	}
	
}
