class Demo{
	{	// ֱ�������б�д����飬��Ϊ�����
		System.out.println("1������顣") ;
	}
	static{	// ʹ��static����Ϊ��̬�����
		System.out.println("0����̬�����") ;
	}
	public Demo(){	// ���幹�췽��
		System.out.println("2�����췽����") ;
	}
};
public class CodeDemo03{
	static{		// �����������ڵ����ж��徲̬��
		System.out.println("���������������ж���Ĵ����") ;
	}
	public static void main(String args[]){
		new Demo() ;		// ʵ��������
		new Demo() ;		// ʵ��������
		new Demo() ;		// ʵ��������
	}
};