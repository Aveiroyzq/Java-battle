import java.lang.annotation.Target ;
import java.lang.annotation.ElementType ;
import java.lang.annotation.Retention ;
import java.lang.annotation.RetentionPolicy ;
@Target({ElementType.TYPE,ElementType.METHOD})		// ��ע��ֻ����������
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyTargetAnntation{
	public String key() default "LXH" ;
	public String value() default "���˻�" ;
}