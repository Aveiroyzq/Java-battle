import java.lang.annotation.Retention ;
import java.lang.annotation.RetentionPolicy ;
@Retention(value=RetentionPolicy.RUNTIME)	// ��ʾ��Annotation������ʱ��Ч
public @interface MyDefaultRententionAnnotation{
	public String name() default "���˻�" ;
}