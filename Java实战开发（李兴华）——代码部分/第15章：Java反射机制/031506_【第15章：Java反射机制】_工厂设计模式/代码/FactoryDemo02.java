package org.lxh.demo15.factorydemo02 ;
import java.util.Properties ;
import java.io.File ;
import java.io.FileOutputStream ;
import java.io.FileInputStream ;
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
class Init{
	public static Properties getPro(){
		Properties pro = new Properties() ;
		File f = new File("d:\\fruit.properties") ;	// �ҵ������ļ�
		try{
			if(f.exists()){	// �ļ�����
				pro.load(new FileInputStream(f)) ;	// ��ȡ����
			}else{
				pro.setProperty("apple","org.lxh.demo15.factorydemo02.Apple") ;
				pro.setProperty("orange","org.lxh.demo15.factorydemo02.Orange") ;
				pro.store(new FileOutputStream(f),"FRUIT CLASS") ;
			}
		}catch(Exception e){}
		return pro ;
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
public class FactoryDemo02{
	public static void main(String args[]){
		Properties pro = Init.getPro() ;
		Fruit f = Factory.getInstance(pro.getProperty("apple")) ;
		if(f!=null){
			f.eat() ;
		}
	}
};