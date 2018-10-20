package org.lxh.demo15.factorydemo01 ;
interface Fruit{
	public void eat() ;	// ��ˮ��
}
class Apple implements Fruit{
	public void eat(){			// ��дeat()����
		System.out.println("** ��ƻ��");
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** ������") ;
	}
};
class Factory{
	public static Fruit getInstance(String className){
		Fruit fruit = null ;
		try{
			fruit = (Fruit)Class.forName(className).newInstance() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		return fruit ;
	}
};
public class FactoryDemo01{
	public static void main(String args[]){
		Fruit f = Factory.getInstance("org.lxh.demo15.factorydemo01.Apple") ;
		if(f!=null){
			f.eat() ;
		}
	}
};