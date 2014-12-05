public class A{
	public static void main(String[] args){
		Student B=new Student();
		B.country="中国";
		
		Student C=new Student();
		//C.country="中国";
		
		
		System.out.println(C.country);
	}
}


class Student{
	String name;
	int age;
	static String country;//静态变量
}
