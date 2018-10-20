import java.lang.annotation.Target ;
import java.lang.annotation.ElementType ;
import java.lang.annotation.Retention ;
import java.lang.annotation.RetentionPolicy ;
@Target({ElementType.TYPE,ElementType.METHOD})		// 此注释只能用在类上
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyTargetAnntation{
	public String key() default "LXH" ;
	public String value() default "李兴华" ;
}