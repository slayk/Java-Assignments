
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] arr;
        arr = new Book[2];
        arr[0] = new Book("The Alchemist", 12, "Paul Coelho");
        arr[1] = new Book("Paper Towns", 3, "John Green");
        for(int i=0; i<arr.length; i++) {
            arr[i].display();
        }

	}

}
