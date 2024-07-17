package com.algorithm;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
/*Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
public class BuyAndSell {

	public static void main(String[] args) {
		int[] arr = new int[] {7,1,5,3,6,4};
		findMaxProfit(arr);
		optimizedSolution(arr);
	}
//optimized solution- traversing one time (O(n))
//trick - find minimum value after each iteration, it keeps track minimum but price,
//no need of second loop
	public static void optimizedSolution (int[] arr) {
		int minBuyPrice = arr[0];
		int maxSellPrice=-1;
		int maxProfit = -1;
		int tempProfit = -1;
		
		for(int i=1; i<arr.length;i++) {
			tempProfit = arr[i] - minBuyPrice;
			if(tempProfit > maxProfit) {
				maxProfit = tempProfit;
				maxSellPrice = arr[i];
			}
			if(arr[i]<minBuyPrice) {
				minBuyPrice = arr[i];
			}
		}
		System.out.println("Profit : "+maxProfit+":minbuy:"+minBuyPrice+":maxSellPrice:"+maxSellPrice);
	}
	//brute force method (O(n2))
	public static void findMaxProfit(int[] arr) {
		int curProfit = 0;
		int maxProfit = 0;
		int buyPrice = -1;
		int sellPrice = -1;
		
		for(int i=1;i<arr.length; i++) {
			for(int j=0; j<i;j++) {
				curProfit = arr[i] -arr[j];
				if(curProfit > maxProfit) {
					maxProfit = curProfit;
					buyPrice = i;
					sellPrice=j;
				}
			}
		}
		System.out.println(maxProfit);
		System.out.println(arr[sellPrice]+"-"+arr[buyPrice]);
	}
}

