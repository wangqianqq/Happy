/*�����ڲ���  ��һ��û�����ֵ��ڲ���
	��ʽ��
	new�������߽ӿ���(){
		��д���нӿڵķ�����
		�����Լ����巽����(һ��϶������Լ����巽��)
	};
	��⣺�����Ǽ̳��������ʵ���˽ӿڵ�������������

*/
abstract class Fu{
	public abstract void show();
	
}

class Outer{
	public void method(){
		new Fu(){
			public void show(){
				System.out.println("show");
			}
		
		};
		
		
	//���ʹ��show�����أ�
	 	new Fu(){
			public void show(){
				System.out.println("show");
			}
	
		}.show(); 
	}
}


class OuterDemo6{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	}
}