class Person{
	public String getInfo(){		// ȡ����Ϣ
		return "����һ��Person�ࡣ" ;
	}
};
class Student extends Person{	// �̳д���
	@Override
	public String getinfo(){	// ��д����
		return "����һ��Student�ࡣ" ;
	}
};
public class OverrideAnnotationDemo01{
	public static void main(String args[]){
		Person per = new Student() ;
		System.out.println(per.getInfo()) ;	// �����Ϣ
	}
};