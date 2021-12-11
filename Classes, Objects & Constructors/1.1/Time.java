
public class Time {
	int hours;
	int minutes;
	int seconds;
	
	public Time() {}
	
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void display() {
		if(hours > 0 && hours <=12) {
			System.out.println(hours+":"+minutes+":"+seconds+" AM");
		} else {
			hours = hours%12;
			System.out.println(hours+":"+minutes+":"+seconds+" PM");
		}
	}

}
