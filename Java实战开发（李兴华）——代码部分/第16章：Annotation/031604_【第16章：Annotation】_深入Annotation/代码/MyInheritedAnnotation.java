package org.lxh.demo16.inheriteddemo ;
import java.lang.annotation.Retention ;
import java.lang.annotation.RetentionPolicy ;
import java.lang.annotation.Documented ;
import java.lang.annotation.Inherited ;
@Documented
@Inherited
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyInheritedAnnotation{
	public String name() ;

}