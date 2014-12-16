
public class A {
	void max(int a,int b){
		System.out.println(a>b?a:b);
	}
	
	void max(short a,short b){
		System.out.println(a>b?a:b);//可以与上面的构成重载
	}
	
	//	int max(int a,int b){
	//		System.out.println(a>b?a:b);//重名，不构成重载 
	
	
	void max(float a,float b){//与上面的参数名称相同，类型不同，构成重载
		System.out.println(a>b?a:b);
	}
	
	public static void main(String[] args){
		A e=new A();
		e.max(3,4);//调用的是第一个方法,编译器看到一个整数就当成int类型
		
		short a=3;
		short b=4;
		e.max(a, b);//可以这样调用short类型的
	}
}
