package org.lxh.demo08.h ;
import org.lxh.demo08.g.HelloDemo ;
class SubHelloDemo extends HelloDemo{
	public void print(){
		System.out.println("�����ܱ������ԣ�" + super.name) ;
	}
};
public class ProtectedDemo01{
	public static void main(String args[]){
		SubHelloDemo sub = new SubHelloDemo() ;
		sub.print() ;
	}
};