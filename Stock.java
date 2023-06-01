package mockitoProject;

public class Stock {

	private String stockId;
	private String stockName;
	private double quantity;
	
	public Stock(String stockId, String stockName, int quantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.quantity = quantity;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
