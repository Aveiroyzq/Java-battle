class Person{		// 定义父类
	private void print(){	// 默认的访问权限
		System.out.println("Person --> void print()。") ;
	}
	public void fun(){	// 定义一个fun方法
		this.print() ;	// 调用print()方法
	}
};
class Student extends Person{	// 定义继承关系
	void print(){	// 覆写父类中的方法
		// super.print() ;	// 访问父类中被子类覆写过的方法
		System.out.println("Student --> void print()。") ;
	}
};
public class OverrideDemo04{
	public static void main(String args[]){
		Student s = new Student() ;
		s.fun() ;
	}
};