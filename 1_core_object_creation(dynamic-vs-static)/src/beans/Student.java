package beans;

public class Student {
	public static void main(String[] args)
			 {
		// CoreJavaCourse c=new CoreJavaCourse(); //static way of object creation
		try {
		Object o = Class.forName(args[0]).newInstance(); //dynamic way of object creation
		}catch (Exception e) {
			System.out.println(e);
		}
		}
}
