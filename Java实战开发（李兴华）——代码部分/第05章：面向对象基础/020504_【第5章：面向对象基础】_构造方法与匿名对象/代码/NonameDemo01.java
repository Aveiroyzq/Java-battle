class Person{
	private String name ;
	private int age ;
	public Person(String n,int a){		// �������췽����Ϊ���е����Գ�ʼ��
		this.setName(n) ;
		this.setAge(a) ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		if(a>0&&a<150){
			age = a ;
		}
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public void tell(){
		System.out.println("������" + this.getName() + "�����䣺" + this.getAge()) ;
	}
};
public class NonameDemo01{
	public static void main(String args[]){
		new Person("����",30).tell() ;
	}
};