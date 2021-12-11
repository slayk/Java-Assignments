
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(3, 4);
		Complex c3 = new Complex();
		c3 = c3.add(c1, c2);
		c3.display();
		c3 = c3.subtract(c1, c2);
		c3.display();
		c3.multiply(c1, c2);
		c3.display();
	}

}
