package org.lxh.demo15.getclassdemo ;
class X{
};
public class GetClassDemo02{
	public static void main(String args[]){
		Class<?> c1 = null ;		// 指定泛型
		Class<?> c2 = null ;		// 指定泛型
		Class<?> c3 = null ;		// 指定泛型
		try{
			// 以下的操作形式是在开发中最常用的一种形式
			c1 = Class.forName("org.lxh.demo15.getclassdemo.X") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		c2 = new X().getClass() ;		// 通过Object类中的方法实例化
		c3 = X.class ;	// 通过类.class实例化
		System.out.println("类名称：" + c1.getName())  ;	// 得到类的名称
		System.out.println("类名称：" + c2.getName())  ;	// 得到类的名称
		System.out.println("类名称：" + c3.getName())  ;	// 得到类的名称
	}
};