public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2, 3);
		Triangle t = new Triangle(2, 4);
		System.out.println(r.calculateArea());
		r.display();
		System.out.println(t.calculateArea());
		t.display();
	

	}

}