import java.util.Random;

class FK{
	void bx(){
		System.out.println("����");
	}

}



class FK_szx extends FK{//ɽ����
	void bx(){
		System.out.println("ɽ�����ڱ���");
	
	}

}

class FK_lzx extends FK{//L����
	void bx(){
		System.out.println("L�����ڱ���");
	}
}





class FK_zzx extends FK{//z����
	void bx(){
		System.out.println("z�����ڱ���");
    }
}


class FK_cfx extends FK{//������
	void bx(){
		System.out.println("�������ڱ���");
    }

}

class FK_tzx extends FK{
	void bx(){
		System.out.println("�������ڱ���");
	}
}


class M{
	public static void main(String[] args){
		Random r=new Random();
		int a=r.nextInt(5);
		FK fk=null;
		switch(a){
		case 0:
			fk=new FK_szx();//����ת��
			break;
		case 1:
		fk=new FK_lzx();
			break;
		case 2:
			fk=new FK_zzx();
			break;
		case 3:
		fk=new FK_cfx();
			break;
		case 4:
		fk=new FK_tzx();
		break;
		}
		
		fk.bx();
	
	}
}