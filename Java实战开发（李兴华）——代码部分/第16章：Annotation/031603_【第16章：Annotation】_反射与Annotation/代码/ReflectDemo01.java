import java.lang.annotation.Annotation ;
import java.lang.reflect.Method ;
public class ReflectDemo01{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		Class <?> c = null ;
		c = Class.forName("org.lxh.demo16.reflectannotation.SimpleBeanOne") ;
		Method toM = c.getMethod("toString") ;	// �ҵ�toString()����
		Annotation an[] = toM.getAnnotations() ;	// ȡ��ȫ����Annotation
		for(Annotation a:an){	// ʹ�� foreach���
			System.out.println(a) ;
		}
	}
};