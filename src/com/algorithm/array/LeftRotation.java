package com.algorithm.array;

//Rotate array elements
// move elements from rigth to left based on rotation count
public class LeftRotation {
	public static void main(String[] args) {
			int[] arr = new int[] {1,2,3,4,5};
			leftRotateArray(arr);
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
		for (int j : arr)
			System.out.printf("%d,",j);
	}
}
