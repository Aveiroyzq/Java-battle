package org.lxh.demo08 ;	// 定义一个包
class Demo{
	public String getInfo(){
		return "Hello World!!!" ;
	}
};
public class PackageDemo01{
	public static void main(String args[]){
		System.out.println(new Demo().getInfo());
	}
};