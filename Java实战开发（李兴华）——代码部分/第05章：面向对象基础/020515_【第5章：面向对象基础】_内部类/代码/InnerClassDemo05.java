class Outer{		// �����ⲿ��
	private String info = "hello world" ;	// �����ⲿ���˽������
	public void fun(final int temp){		// �����ⲿ��ķ���
		class Inner{						// �ڷ����ж�����ڲ���
			public void print(){				// �����ڲ���ķ���
				System.out.println("���е����ԣ�" + info) ;		// ֱ�ӷ����ⲿ���˽������
				System.out.println("�����еĲ�����" + temp) ;
			}
		};
		new Inner().print() ;				// ͨ���ڲ����ʵ����������÷���
	}
};
public class InnerClassDemo05{
	public static void main(String args[]){
		new Outer().fun(30) ;	// �����ⲿ��ķ���
	}
};