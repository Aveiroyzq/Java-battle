package org.lxh.demo15.instancedemo ;
class Person{
	private String name ;	// name����
	private int age ;		// age����
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age);
	}
	public void setName(String name){
		this.name = name ;
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
	public String toString(){	// ��дtoString()����
		return "������" + this.name + "�����䣺" + this.age  ;
	}
};
public class InstanceDemo02{
	public static void main(String args[]){
		Class<?> c = null ;		// ����Class����
		try{
			c = Class.forName("org.lxh.demo15.instancedemo.Person") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Person per = null ;	// ����Person����
		try{
			per = (Person)c.newInstance() ;	// ʵ��������
		}catch(Exception e){
			e.printStackTrace() ;
		}
		per.setName("���˻�") ;		// ��������
		per.setAge(30) ;				// ��������
		System.out.println(per) ;	// �������������toString()
	}
};