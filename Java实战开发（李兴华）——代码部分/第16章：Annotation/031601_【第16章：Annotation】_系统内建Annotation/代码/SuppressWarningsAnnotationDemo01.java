class Demo<T>{
	private T var ;
	public T getVar(){
		return this.var ;
	}
	public void setVar(T var){
		this.var = var ;
	}
};
public class SuppressWarningsAnnotationDemo01{
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		Demo d = new Demo() ;
		d.setVar("���˻�") ;
		System.out.println("���ݣ�" + d.getVar()) ;
	}
};