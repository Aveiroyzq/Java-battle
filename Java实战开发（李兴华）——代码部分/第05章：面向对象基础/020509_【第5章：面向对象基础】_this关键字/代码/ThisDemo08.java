class Person{		// ����Person��
	private String name ;	// ����
	private int age ;		// ����
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	public boolean compare(Person per){
		// ���ô˷���ʱ��������������󣺵�ǰ���󡢴���Ķ���
		Person p1 = this ;	// ��ǰ�Ķ��󣬾ͱ�ʾper1
		Person p2 = per ;	// ���ݽ����Ķ��󣬾ͱ�ʾper2
		if(p1==p2){	// �ж��ǲ���ͬһ�������õ�ַ�Ƚ�
			return true ;
		}
		// ֮��ֱ��ж�ÿһ�������Ƿ����
		if(p1.name.equals(p2.name)&&p1.age==p2.age){
			return true ;	// �����������
		}else{
			return false ;	// �����������
		}
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
public class ThisDemo08{
	public static void main(String args[]){
		Person per1 = new Person("����",30) ;	// ������������������ȫ���
		Person per2 = new Person("����",30) ;	// ������������������ȫ���
		// ֱ����������������ȡ�ø������Խ��бȽ�
		if(per1.compare(per2)){
			System.out.println("����������ȣ�") ;
		}else{
			System.out.println("����������ȣ�") ;
		}
	}
};