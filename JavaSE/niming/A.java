abstract class Student{
	 abstract void speak();

}

class Teacher{
	void look(Student stu){
		stu.speak();//ִ��������������д��speak()����
		
	}

}

public class A{
	public static void main(String[] args){
		Teacher zhang=new Teacher();
		zhang.look(new Student(){   //����������壬��Student�����������
			void speak(){
				System.out.println("�������������صķ���");
			}
			
	    }); //�������������
                   
    }

}

