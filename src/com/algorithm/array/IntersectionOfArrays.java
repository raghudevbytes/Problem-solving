package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;
//intersection of 2 arrays
//intersection - > only common elements from 2 arrays
public class IntersectionOfArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1,2, 3, 4,4, 5,6 };
		int[] arr2 = { 2,3,4,4,5,6 };
		intersectionOfArrays(arr1,arr2);
		intersectionOfArraysWithoutDublicates(arr1,arr2);
	}
	
	private static void intersectionOfArrays(int[] arr1, int[] arr2) {
		List<Integer> list  = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		while(i<arr1.length && j<arr2.length) {
			//if element present in both array, then we add that element to the list
			//else moving pointer
			if(arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			}else if (arr1[i] < arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
		System.out.println(list);
		
	}
	private static void intersectionOfArraysWithoutDublicates(int[] arr1, int[] arr2) {
		List<Integer> list  = new ArrayList<>();
		int i = 0;
		int j = 0;
		int lastInsertedValue = 0;
		
		while(i<arr1.length && j<arr2.length) {
			//if element present in both array and lastinserted value should not equal to inserting value
			//,then we add that element to the list 
			//else moving pointer
			if(arr1[i] == arr2[j] && lastInsertedValue !=arr1[i]) {
				list.add(arr1[i]);
				lastInsertedValue = arr1[i];
				i++;
				j++;
			}else if (arr1[i] <= arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
		System.out.println(list);
		
	}
}
