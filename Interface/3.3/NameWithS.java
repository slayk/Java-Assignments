import java.util.Scanner;

public class NameWithS implements ScientificCalculator {
	int a;
	int b;

	public NameWithS(int a, int b) {
		System.out.println("Welcome to Calculator\nOperations available to you are:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Exponential");
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter choice");
		int ch = myObj.nextInt();
		switch(ch) {
			case 1: addition(a, b);  
		    break;    
		    case 2: subtraction(a, b);  
		    break;    
		    case 3: exponential(a, b); 
		    break;    
		    default:System.out.println("Invalid!"); 
		}
		
	}
	
	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void exponential(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(a, b));
		
	}

	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modulo(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logarithmic(int a, int b) {
		// TODO Auto-generated method stub
		
	}



}
