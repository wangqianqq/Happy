package TestTeacher;

class Person {
	private String name;
	private String location;//��������
	
	//һ�ι��췽��
	Person(String name){
		this.name=name;
		location="beijing";
	}
	
	//���ι��췽��
	Person(String name,String location){
		this.name=name;
		this.location=location;
	}
	
	//����
	public String info(){
		return "name:"+name+"\tlocation:"+location;
	}
}	
class Teacher extends Person{
	private String zhicheng;
	Teacher(String name,String zhicheng) {
		this(name,"beijing",zhicheng);
	}
	Teacher(String n, String l, String zhicheng) {
		super(n,l);
		this.zhicheng=zhicheng;		
	}
	public String info() {
		return super.info()+"\tteacher:"+zhicheng;
	}	
}
	




