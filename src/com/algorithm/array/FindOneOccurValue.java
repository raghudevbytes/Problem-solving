package com.algorithm.array;

//find only one time occurrence value
public class FindOneOccurValue {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,4}; //here apart from 2, all numbers occurred twice
		findOneOccurenceValue(arr);
	}

	private static void findOneOccurenceValue(int[] arr) {
		int num=0;
		//by using XOR, we can find out easily
		// a^a = 0;
		for (int i = 0; i < arr.length; i++) {
			num = num ^ arr[i]; 
		}
		System.out.println("Occurred once : "+num);
		
	}
}
