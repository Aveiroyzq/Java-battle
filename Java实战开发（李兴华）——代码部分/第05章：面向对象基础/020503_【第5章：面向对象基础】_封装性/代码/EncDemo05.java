class Person{
	private String name ;			// ������������
	private int age ;				// ������������
	public void setName(String n){	// ��������
		name = n ;
	}
	public void setAge(int a){		// ��������
		if(a>=0&&a<=150){			// ������֤
			age = a ;
		}
	}
	public String getName(){		// ȡ������
		return name ;
	}
	public int getAge(){			// ȡ������
		return age ;
	}
	public void tell(){
		System.out.println("������" + this.getName() + "�����䣺" + this.getAge()) ;
	}
};
public class EncDemo05{
	public static void main(String arsgh[]){
		Person per = new Person() ;	// ������ʵ��������
		per.setName("����") ;		// ����setter��������
		per.setAge(-30) ;			// ����setter��������
		per.tell() ;				// �����Ϣ
	}
};