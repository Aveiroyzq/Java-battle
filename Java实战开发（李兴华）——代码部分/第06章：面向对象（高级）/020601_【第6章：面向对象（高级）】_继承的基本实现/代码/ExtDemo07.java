class Person{					// ����Person��
	private String name ;		// ����name����
	private int age ;			// ����age����
	public void setName(String name){
		this.name = name;	
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};
class Student extends Person{					// ����Student��
	public void fun(){
		System.out.println("�����е�name���ԣ�" + getName()) ;	// ��ȷ����ӷ���
		System.out.println("�����е�age���ԣ�" + getAge()) ;	// ��ȷ����ӷ���
	}

};