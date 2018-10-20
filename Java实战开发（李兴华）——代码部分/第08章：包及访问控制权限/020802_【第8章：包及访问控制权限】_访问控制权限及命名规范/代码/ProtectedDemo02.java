package org.lxh.demo08.h ;
import org.lxh.demo08.g.HelloDemo ;
public class ProtectedDemo02{
	public static void main(String args[]){
		HelloDemo sub = new HelloDemo() ;
		System.out.println(sub.name) ;	// 错误的，不同包的类无法访问
	}
};