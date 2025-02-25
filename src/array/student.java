package array;
class students{
	String name;
	int age;
	students(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
public class student {
	public static void main(String[] args) {
		students[] s=new students[3];
		s[0]=new students("anju",18);
		s[1]=new students("anjali",19);
		s[2]=new students("aswini",20);
		for(students s1:s) {
			s1.display();
		}
	}
}
