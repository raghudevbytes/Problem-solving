package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

//Finding union of 2 arrays
//union -> unique elements
//here we are finding unique elements from 2 arrays
public class UnionOfArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1,2, 3, 4, 5 };
		int[] arr2 = { 2,3,4,4,5,6 };

		unionOfArrays(arr1, arr2);
	}

	private static void unionOfArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = 0;
		int j = 0;
		//save lastinserted value to check with inserting elements
		int lastInsertedValue = 0;
		List<Integer> list = new ArrayList<>();
		//base condition
		while (i < n1 && j < n2) {
			//put smallest element to the list
			if (arr1[i] <= arr2[j]) {
				//first time list will be zero that time this condition zero
				//second time onwards, checking if lastInsertedValue doesn't equal to inserting elements
				if (list.size() == 0 || lastInsertedValue != arr1[i]) {
					list.add(arr1[i]);
					lastInsertedValue = arr1[i];
				}
				i++;
			} else {
				if (list.size() == 0 || lastInsertedValue != arr2[j]) {
					list.add(arr2[j]);
					lastInsertedValue = arr2[j];
				}
				j++;
			}
		}
		//if one loop iteration done then other loop elements has elements
		while(i<n1) {
			if(lastInsertedValue != arr1[i]) {
				list.add(arr1[i]);
			}
			i++;
		}
		while(j<n2) {
			if(lastInsertedValue != arr2[j]) {
				list.add(arr2[j]);
			}
			j++;
		}
		System.out.println(list);

	}
}
