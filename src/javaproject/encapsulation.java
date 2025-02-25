package javaproject;

class employee{
	private int id;
	private String name;
	private String email;
	private double salary;
//	all args constuctor
	public employee(int id,String name,String email,double salary) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.setSalary(salary);
	}
	//getters
	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	//setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//no args constructor
	public employee() {
		super();
	}
	public void updateSalary(double newSalary) {
		if(newSalary>0) {
			this.salary=newSalary;
			System.out.println("updated salary:"+newSalary);
		}
		else {
			System.out.println("invalid salary");
		}
	}
}
class hrdepartment{
	public void increaseSalary(employee e1 ,double newSalary) {
		e1.updateSalary(newSalary);
	}
}
public class encapsulation {
	public static void main(String[] args) {
		employee e=new employee(1,"anjali","anjali@email.com",100000.0);
		System.out.println("employee id:"+e.getId());
		System.out.println("employee name:"+e.getName());
		System.out.println("employee email:"+e.getEmail());
		System.out.println("employee salary:"+e.getSalary());
		hrdepartment hr=new hrdepartment();
		hr.increaseSalary(e, 40000);
		System.out.println("updated salary is:"+e.getSalary());
		}
}
