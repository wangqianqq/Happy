/* 
final（最终）是一个修饰符
1、final可以是修饰类，函数，变量（成员变量，成员方法）
2、被final修饰后的类不可以被其他类继承
3、被final修饰后的函数不可以被重写
4、被final修饰后的变量不允许再次赋值，final在对变量进行修饰时一定要赋值,被final修饰后的变量我们称它为常量
注意：常量的命名规范：字母全部大写，如果这个名字是由多个单词组成，在单词之间用_隔开
 */
 
 /* class Student{
	public final static String STUDENT_NAME="方法";//final在对变量进行修饰时一定要赋值. 多个修饰符修饰的变量称为全局常量
 
 } */
 class Person{
	final void show(){//被final修饰后的函数不可以被重写
		System.out.println("你好");
	}
	void show1(){
		System.out.println("毛毛");
	}

}

class Student extends Person{
	void show1(){
		System.out.println("你好世界");
	
		
		
	}
}
public class D{

	public static void main(String[] args){
		Student s=new Student();
		Student s1=new Student();
		s.show1();
	}
}