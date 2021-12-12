
public class TestCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sales = -400;
		if(sales >= 0) {
			Commission c = new Commission(sales);
		} else {
			System.out.println("Invalid input");
		}

	}

}
