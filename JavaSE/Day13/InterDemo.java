//������

interface Inter{
	public abstract void show();
}

class Outer{
	//��ȫ����
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("HelloWorld");
			}
	    };
	}
}


class InterDemo{
	public static void main(String[] args){
		Outer.method().show();
		/* 
		������
		��ΪOuter��һ���࣬��ֱ�ӵ�����������method()��һ����̬������
	    ???.show()��???Ӧ����һ������
		Outer.method().show();	Outer.method()�ķ���ֵ��һ������
		��show������ص�ֻ��Inter�ӿڣ����Է���ֵ��Inter�ӿڡ�
		 */
	}
}