//����
import javax.sound.midi.MidiDevice.Info;

public class TestOverLoad {
	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person(400);
		
		Person p2=new Person(2,500);
		p.info();
		p.info("ok");
	}
}

class Person{
	Person(){
		id=100;
		age=20;
	}
	
	Person(int _id){
		id=_id;
		age=30;
	}
	
	Person(int _id,int _age){
		id=_id;
		age=_age;
	}
	
	//�����Ա����
	private int id;
	private int age=20;
	
	//��������
	public int getId() {
		return id;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		age = i;
	}

	void info(){//�޲�
		System.out.println("my id is:"+id);
	}
	void info(String t){//�в�
		System.out.println(t+"\tid:"+id);
	}
	
}
