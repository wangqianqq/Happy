/* 
final�����գ���һ�����η�
1��final�����������࣬��������������Ա��������Ա������
2����final���κ���಻���Ա�������̳�
3����final���κ�ĺ��������Ա���д
4����final���κ�ı����������ٴθ�ֵ��final�ڶԱ�����������ʱһ��Ҫ��ֵ,��final���κ�ı������ǳ���Ϊ����
ע�⣺�����������淶����ĸȫ����д���������������ɶ��������ɣ��ڵ���֮����_����
 */
 
 /* class Student{
	public final static String STUDENT_NAME="����";//final�ڶԱ�����������ʱһ��Ҫ��ֵ. ������η����εı�����Ϊȫ�ֳ���
 
 } */
 class Person{
	final void show(){//��final���κ�ĺ��������Ա���д
		System.out.println("���");
	}
	void show1(){
		System.out.println("ëë");
	}

}

class Student extends Person{
	void show1(){
		System.out.println("�������");
	
		
		
	}
}
public class D{

	public static void main(String[] args){
		Student s=new Student();
		Student s1=new Student();
		s.show1();
	}
}