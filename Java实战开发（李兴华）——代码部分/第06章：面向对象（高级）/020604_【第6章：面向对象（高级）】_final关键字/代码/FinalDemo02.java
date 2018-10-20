class A{
	public final void print(){	// 使用final声明的方法不能被覆写
		System.out.println("HELLO") ;
	}
};
class B extends A{
	public void print(){	// 错误，不能被覆写
		System.out.println("MLDN") ;
	}
};