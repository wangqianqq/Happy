/* 
	new �������߽����(){
		��д������
	}��
	���ʣ�������������
 */
interface Inter{
	public abstract void show();
	public abstract void show2();
}
class Outer{
	public void method(){
		//һ�������ĵ��� 
		/* new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();  */
		
		//��������ĵ��ã����ǱȽ��鷳
		/* new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		}.show();
		
		new Inter(){
			public void show(){
				System.out.println("show");
			}
			
			public void show2(){
				System.out.println("show2");
			}
		}.show2();	 */
	 
	//������Inter��ʵ�������������
		Inter i=new Inter(){//������󸳸�����  �õ���̬ ������ע�͵��ķ�����
			public void show(){
				System.out.println("show");
			}
			
			public void show2(){
				System.out.println("show2");
			}
		};	
		i.show();
		i.show2();
	} 
}
class OuterDemo7{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	}
	
}