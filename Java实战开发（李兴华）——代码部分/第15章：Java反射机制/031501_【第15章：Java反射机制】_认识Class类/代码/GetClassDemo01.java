package org.lxh.demo15.getclassdemo ;
class X{
};
public class GetClassDemo01{
	public static void main(String args[]){
		X x = new X() ;	// ʵ����X��Ķ���
		System.out.println(x.getClass().getName()) ;	// �õ��������ڵ���
	}
};