package com.bridgelab.StockManagementprog;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	
	static int numberOfStock;
	static int totalValue;
	static int stockValue;
	
	ArrayList<Stock> details = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addStock() {
		
		System.out.println("ENTER THE NUMBER OF STOCKS YOU WANT TO BUY");
		numberOfStock = sc.nextInt();
		
		for(int i = 1; i <= numberOfStock; i++) {
			Stock stock = new Stock();
			
			System.out.println("Stock details "  +i+  " is : " );
	
			System.out.println("Enter stock name : ");
			stock.setStockName(sc.next());
			
			System.out.println("Enter total stock value : ");
			stock.setNumberOfShare(sc.nextInt());
			
			System.out.println("Enter share price : ");
			stock.setSharePrice(sc.nextInt());
			
			totalValue = stock.getNumberOfShare()*stock.getSharePrice();
			stock.setTotalValue(totalValue);
			details.add(stock);

			stockValue = stockValue + totalValue;
		}

		System.out.println(details);
		
		System.out.println("total value of total stock = " + stockValue );
		
	}
}
