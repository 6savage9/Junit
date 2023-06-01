package testcase;

import java.util.ArrayList;
import java.util.List;

import mockitoProject.Portfolio;
import mockitoProject.Stock;
import mockitoProject.StockService;

public class PortfolioTester {

	Portfolio portfolio;
	StockService stockService;
	
	public static void main(String[] args) {
		PortfolioTester tester = new PortfolioTester();
		tester.setup();
		System.out.println(tester.testMarketValue()?"pass" : "fail");
	}
	
	public void setup() {
		
		portfolio = new Portfolio();
		
		//stockService = mock(StockService.class);
		
		portfolio.setStockService(stockService);
	}
	
	public boolean testMarketValue() {
		
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1", "Google", 100);
		Stock amazonStock = new Stock("2", "Amazon", 200);
		
		stocks.add(googleStock);
		stocks.add(amazonStock);
		
		portfolio.setStocks(stocks);
		
//		when(stockService.getPrice(amazonStock)).thenReturn(100.00);
//		when(stockService.getPrice(googleStock)).thenReturn(200.00);
//		
		double marketValue = portfolio.getMarketValue();
		return marketValue ==100500.0;
		
	}
}
