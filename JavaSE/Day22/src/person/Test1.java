package person;

public class Test1 {
	public static void main(String[] args) {
		Person p1 = new Person("A");
		Person p2 = new Person("B","shanghai");
		Student s1 = new Student("C", "S1");
		Student s2 = new Student("C", "shanghai","S2");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}

}
