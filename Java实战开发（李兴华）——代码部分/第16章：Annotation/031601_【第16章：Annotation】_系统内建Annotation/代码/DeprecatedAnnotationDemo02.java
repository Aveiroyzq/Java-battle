@Deprecated			// ����������ʹ�õĲ���
class Demo{
	public String getInfo(){
		return "����һ��Person�ࡣ" ;
	}
};
public class DeprecatedAnnotationDemo02{
	public static void main(String args[]){
		Demo d = new Demo() ;
		System.out.println(d.getInfo()) ;
	}
};