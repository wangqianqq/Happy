public class A{
	public static void main(String[] args){
		Student B=new Student();
		B.country="�й�";
		
		Student C=new Student();
		//C.country="�й�";
		
		
		System.out.println(C.country);
	}
}


class Student{
	String name;
	int age;
	static String country;//��̬����
}
