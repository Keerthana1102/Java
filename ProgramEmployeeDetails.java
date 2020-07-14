package javaMyCaptain;

class Employee{
	private String name, address;
	private int year, salary;
	
	public Employee(String a, int x, int s, String b) {
		name = a;
		address = b;
		year = x;
		salary = s;
		
//		this.name = a;
//		this.address = b;
//		this.year = x;
//		this.salary = s;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getSalary() {
		return salary;
	}
}

public class ProgramEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating 3 objects of the Employee class
		
		Employee e1 = new Employee("Robert", 1994, 100000, "64C- WallsStreet");
		Employee e2 = new Employee("Sam", 2000, 300000, "68D- WallsStreet");
		Employee e3 = new Employee("John", 1999, 500000, "26B- WallsStreet");
		
		System.out.println("Name\t  Year of joining\tSalary\t\tAddress");
		
		System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t"+e1.getSalary()+"\t\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t"+e2.getSalary()+"\t\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t"+e3.getSalary()+"\t\t"+e3.getAddress());

	}

}
