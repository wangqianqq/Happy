/* 
	�����ʽ������һ���ӿڣ���ô������Ҫ���ǽӿڵ��������
	
	���翪���и�����һ��������������һ���ӿڡ�
	��ô�����Ǿ�Ӧ�����������
	A���Զ�����ʵ�ֽӿڡ�����ʵ����Ķ���
	B:�����ڲ���ķ�ʽ��

 */

interface Inter{
	public abstract void show();
}

/* class InterImpl implements Inter{  //�Զ�����ʵ�ֽӿ�---����A
	public void show(){
		System.out.println("show Inter");
	}
}
 */
class InterDemo{
	public void method(Inter i){//�������� Inter i����Ҫ���ǽӿ�����
		i.show();  
	}
}

class OuterDemo8{
	public static void main(String[] args){
		InterDemo id=new InterDemo();
		/* 
		Inter i=new InterImpl();//��Ҫ���ǽӿ����ͣ����ԡ�����
		id.method(i);
		System.out.println("-------");
		
		id.method(new InterImpl());
		//�൱��Inter i=new InterImpl();id.method(i);
		System.out.println("--------"); */ //  ----����B
		
		 id.method(new Inter(){   //()����������������������
			public void show(){
				System.out.println("show Inter");
			}
		});    //---����B
	}
}