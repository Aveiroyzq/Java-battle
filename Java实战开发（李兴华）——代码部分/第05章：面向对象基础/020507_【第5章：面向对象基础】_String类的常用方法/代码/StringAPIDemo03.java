public class StringAPIDemo03{
	public static void main(String args[]){
		String str1 = "hello" ;			// �����ַ���
		byte b[] = str1.getBytes() ;	// ���ַ�����Ϊbyte����
		System.out.println(new String(b)) ;	// ��ȫ����byte�����Ϊ�ַ���
		System.out.println(new String(b,1,3)) ;	// �����ֵ�byte�����Ϊ�ַ���
	}
};