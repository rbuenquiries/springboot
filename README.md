# springboot
object creation can be handled in 2 ways 
1. compile time object creation
2. run time object creation

1. compile time object creation:
compile time object creation is not recomended for MVC based application as all the layers of MVC should be lossly coupled compile time object creation will make your class tigtly couple with given object

ex:
----------------------------------------------------------------------------------
package beans;

public class Student {
	public static void main(String[] args)
			 {
		CoreJavaCourse c=new CoreJavaCourse(); 
    //static way of object creation not recomended as it will make student class tightly coupled with CoreJavaCourse
				}
}

package beans;

public class CoreJavaCourse {
	public CoreJavaCourse() {
		System.out.println("CoreJavaCourse ready ");
	}
	public void courseDetails() {
		System.out.println("CoreJavaCourse ");
	}
}
----------------------------------------------------------------------------------------

2. run time object creation:
 object will be created using java reflection API to make your class independed of dependency class
 using Class.forName("fully qualified path").newInstance(); 

ex:

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

package beans;

public class CoreJavaCourse {
	public CoreJavaCourse() {
		System.out.println("CoreJavaCourse ready ");
	}
	public void courseDetails() {
		System.out.println("CoreJavaCourse ");
	}
}

package beans;

public class SpringCourse {
	public SpringCourse() {

		System.out.println("SpringCourse ready ");

	}

	public void courseDetails() {
		System.out.println("SpringCourse ");
	}
}


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


now you can pass any class as run time argument to your Student class
java Student beans.CoreJavaCourse   out put //CoreJavaCourse ready
java Student beans.SpringCourse     out put //SpringCourse ready
java Student beans.AdvJavaCourse    out put //AdvJavaCourse ready



in dynamic aproach you can observe how dynamically student class able to choose required course 
-------------------------------------------------------------




