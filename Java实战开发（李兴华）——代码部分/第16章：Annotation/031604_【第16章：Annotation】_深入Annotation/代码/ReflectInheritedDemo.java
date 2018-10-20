import java.lang.annotation.Annotation ;
import org.lxh.demo16.inheriteddemo.MyInheritedAnnotation ;
public class ReflectInheritedDemo{
	public static void main(String args[]) throws Exception{
		Class<?> c = null ;
		c = Class.forName("org.lxh.demo16.inheriteddemo.Student") ;
		Annotation ann[] = c.getAnnotations() ;	// ȡ��ȫ����Annotation
		for(Annotation a:ann){	// ���
			System.out.println(a) ;
		}
		// ����ȡ�ô�Annotation���õ�����
		if(c.isAnnotationPresent(MyInheritedAnnotation.class)){
			MyInheritedAnnotation mda = null ;
			mda = c.getAnnotation(MyInheritedAnnotation.class) ;
			String name = mda.name() ;	// ȡ��name������
			System.out.println("name = " + name) ;
		}
	}
}