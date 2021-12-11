import java.util.Comparator;

public class Student {
	int rollNo;
	String name;
	String department;
	
	public Student(int rollNo, String name, String department) {
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public static Comparator<Student> StuRollno = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            int rollno1 = s1.getRollNo();
            int rollno2 = s2.getRollNo();
            return rollno1 - rollno2;
        }
    };
    
    public static Comparator<Student> StuDepartment = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
        	String studentDepartment1 = s1.getDepartment().toUpperCase();
        	String studentDepartment2 = s2.getDepartment().toUpperCase();
        	return studentDepartment1.compareTo(studentDepartment2);
        }
    };
           
}
