package com.algorithm.array;

import java.util.HashSet;

// remove duplicates has 2 solutions
//1. By using HashSet, best when array is sorted or not
//2. By using Slow pointer for in-palce sort, best when array is sorted
public class RemoveDublicates {
	public static void main(String[] args) {
		int[]  arr = new int[] {1,1,2,2,2,3,3};
		byUsingHashSet(arr);
		byUsiongSlowPointer(arr);
	}
	static void byUsingHashSet(int[]  arr ) {
		var set = new HashSet<>();
		for(int ele : arr) {
			set.add(ele);
		}
		System.out.println(set);
	}
	static void byUsiongSlowPointer(int[] arr) {
		//initialize i with 0th index, first element always unique
		int i=0;
		//we are moving j from 1st index and check previous elements
		for(int j=1;j<arr.length;j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		for(int k =0; k<=i;k++) {
			System.out.printf("%d,",arr[k]);
		}
	}
}
