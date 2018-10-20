import org.lxh.demo16.reflectannotation.MyDefaultAnnotationReflect ;
import java.lang.annotation.Annotation ;
import java.lang.reflect.Method ;
public class ReflectDemo02{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		Class <?> c = null ;
		c = Class.forName("org.lxh.demo16.reflectannotation.SimpleBeanTwo") ;
		Method toM = c.getMethod("toString") ;	// �ҵ�toString()����
		if(toM.isAnnotationPresent(MyDefaultAnnotationReflect.class)){
			// �ж��Ƿ���ָ����Annotation
			MyDefaultAnnotationReflect mda = null ;
			mda = toM.getAnnotation(MyDefaultAnnotationReflect.class) ;	// �õ�ָ����Annotation
			String key = mda.key() ;	// ȡ�����õ�key
			String value = mda.value() ;	// ȡ�����õ�value
			System.out.println("key = " + key) ;
			System.out.println("value = " + value) ;
		}
	}
};