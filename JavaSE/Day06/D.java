/* 
final�����գ���һ�����η�
1��final���������࣬��������������Ա��������Ա������
2����final���κ���಻���Ա�������̳�
3����final���κ�ĺ��������Ա���д
4����final���κ�ı����������ٴθ�ֵ��final�ڶԱ�����������ʱ��һ��Ҫ��ֵ��
��final���κ�ı������ǳ�Ϊ����

ע�⣺�����������淶����ĸȫ��Ҫ��д
 */
 class Person{
	final void show(){
		System.out.println("���");
	}
	void show1(){
		System.out.println("С��");
	}
 }
 
 class Student extends Person{
	void show1(){
		System.out.println("С��");
	}
 }
 
 
 
 /* class Student{
	public final static String STUDENT_NAME = "����";
  
 }
 */
 public class D{
	public static void main(String[] args){
		Student s=new Student();
		s.show();
		//final int a=34;//final�ڶԱ�����������ʱ��һ��Ҫ��ֵ
		//a=45;//��final���κ�ı����������ٴθ�ֵ
		
	}
 }