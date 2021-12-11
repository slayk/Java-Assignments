import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(3, "Ali", "CSE");
		Student s2 = new Student(2, "Myra", "EE");
		Student s3 = new Student(1, "Geena", "CSE");
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		
		//Sorting using department name
//		Collections.sort(arraylist, Student.StuDepartment);
		
		//Sorting using roll number
//		Collections.sort(list, Student.StuRollno);
		
//		Iterator<Student> itr = arraylist.iterator();
//		while(itr.hasNext()) {
//			Student st=(Student)itr.next();  
//		    System.out.println(st.rollNo + " " + st.name + " " + st.department);  
//		}
		
// -------------------------------------------------------------------------------------------		
		
		LinkedList<Student> linkedlist = new LinkedList<Student>();
		linkedlist.add(s1);
		linkedlist.add(s2);
		linkedlist.add(s3);
		
		//Collections.sort(linkedlist, Student.StuRollno);
		//Collections.sort(linkedlist, Student.StuDepartment);
		
//		Iterator<Student> itr = linkedlist.iterator();
//		while(itr.hasNext()) {
//			Student st=(Student)itr.next();  
//		    System.out.println(st.rollNo + " " + st.name + " " + st.department);  
//		}
//		
// --------------------------------------------------------------------------------------------
	
		Vector<Student> vector = new Vector<Student>();
		vector.add(s1);
		vector.add(s2);
		vector.add(s3);
		
		//Collections.sort(linkedlist, Student.StuRollno);
		Collections.sort(vector, Student.StuDepartment);
				
		Iterator<Student> itr = vector.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();  
			System.out.println(st.rollNo + " " + st.name + " " + st.department);  
		}
				
		
	}

}
