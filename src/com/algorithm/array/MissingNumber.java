package com.algorithm.array;

//find missing number from 1 to N
//better -> hashing
//best -> by using XOR and n(n+1)/2

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(findMissingNumber(new int[]{1,2,3,5}, 5));
		System.out.println(findMissingNumberBySum(new int[]{1,2,3,5}, 5));
	}
	// this approach by using bit manipulation
	public static int findMissingNumber(int[] arr, int N) {
        // Step 1: XOR all numbers from 1 to N
        int xorN = 0;
        for (int i = 1; i <= N; i++) {
            xorN ^= i;
        }

        // Step 2: XOR all the elements in the array
        int xorArr = 0;
        for (int num : arr) {
            xorArr ^= num;
        }

        // Step 3: XOR of xorN and xorArr gives the missing number
        return xorN ^ xorArr;
    }
	public static int findMissingNumberBySum(int[] arr, int N) {
       int sum = N * (N+1)/2;
        // Step 2: XOR all the elements in the array
        int arrSum = 0;
        for (int num : arr) {
            arrSum+=num;
        }
        return sum -arrSum;
    }
}

