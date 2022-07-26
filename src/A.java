

public class A {
	
	public int add(int a,int b) {
		return a+b;
	

	}

	public double add(double a,double b,double c ) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a.add(7,7,9));
		System.out.println(a.add(5,7));
	}
}
