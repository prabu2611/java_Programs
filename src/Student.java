

public class Student {
	
	 String name;
	 int id;
	 
	 public Student(String name,int id) {
		 
		 this.name=name;
		 this.id=id;
	}
	 
	 
	 
	 
	 public static void main(String[] args) {
		
		 Student s=new Student("Bharthi",100);
		 
		 System.out.println(s.name);
		 System.out.println(s.id);
		 
		 
	}

}
