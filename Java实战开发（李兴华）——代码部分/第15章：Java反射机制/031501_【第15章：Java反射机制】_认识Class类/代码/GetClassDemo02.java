package org.lxh.demo15.getclassdemo ;
class X{
};
public class GetClassDemo02{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ָ������
		Class<?> c2 = null ;		// ָ������
		Class<?> c3 = null ;		// ָ������
		try{
			// ���µĲ�����ʽ���ڿ�������õ�һ����ʽ
			c1 = Class.forName("org.lxh.demo15.getclassdemo.X") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		c2 = new X().getClass() ;		// ͨ��Object���еķ���ʵ����
		c3 = X.class ;	// ͨ����.classʵ����
		System.out.println("�����ƣ�" + c1.getName())  ;	// �õ��������
		System.out.println("�����ƣ�" + c2.getName())  ;	// �õ��������
		System.out.println("�����ƣ�" + c3.getName())  ;	// �õ��������
	}
};