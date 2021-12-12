import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	int numberOfSubjects;
	int marks[];
	
	Student(int rollno, String name, int numberOfSubjects) {
		this.rollno = rollno;
		this.name = name;
		this.numberOfSubjects = numberOfSubjects;
		getMarks(numberOfSubjects);
	}
	
	public void getMarks(int noSub) {
		marks = new int[noSub];
		Scanner myObj = new Scanner(System.in);
		for(int i=0; i<noSub; i++) {
			marks[i]= myObj.nextInt();
		}
	}
	
	public void calculatePercentage() {
		double percentage = 0;
		int tmarks = 0;
		for(int i=0; i<marks.length; i++) {
			tmarks += marks[i];
		}
		percentage=tmarks/numberOfSubjects;
		System.out.println("Percentage is: " + percentage);
	}
	
}
