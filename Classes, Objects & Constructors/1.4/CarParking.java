
public class CarParking {
	int rate;
	static int parkingCollection = 0;
	
	public void calculateRate(int hours) {
		if(hours>1) {
			rate = (int) (3 + (hours-1)*1.5);
		} else {
			rate = 3;
		}
		System.out.println("Rate:"+rate);
		parkingCollection += rate;
	}
	
}
