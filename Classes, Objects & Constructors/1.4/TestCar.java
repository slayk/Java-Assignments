
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(1, 3);
		Car.displayTotalNumberOfCars();
		Car c2 = new Car(2, 6);
		Car.displayTotalNumberOfCars();
		Car c3 = new Car(3, 1);
		Car.displayTotalNumberOfCars();
		System.out.println("Total number of cars : " + Car.totalNoOfCars);
		CarParking cp = new CarParking();
		cp.calculateRate(c1.hoursOfBooking);
		cp.calculateRate(c2.hoursOfBooking);
		cp.calculateRate(c3.hoursOfBooking);
		System.out.println(CarParking.parkingCollection);
	}

}
