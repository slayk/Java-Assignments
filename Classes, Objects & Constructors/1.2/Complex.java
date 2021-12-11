
public class Complex {
	int real;
	int imaginary;
	
	public Complex() {}
	
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void display() {
		if(imaginary>=0) {
			System.out.println(real+"+"+imaginary+"i");
		} else {
			System.out.println(real+""+imaginary+"i");
		}
		
	}
	
	public Complex add(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		return temp;
	}
	
	public Complex subtract(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = c1.real - c2.real;
		temp.imaginary = c1.imaginary - c2.imaginary;
		return temp;
	}
	
	public Complex multiply(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
		temp.imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
		return temp;
	}
}
