

public class String_Funs {
	public static void main(String[] args) {
		String s="Believe in Yourself";
		String s1="believe";
		String s2="";
		String s3=null;
		String s4=" ";
		String s5="      Welcome      ";
		
		int length = s.length();
		System.out.println(length);
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = s.startsWith("Beli");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("self");
		System.out.println(endsWith);
		boolean contains = s.contains("our");
		System.out.println(contains);
	
	}

}
