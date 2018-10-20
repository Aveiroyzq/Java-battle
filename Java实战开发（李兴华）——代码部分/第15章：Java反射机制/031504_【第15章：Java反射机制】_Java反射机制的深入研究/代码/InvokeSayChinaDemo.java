package org.lxh.demo15.invokedemo ;
import java.lang.reflect.Method ;
public class InvokeSayChinaDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// 实例化Class对象
		}catch(Exception e){}
		try{
			Method  met = c1.getMethod("sayChina") ;	// 找到sayChina()方法
			met.invoke(c1.newInstance()) ;	// 调用方法
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
};