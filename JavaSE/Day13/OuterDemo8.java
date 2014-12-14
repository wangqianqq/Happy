/* 
	如果形式参数是一个接口：那么这里需要的是接口的子类对象。
	
	假如开发中给我们一个方法，参数是一个接口。
	那么，我们就应该这样解决：
	A：自定义类实现接口。创建实现类的对象。
	B:匿名内部类的方式。

 */

interface Inter{
	public abstract void show();
}

/* class InterImpl implements Inter{  //自定义类实现接口---方法A
	public void show(){
		System.out.println("show Inter");
	}
}
 */
class InterDemo{
	public void method(Inter i){//括号里是 Inter i，需要的是接口类型
		i.show();  
	}
}

class OuterDemo8{
	public static void main(String[] args){
		InterDemo id=new InterDemo();
		/* 
		Inter i=new InterImpl();//需要的是接口类型，所以。。。
		id.method(i);
		System.out.println("-------");
		
		id.method(new InterImpl());
		//相当于Inter i=new InterImpl();id.method(i);
		System.out.println("--------"); */ //  ----方法B
		
		 id.method(new Inter(){   //()里面代表的是子类匿名对象
			public void show(){
				System.out.println("show Inter");
			}
		});    //---方法B
	}
}