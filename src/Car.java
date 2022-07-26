

public class Car extends War{
	
	@Override
	public int additionMethod(int a, int b) {
		System.out.println("Welcome");
        return a+b;
	}
	public static void main(String[] args) {
		
		War b=new War();
		Car c=new Car();
		
		System.out.println(b.additionMethod(6, 9));
		System.out.println(c.additionMethod(7, 9));
	}
	
	

}
