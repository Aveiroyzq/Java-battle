public class WrapperDemo05{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]) ;	// ���ַ�����Ϊint��
		float f = Float.parseFloat(args[1]) ;	// ���ַ�����Ϊint��
		System.out.println("�����˷���" + x + " * " + x + " = " + (x * x)) ;
		System.out.println("С���˷���" + f + " * " + f + " = " + (f * f)) ;
	}
};