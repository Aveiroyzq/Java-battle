class Outer{		// �����ⲿ��
	private static String info = "hello world" ;	// �����ⲿ���˽������
	static class Inner{	// ʹ��static�����ڲ���Ϊ�ⲿ��
		public void print(){				// �����ڲ���ķ���
			System.out.println(info) ;		// ֱ�ӷ����ⲿ���˽������
		}
	};
	public void fun(){						// �����ⲿ��ķ���
		new Inner().print() ;				// ͨ���ڲ����ʵ����������÷���
	}
};
public class InnerClassDemo03{
	public static void main(String args[]){
		new Outer.Inner().print() ;					// �����ⲿ���fun()����
	}
};