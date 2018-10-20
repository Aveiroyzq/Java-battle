import java.lang.reflect.InvocationHandler ;
import java.lang.reflect.Proxy ;
import java.lang.reflect.Method ;
interface Subject{
	public String say(String name,int age) ;	// ������󷽷�say
}
class RealSubject implements Subject{	// ʵ�ֽӿ�
	public String say(String name,int age){
		return "������" + name + "�����䣺" + age ;
	}
};
class MyInvocationHandler implements InvocationHandler{
	private Object obj ;
	public Object bind(Object obj){
		this.obj = obj ;	// ��ʵ������
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this) ;
	}
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		Object temp = method.invoke(this.obj,args) ;	// ���÷���
		return temp ;
	}
};
public class DynaProxyDemo{
	public static void main(String args[]){
		Subject sub = (Subject)new MyInvocationHandler().bind(new RealSubject()) ;
		String info = sub.say("���˻�",30) ;
		System.out.println(info) ;
	}
};