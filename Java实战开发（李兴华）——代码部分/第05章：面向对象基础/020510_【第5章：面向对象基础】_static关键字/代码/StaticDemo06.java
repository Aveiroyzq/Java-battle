class Demo{	// ����Person��
	private static int count = 0 ;	// ���ж����������
	public Demo(){
		count++ ;					 // ֻҪ�ж��������Ӧ������
		System.out.println("������" + count + "������") ;
	} 
};
public class StaticDemo06{
	public static void main(String args[]){
		new Demo() ;			// �����¶���
		new Demo() ;			// �����¶���
		new Demo() ;			// �����¶���
	}
};