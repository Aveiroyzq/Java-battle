class Person{		// 定义父类
	void print(){	// 默认的访问权限
		System.out.println("Person --> void print()。") ;
	}
};
class Student extends Person{	// 定义继承关系
	public void print(){
		super.print() ;	// 访问父类中被子类覆写过的方法
		System.out.println("Student --> void print()。") ;
	}
};
public class OverrideDemo03{
	public static void main(String args[]){
		Student s = new Student() ;
		s.print() ;
	}
};