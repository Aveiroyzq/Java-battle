class Demo{
	@Deprecated			// 声明不建议使用的操作
	public String getInfo(){
		return "这是一个Person类。" ;
	}
};
public class DeprecatedAnnotationDemo01{
	public static void main(String args[]){
		Demo d = new Demo() ;
		System.out.println(d.getInfo()) ;
	}
};