package comc.example.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		//create arraylist of user-defined class objects
		List<Student> list = new ArrayList<Student>();
		System.out.println("Student List (orderd by name)");
		Student s = new Student();
		s.setNo(1);
		s.setName("원재");
		s.setAge(20);
		list.add(s); //adding Student class object
		list.add(new Student(2, "재원", 22));
		list.add(new Student(3, "수영", 23));
		list.add(new Student(4, "재호", 24));
		list.add(new Student(5, "성헌", 25));
		list.add(new Student(6, "수산나", 23));
		list.add(new Student(7, "하나", 26));
		list.add(new Student(8, "준환", 28));
		list.add(new Student(9, "민우", 27));
		list.add(new Student(10, "정한", 30));
		
		
		Collections.sort(list);
		for(Student a : list) {
			System.out.println(a.toString());
		}
		
	}
}
