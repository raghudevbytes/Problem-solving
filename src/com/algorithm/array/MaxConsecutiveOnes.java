package com.algorithm.array;

//Find max no of consecutive 1's
public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
		System.out.println(getNoOfMaxConsecutiveOnes(arr));
		
	}
	public static int getNoOfMaxConsecutiveOnes(int[] arr) {
		int maxTimes = 0;
		int start=0;
		int tempStart = -1;
		int tempEnd = -1;
		for(int i=0; i< arr.length;i++) {
			if(arr[i] == 1) {
				tempStart = i;
				start++;
			}else {
				tempEnd = tempStart-1;
				start=0;
			}
			if(tempEnd<tempStart)
				tempEnd = arr.length-1;
			maxTimes = Math.max(start, maxTimes);
		}
		System.out.println("tempStart :"+tempStart+" :tempEnd: "+tempEnd);
		return maxTimes;
	}
}
