class Demo{
	{	// ֱ�������б�д����飬��Ϊ�����
		System.out.println("1������顣") ;
	}
	public Demo(){	// ���幹�췽��
		System.out.println("2�����췽����") ;
	}
};
public class CodeDemo02{
	public static void main(String args[]){
		new Demo() ;		// ʵ��������
		new Demo() ;		// ʵ��������
		new Demo() ;		// ʵ��������
	}
};