class A{
	private final String INFO = "INFO" ;	// 声明常量
	public final void print(){	// 使用final声明的方法不能被覆写
		INFO = "HELLO" ;
	}
};