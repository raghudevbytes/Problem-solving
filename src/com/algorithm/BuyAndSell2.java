package com.algorithm;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//In this type problem we can do transaction multiple times to maximize the profit
//but before selling, we cannot buy the stock
public class BuyAndSell2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		findMaxProfit(arr);
	}
	public static void findMaxProfit(int[] arr) {
		int maxProfit = 0;
		
		for(int i=1;i<arr.length;i++) {
			//checking buying price should be less than selling price
			if(arr[i-1]<arr[i])
				maxProfit = maxProfit+(arr[i]-arr[i-1]);
		}
		System.out.println("MAX_PROFIT::"+maxProfit);
	}
}

