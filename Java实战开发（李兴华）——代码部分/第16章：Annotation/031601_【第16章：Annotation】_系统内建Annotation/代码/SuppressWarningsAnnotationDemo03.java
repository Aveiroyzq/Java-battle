@Deprecated
class Demo<T>{
	private T var ;
	public T getVar(){
		return this.var ;
	}
	public void setVar(T var){
		this.var = var ;
	}
};
public class SuppressWarningsAnnotationDemo03{
	@SuppressWarnings(value={"unchecked","deprecation"})
	public static void main(String args[]){
		Demo d = new Demo() ;
		d.setVar("李兴华") ;
		System.out.println("内容：" + d.getVar()) ;
	}
};