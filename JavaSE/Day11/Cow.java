public class Cow{
	private double weigth;
	
	//�ⲿ����������صĹ�����
	public Cow(){}
	public Cow(double weigth){
		this.weigth=weigth;
	}
	
	//����һ���Ǿ�̬�ڲ���
	private class CowLeg{
	//�Ǿ�̬�ڲ��������Field
	private double length;
	private String color;
	
	//�Ǿ�̬�ڲ�����������صĹ�����
	public Cowleg(){}
	public CowLeg(double length, String color){
		this.length = length;
		this.color = color;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return this.length;
	
	}
	public void setColor(String color){
		this.color=color;
	
	}
	public String getColor(){
		return this.color;
	}
	
	//�Ǿ�̬�ڲ����ʵ������
	public void info(){
		System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+ color + ", �ߣ�" + length);
		//ֱ�ӷ����ⲿ���private���ε�Filed
		System.out.println("��ţ��������ţ�أ�"+weight); //
	}
}
	public void test(){
		CowLeg c1 = new CowLeg(1.12 , "�ڰ���ͬ");
		c1.info();
	}
	public static void main(String[] args){
		Cow = new Cow(378.9);
		cow.test();
	}
}