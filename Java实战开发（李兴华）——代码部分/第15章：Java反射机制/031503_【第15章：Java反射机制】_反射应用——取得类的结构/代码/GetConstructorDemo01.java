package org.lxh.demo15.classinfodemo ;
import java.lang.reflect.Constructor ;	// 导入构造方法的包
public class GetConstructorDemo01{
	public static void main(String args[]){
		Class<?> c1 = null ;		// 声明Class对象
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// 实例化对象
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Constructor<?> con[] = c1.getConstructors() ;	// 取得一个类中的全部构造
		for(int i=0;i<con.length;i++){
			System.out.println("构造方法：" + con[i]) ;	 // 输出构造，直接打印
		}
	}
};