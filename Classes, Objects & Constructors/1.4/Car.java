
public class Car {
	int carNo;
	int hoursOfBooking;
	static int totalNoOfCars;
	
	public Car(int carNo, int hoursOfBooking) {
		this.carNo = carNo;
		this.hoursOfBooking = hoursOfBooking;
	}
	
	public static void displayTotalNumberOfCars() {
		totalNoOfCars += 1;
	}
}
