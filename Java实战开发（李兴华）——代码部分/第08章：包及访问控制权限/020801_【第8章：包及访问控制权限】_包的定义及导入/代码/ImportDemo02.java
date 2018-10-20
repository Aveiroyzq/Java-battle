package org.lxh.demo08.d ;
import org.lxh.demo08.a.* ;		// 包中存在Demo类
import org.lxh.demo08.c.* ;		// 包中存在Demo类
public class ImportDemo02{
	public static void main(String args[]){
		org.lxh.demo08.a.Demo d = new org.lxh.demo08.a.Demo() ;
		System.out.println(d.getInfo()) ;
	}
};