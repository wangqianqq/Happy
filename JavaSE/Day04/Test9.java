class Cat{
	String name;
	int age;
	String color;
	public void set(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String toString(){
		return"����:" + name +"\t����:" + age + "\t��ɫ:" + color;
	}
	public Cat abc(){
		return this;
	}
}
public class Test9{
	public static void main(String[] args){
		Cat one = new Cat();
		Cat two = new Cat();
		one.set("��һֻè",5,"��ɫ");
		two.set("�ڶ�ֻè",6,"��ɫ");
		Cat three = new Cat();
		three = two.abc();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}