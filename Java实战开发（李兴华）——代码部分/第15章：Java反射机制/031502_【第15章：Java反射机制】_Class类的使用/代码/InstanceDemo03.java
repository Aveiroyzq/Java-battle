package org.lxh.demo15.instancedemo ;
import java.lang.reflect.Constructor ;	// ���뷴����ư�
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
public class InstanceDemo03{
	public static void main(String args[]){
		Class<?> c = null ;		// ����Class����
		try{
			c = Class.forName("org.lxh.demo15.instancedemo.Person") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Person per = null ;	// ����Person����
		Constructor<?> cons[] = null ;
		cons = c.getConstructors() ;
		try{
			per = (Person)cons[0].newInstance("���˻�",30) ;	// ʵ��������
		}catch(Exception e){
			e.printStackTrace() ;
		}
		System.out.println(per) ;	// �������������toString()
	}
};