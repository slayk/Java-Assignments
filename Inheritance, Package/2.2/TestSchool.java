public class TestSchool {

	public static void main(String[] args) {
		Teacher[] t;
		Student[] s;
		t = new Teacher[1];
		s = new Student[1];
		t[0] = new Teacher("Neelam", 26, "TINT", "Salt Lake", "CSE", "OOPs", 3);
		s[0] = new Student("Rahul", 18, "TINT", "Howrah", "IT", 12, 4);
		System.out.println(t[0].toString());
		System.out.println(s[0].toString());

	}

}