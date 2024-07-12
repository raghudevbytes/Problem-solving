package com.algorithm;

//Kadene's told if sum less than 0, then sum will be zero at that index then move forward

public class Kadane {
	public static void main(String[] args) {
		int[] arr =new int[] {-5,-4,-3,-2,-1};
		findMaximumSum(arr);
	}
	public static void findMaximumSum(int[] arr) {
		int tempSum=0; //it hold current sum in the current index
		int maxSum=0; //it hold the max sum
		int start=-1; //it points max sum start index, it get reset when tempsum =0
		int tempStart = 0; //it will refer start var
		int tempEnd=0; //it will be assigned when maxSum found
		
		for(int i=0;i<arr.length;i++) {
			//adding array elements one by one
			tempSum +=arr[i];
			//its true when max sum found
			if(tempSum > maxSum) {
				tempStart=start;
				tempEnd=i;
				maxSum = tempSum;
			}
			//this is the proof of kadane algo, if sum lessthan zero, then sum will be zero in that index
			if(tempSum<=0) {
				tempSum=0;
				start=i+1;
			}
		}
		System.out.println(maxSum);
		System.out.println(tempStart+"--"+tempEnd);
		for (int i = tempStart; i <= tempEnd; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
