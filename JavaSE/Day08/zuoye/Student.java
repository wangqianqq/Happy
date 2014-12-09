import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		System.out.println("Please input your choose:");
		Scanner in=new Scanner(System.in);
			int choose=in.nextInt();
		switch(choose){
		case 1:
		System.out.println("增加一个学生");
		break;
		case 2:
		System.out.println("显示所有学生");
		break;
		case 3:
		System.out.println("退出程序");
		break;
		
		}
	
	}

}