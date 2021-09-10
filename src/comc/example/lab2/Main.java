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
		s.setName("����");
		s.setAge(20);
		list.add(s); //adding Student class object
		list.add(new Student(2, "���", 22));
		list.add(new Student(3, "����", 23));
		list.add(new Student(4, "��ȣ", 24));
		list.add(new Student(5, "����", 25));
		list.add(new Student(6, "���곪", 23));
		list.add(new Student(7, "�ϳ�", 26));
		list.add(new Student(8, "��ȯ", 28));
		list.add(new Student(9, "�ο�", 27));
		list.add(new Student(10, "����", 30));
		
		
		Collections.sort(list);
		for(Student a : list) {
			System.out.println(a.toString());
		}
		
	}
}
