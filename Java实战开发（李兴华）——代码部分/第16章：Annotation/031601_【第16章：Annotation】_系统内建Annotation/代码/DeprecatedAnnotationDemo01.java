class Demo{
	@Deprecated			// ����������ʹ�õĲ���
	public String getInfo(){
		return "����һ��Person�ࡣ" ;
	}
};
public class DeprecatedAnnotationDemo01{
	public static void main(String args[]){
		Demo d = new Demo() ;
		System.out.println(d.getInfo()) ;
	}
};