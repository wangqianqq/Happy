class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
}

class ObjectDemo{
	public Fu getFu(){
		Fu f = new Fu();
		return f;
	}
	public Zi getZi(){
		Zi z = new Zi();
		return z;
	}
}

class ManyObjectDemo{
	public static void main(String[] args){
	
	//��������
	ObjectDemo od = new ObjectDemo();
	Fu f=od.getFu();
	f.show();
	//�ȼ�
	od.getFu().show();
	
	od.getZi().show();
	
	}
	
}

