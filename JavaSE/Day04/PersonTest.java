//����Person��
public class PersonTest{
	public static void main(String[] args){
		//ʵ����:����=����=ʵ��
		Person geminno = new Person();//�ڶ����ʱ��û�С��Զ����޲ι�����������ϵͳ�Զ�ָ��������
		Person gem = new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
	
		//�ڶ����ʱ���С��Զ����޲ι�����
		//����ʹ�ã�����.��Ա���� ����.��Ա����
		geminno.info();
		gem.info();
		gemptc.info();
		//System.out.println("Name:" + geminno.name + "Age:" + geminno.age);
		
	
	}//end main
}//end class