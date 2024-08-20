package com.algorithm.array;

// Move zeros to right end
//its example of slow 2 pointer problem
public class MoveZerosAtEnd {
	public static void main(String[] args) {
		int[] arr = {1,0,2,3,2,0,0,4,5,1};
		moveZerosAtEndByReverseArrayPattern(arr);
	}
	static void moveZerosAtEndByReverseArrayPattern(int[] arr) {
		int j = -1;
		//first need to find the first occurrence of zero, set to in the j 
		for (int i=0;i<arr.length;i++) {
			if(arr[i] ==0) {
				j=i;
				break;
			}
		}
		//we are going to start from j+1 and we knows where zero start 
		//from that we will swap 
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i] !=0) {
				arr[j]=arr[i];
				arr[i]=0;
				j++;
			}else
				i++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//simulation
		//1 : {1,0,2,3,2,0,0,4,5,1} j=1
		//from second loop start
		//2 : {1,0,2,3,2,0,0,4,5,1} j=1, i= 2 (j+1) => swap: {1,2,0,3,2,0,0,4,5,1}
		//2 : {1,2,0,3,2,0,0,4,5,1} j=2, i= 3  => swap: {1,2,3,0,2,0,0,4,5,1}
		//2 : {1,2,3,0,2,0,0,4,5,1} j=3, i= 4  => swap: {1,2,3,2,0,0,0,4,5,1}
		//2 : {1,2,3,2,0,0,0,4,5,1} j=4, i= 5  => no-swap: {1,2,3,2,0,0,0,4,5,1}
		//2 : {1,2,3,2,0,0,0,4,5,1} j=4, i= 6  => no-swap: {1,2,3,2,0,0,0,4,5,1}
		//2 : {1,2,3,2,0,0,0,4,5,1} j=4, i= 7  => no-swap: {1,2,3,2,0,0,0,4,5,1}
		//2 : {1,2,3,2,0,0,0,4,5,1} j=5, i= 8  => swap: {1,2,3,2,4,0,0,0,5,1}
		//...
	}
}
