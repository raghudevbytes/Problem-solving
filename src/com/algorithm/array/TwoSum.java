package com.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//finding 2 sum
public class TwoSum {
	
	public static void main(String[] args) {
		int[] arr = {2,5,6,8,4};
		int sum = 14;
		
		betterSolution2SumWithMap(arr, sum);
		betterSolution2SumWithoutMap(arr, sum);
	}
	//without using map, to find the index of the two sum elements difficult and also not recommended
	private static void betterSolution2SumWithoutMap(int[] arr, int sum) {
		Arrays.sort(arr);
		int i= 0;
		int j = arr.length-1;
		//used greedy approach, moving the pointer based on the elements sum
		while(i<j) {
			int eleSum = arr[i]+arr[j];
			if(eleSum > sum) {
				j--;
			}else if (eleSum<sum) {
				i++;
			}else {
				System.out.println("found elements : "+arr[i]+"-"+arr[j]);
				break;
			}
		}
		
	}
//by using map we can easily find the index of the elements of 2 sum
	private static void betterSolution2SumWithMap(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0;
		int j = -1;
		while(i<arr.length) {
			//find the required number for the resultSum of the current element
			int reqNum = sum-arr[i];
			//checking required number is present in map
			if(map.containsKey(reqNum)) {
				j = map.get(reqNum);
				break;
			}else {
				//if the required number is not present in map, put the current element to the map with index
				map.put(arr[i], i);
			}
			i++;
		}
		System.out.printf("start : %d, end : %d", j,i);
	}
}
