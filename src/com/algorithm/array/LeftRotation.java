package com.algorithm.array;

import java.util.Arrays;

//Rotate array elements
// move elements from left to right based on rotation count
public class LeftRotation {
	public static void main(String[] args) {
			int[] arr = new int[] {1,2,3,4,5,6,7};
			//leftRotateArray(arr);
			leftRotateArrayOptimalSolution(arr,3);
	}
	static void leftRotateArray(int arr[]) {
		//single rotation so, saved first element into temp
		int temp = arr[0];
		//shifting elements to left one position
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				arr[i]= temp;
			else
				arr[i]= arr[i+1];
		}
		//for (int j : arr)
		//	System.out.printf("%d,",j);
	}
	
	//reverse the array
	//1. 0 to position
	//2. position to n
	//3. 0 to n
	static void leftRotateArrayOptimalSolution(int[] arr,int pos) {
		//1
		rotateArray(arr,0,pos-1);
		//2
		rotateArray(arr,pos,arr.length-1);
		//3
		rotateArray(arr, 0, arr.length-1);
		for (int i:arr)
			System.out.println(i);
		
	}
	//reversing array elements
	private static void rotateArray(int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
}
