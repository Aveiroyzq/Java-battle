class Outer{		// �����ⲿ��
	private String info = "hello world" ;	// �����ⲿ���˽������
	class Inner{	// �����ڲ���
		public void print(){				// �����ڲ���ķ���
			System.out.println(info) ;		// ֱ�ӷ����ⲿ���˽������
		}
	};
	public void fun(){						// �����ⲿ��ķ���
		new Inner().print() ;				// ͨ���ڲ����ʵ����������÷���
	}
};
public class InnerClassDemo04{
	public static void main(String args[]){
		Outer out = new Outer()	;			// �ⲿ��ʵ��������
		Outer.Inner in = out.new Inner() ;	// ʵ�����ڲ������
		in.print() ;						// �����ڲ���ķ���
	}
};