
public class A {
	void max(int a,int b){
		System.out.println(a>b?a:b);
	}
	
	void max(short a,short b){
		System.out.println(a>b?a:b);//����������Ĺ�������
	}
	
	//	int max(int a,int b){
	//		System.out.println(a>b?a:b);//���������������� 
	
	
	void max(float a,float b){//������Ĳ���������ͬ�����Ͳ�ͬ����������
		System.out.println(a>b?a:b);
	}
	
	public static void main(String[] args){
		A e=new A();
		e.max(3,4);//���õ��ǵ�һ������,����������һ�������͵���int����
		
		short a=3;
		short b=4;
		e.max(a, b);//������������short���͵�
	}
}
