

public class Employee {
	
	String name;
	int age;
	
	public Employee(String name,int age) {
	this.name=name;
	this.age=age;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Employee e=new Employee("Prabu",27);
		System.out.println(e.name);
		System.out.println(e.age);
		
	}
      
}
	