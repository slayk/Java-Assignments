
public class ReservationSystem {
	private static int totalSeats = 30;
	String name;
	int noOfSeats;
	
	
	public ReservationSystem(String name, int noOfSeats) {
		this.name = name;
		this.noOfSeats = noOfSeats;
		assignSeat(noOfSeats);
	}
	
	public void assignSeat(int noOfSeats) {
		if(totalSeats > noOfSeats) {
			totalSeats--;
			System.out.println(noOfSeats + " seats assigned to " + name);
		} else {
			System.out.println("All seats taken");
		}
	}
	
}
