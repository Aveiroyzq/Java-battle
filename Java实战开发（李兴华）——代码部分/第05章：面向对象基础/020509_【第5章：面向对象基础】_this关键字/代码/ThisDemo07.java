class Person{		// ����Person��
	private String name ;	// ����
	private int age ;		// ����
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	public void setName(String name){	// ��������
		this.name = name ;
	}
	public void setAge(int age){		// ��������
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};
public class ThisDemo07{
	public static void main(String args[]){
		Person per1 = new Person("����",30) ;	// ������������������ȫ���
		Person per2 = new Person("����",30) ;	// ������������������ȫ���
		// ֱ����������������ȡ�ø������Խ��бȽ�
		if(per1.getName().equals(per2.getName())&&per1.getAge()==per2.getAge()){
			System.out.println("����������ȣ�") ;
		}else{
			System.out.println("����������ȣ�") ;
		}
	}
};