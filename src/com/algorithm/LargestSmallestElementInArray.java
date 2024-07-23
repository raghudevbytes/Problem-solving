package com.algorithm;

//Find first max and second max
//Find first min and second min
public class LargestSmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,7,7,5};
		findMaxElement(arr);
		System.out.println("\n");
		findSecondMinElement(arr);
	}
	private static void findSecondMinElement(int[] arr) {
		int min= Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		//set seconMin if firstMin change
		for(int num:arr) {
			if(num<min) {
				secMin = min;
				min = num;
			}
			if(num<secMin && num >min)
				secMin = num;
		}
		
		System.out.printf("First min: %d, Secong min: %d",min, secMin);
		
	}
	public static void findMaxElement(int[] arr) {
		int max= Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>max) {
				secMax = max;
				max = num;
			}
			if(num>secMax && num < max)
				secMax = num;
		}
		System.out.printf("First max : %d, Second max: %d", max, secMax);
	}
	
}
