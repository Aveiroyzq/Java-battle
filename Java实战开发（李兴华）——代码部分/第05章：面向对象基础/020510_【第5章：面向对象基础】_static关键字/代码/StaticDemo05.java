class Person{	// ����Person��
	private static String country = "A��" ;	 // ���徲̬����
	private String name = "Hello" ;
	public static void sFun(String c){
		System.out.println("name = " + name) ;	// ���󣬲��ܵ��÷�static����
		fun() ;									// ���󣬲��ܵ��÷�static����
	}
	public void fun(){
		System.out.println("World") ;
	}
};
