import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		System.out.println("Please input your choose:");
		Scanner in=new Scanner(System.in);
			int choose=in.nextInt();
		switch(choose){
		case 1:
		System.out.println("����һ��ѧ��");
		break;
		case 2:
		System.out.println("��ʾ����ѧ��");
		break;
		case 3:
		System.out.println("�˳�����");
		break;
		
		}
	
	}

}