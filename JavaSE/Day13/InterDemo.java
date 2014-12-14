//面试题

interface Inter{
	public abstract void show();
}

class Outer{
	//补全代码
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
		分析：
		因为Outer是一个类，类直接调方法，所以method()是一个静态方法，
	    ???.show()；???应该是一个对象
		Outer.method().show();	Outer.method()的返回值是一个对象。
		跟show方法相关的只有Inter接口，所以返回值是Inter接口。
		 */
	}
}