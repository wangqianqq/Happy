/* 
final（最终）是一个修饰符
1、final可以修饰类，函数，变量（成员变量，成员方法）
2、被final修饰后的类不可以被其他类继承
3、被final修饰后的函数不可以被重写
4、被final修饰后的变量不允许被再次赋值，final在对变量进行修饰时，一定要赋值，
被final修饰后的变量我们成为常量

注意：常量的命名规范：字母全部要大写
 */
 class Person{
	final void show(){
		System.out.println("你好");
	}
	void show1(){
		System.out.println("小米");
	}
 }
 
 class Student extends Person{
	void show1(){
		System.out.println("小花");
	}
 }
 
 
 
 /* class Student{
	public final static String STUDENT_NAME = "方法";
  
 }
 */
 public class D{
	public static void main(String[] args){
		Student s=new Student();
		s.show();
		//final int a=34;//final在对变量进行修饰时，一定要赋值
		//a=45;//被final修饰后的变量不允许被再次赋值
		
	}
 }