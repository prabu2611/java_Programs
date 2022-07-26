

public class String_Funts {
	public static void main(String[] args) {
		String p="Welcome to Java";
		String p1="welcome";
		String p2="";
		String p3=null;
		String p4=" ";
		String p5="       Hello world    ";
		String p6="hello-how are you";
		
		int indexOf = p.indexOf("m");
		System.out.println(indexOf);
		int lastIndexOf = p.lastIndexOf("v");
		System.out.println(lastIndexOf);
		char charAt = p.charAt(8);
		System.out.println(charAt);
		String replace = p1.replace('w', 'v');
		System.out.println(replace);
		String substring = p.substring(3);
		System.out.println(substring);
		boolean empty = p2.isEmpty();
		System.out.println(empty);
		String[] split = p.split("come");
		System.out.println(split);
		String trim = p.trim();
		System.out.println(trim);
	
	}

}
