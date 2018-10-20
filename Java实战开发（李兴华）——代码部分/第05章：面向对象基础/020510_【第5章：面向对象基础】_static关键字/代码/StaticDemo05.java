class Person{	// 定义Person类
	private static String country = "A城" ;	 // 定义静态属性
	private String name = "Hello" ;
	public static void sFun(String c){
		System.out.println("name = " + name) ;	// 错误，不能调用非static属性
		fun() ;									// 错误，不能调用非static方法
	}
	public void fun(){
		System.out.println("World") ;
	}
};
