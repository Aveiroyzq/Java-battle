public class WrapperDemo04{
	public static void main(String args[]){
		String str1 = "30" ;	// ��������ɵ��ַ���
		String str2 = "30.3" ;	// ��������ɵ��ַ���
		int x = Integer.parseInt(str1) ;	// ���ַ�����Ϊint��
		float f = Float.parseFloat(str2) ;	// ���ַ�����Ϊint��
		System.out.println("�����˷���" + x + " * " + x + " = " + (x * x)) ;
		System.out.println("С���˷���" + f + " * " + f + " = " + (f * f)) ;
	}
};