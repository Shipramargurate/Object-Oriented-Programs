package com.bridgelab.StockManagementprog;

public class Stock {

	private String stockName;
	private int numberOfShare;
	private int sharePrice;
	private int totalValue;
	
	/*
	 * USING GETTER AND SETTER 
	 *  SETTER - Assigning the values to variable using setter method 
	 *  GETTER - Taking the values from variable using getter method
	 */
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ ", totalValue=" + totalValue + "]";
	}
	
}

