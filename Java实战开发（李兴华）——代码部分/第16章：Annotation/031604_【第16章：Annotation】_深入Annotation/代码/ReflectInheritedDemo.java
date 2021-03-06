import java.lang.annotation.Annotation ;
import org.lxh.demo16.inheriteddemo.MyInheritedAnnotation ;
public class ReflectInheritedDemo{
	public static void main(String args[]) throws Exception{
		Class<?> c = null ;
		c = Class.forName("org.lxh.demo16.inheriteddemo.Student") ;
		Annotation ann[] = c.getAnnotations() ;	// 取得全部的Annotation
		for(Annotation a:ann){	// 输出
			System.out.println(a) ;
		}
		// 继续取得此Annotation设置的内容
		if(c.isAnnotationPresent(MyInheritedAnnotation.class)){
			MyInheritedAnnotation mda = null ;
			mda = c.getAnnotation(MyInheritedAnnotation.class) ;
			String name = mda.name() ;	// 取出name的内容
			System.out.println("name = " + name) ;
		}
	}
}