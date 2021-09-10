package comc.example.lab2;

public class Student implements Comparable<Student> {
	private int no;
	private String name;
	private int age;
	
	public Student(){}
	//왜 student 객체를 두개 생성하는가?
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		//클래스의 속성과 생성자/메소드의 매개변수(input parameter)의 이름이 같은 경우
		//클래스 속성을 사용할 때 this 키워드를 붙여준다.
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
}
