package org.lxh.demo16.reflectannotation ;
import java.lang.annotation.Retention ;
import java.lang.annotation.RetentionPolicy ;
@Retention(value=RetentionPolicy.RUNTIME)	// ��Annotation����ִ��ʱ��Ȼ��Ч
public @interface MyDefaultAnnotationReflect{
	public String key() default "LXH" ;
	public String value() default "���˻�" ;

}