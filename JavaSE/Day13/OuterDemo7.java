/* 
	new 类名或者借口名(){
		重写方法；
	}；
	本质：子类匿名对象。
 */
interface Inter{
	public abstract void show();
	public abstract void show2();
}
class Outer{
	public void method(){
		//一个方法的调用 
		/* new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();  */
		
		//多个方法的调用，但是比较麻烦
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
	 
	//整体是Inter的实现类的匿名对象。
		Inter i=new Inter(){//子类对象赋给父类  用到多态 比上面注释掉的方法简单
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