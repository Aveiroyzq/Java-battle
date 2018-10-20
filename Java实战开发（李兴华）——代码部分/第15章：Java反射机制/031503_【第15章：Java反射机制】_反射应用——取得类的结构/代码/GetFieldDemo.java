package org.lxh.demo15.classinfodemo ;
import java.lang.reflect.Field ;	// 导入构造方法的包
import java.lang.reflect.Modifier ;	// 导入构造方法的包
public class GetFieldDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;		// 声明Class对象
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// 实例化对象
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		{	// 本类属性
			Field f[] = c1.getDeclaredFields() ;	// 取得本类中的属性
			for(int i=0;i<f.length;i++){
				Class<?> r = f[i].getType() ;	// 得到属性类型
				int mo = f[i].getModifiers() ;	// 得到修饰符的数字
				String priv = Modifier.toString(mo) ; // 还原修饰符
				System.out.print("本类属性：") ;
				System.out.print(priv + " ") ;	
				System.out.print(r.getName() + " ") ;	// 得到属性类型
				System.out.print(f[i].getName()) ;	// 输出属性名称
				System.out.println(" ;") ;
			}
		}
		{	// 公共属性
			Field f[] = c1.getFields() ;	// 取得本类中的公共属性
			for(int i=0;i<f.length;i++){
				Class<?> r = f[i].getType() ;	// 得到属性类型
				int mo = f[i].getModifiers() ;	// 得到修饰符的数字
				String priv = Modifier.toString(mo) ; // 还原修饰符
				System.out.print("公共属性：") ;
				System.out.print(priv + " ") ;	
				System.out.print(r.getName() + " ") ;	// 得到属性类型
				System.out.print(f[i].getName()) ;	// 输出属性名称
				System.out.println(" ;") ;
			}
		}
	}
};