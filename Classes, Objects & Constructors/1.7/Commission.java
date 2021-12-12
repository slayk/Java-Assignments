
public class Commission {
	int sales;
	
	public Commission(int sales) {
		this.sales = sales;
		getCommission(sales);
	}
	
	public void getCommission(int sales) {
		System.out.println(sales);
	}

}
