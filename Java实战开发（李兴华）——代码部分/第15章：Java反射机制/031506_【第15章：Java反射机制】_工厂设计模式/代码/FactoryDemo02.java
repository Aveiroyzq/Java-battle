package org.lxh.demo15.factorydemo02 ;
import java.util.Properties ;
import java.io.File ;
import java.io.FileOutputStream ;
import java.io.FileInputStream ;
interface Fruit{
	public void eat() ;	// 吃水果
}
class Apple implements Fruit{
	public void eat(){			// 覆写eat()方法
		System.out.println("** 吃苹果");
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** 吃橘子") ;
	}
};
class Init{
	public static Properties getPro(){
		Properties pro = new Properties() ;
		File f = new File("d:\\fruit.properties") ;	// 找到属性文件
		try{
			if(f.exists()){	// 文件存在
				pro.load(new FileInputStream(f)) ;	// 读取属性
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