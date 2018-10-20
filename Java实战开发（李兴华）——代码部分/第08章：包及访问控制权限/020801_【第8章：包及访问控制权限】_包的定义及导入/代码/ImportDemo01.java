package org.lxh.demo08.b ;	// 放在不同的包中
import org.lxh.demo08.a.* ;	// 导入不同包中的Demo类
public class ImportDemo01{
	public static void main(String args[]){
		System.out.println(new Demo().getInfo()) ;
	}
};