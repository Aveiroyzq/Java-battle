package org.lxh.demo15.invokedemo ;
import java.lang.reflect.Array ;
public class ClassArrayDemo{
	public static void main(String args[]) throws Exception{
		int temp[] = {1,2,3} ;// 声明一整型数组
		Class<?> c = temp.getClass().getComponentType() ;	// 取得数组的Class对象
		System.out.println("类型：" + c.getName()) ;	// 取得数组类型名称
		System.out.println("长度：" + Array.getLength(temp)) ;
		System.out.println("第一个内容：" + Array.get(temp,0)) ;
		Array.set(temp,0,6) ;
		System.out.println("第一个内容：" + Array.get(temp,0)) ;
	}
};