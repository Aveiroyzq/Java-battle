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
public class InnerClassDemo01{
	public static void main(String args[]){
		new Outer().fun() ;					// �����ⲿ���fun()����
	}
};