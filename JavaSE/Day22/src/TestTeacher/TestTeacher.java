package TestTeacher;
public class TestTeacher {
	public static void main(String[] args) {
		Person p1 = new Person("A");
		Person p2 = new Person("B","shanghai");
		Teacher s1 = new Teacher("C", "S1");
		Teacher s2 = new Teacher("C", "shanghai","S2");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}

}
