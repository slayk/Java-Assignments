import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter name");
		 String name = myObj.nextLine();
		 
		 if(name.startsWith("A")) {
			 Calculator c = new NameWithA(1, 2);
		 } else if(name.startsWith("S")) {
			 Calculator c = new NameWithS(1, 2);
		 } else {
			 Calculator c = new NameForRest(1, 2);
		 }

	}

}
