package org.lxh.demo08.f ;
import static org.lxh.demo08.e.Operate.* ;	// ��̬����
public class StaticImportDemo{
	public static void main(String args[]){
		System.out.println("3 + 3 = " + add(3,3)) ;	// ֱ�ӵ��þ�̬����
		System.out.println("3 - 2 = " + sub(3,2)) ;	// ֱ�ӵ��þ�̬����
		System.out.println("3 * 3 = " + mul(3,3)) ;	// ֱ�ӵ��þ�̬����
		System.out.println("3 / 3 = " + div(3,3)) ;	// ֱ�ӵ��þ�̬����
	}
};