public class StringAPIDemo05{
	public static void main(String args[]){
		String str1 = "abcdefgcgh" ;				// �����ַ���
		System.out.println(str1.indexOf("c")) ;		// �鵽����λ��
		System.out.println(str1.indexOf("c",3)) ;	// �鵽����λ�ã��ӵ�4��λ�ÿ�ʼ����
		System.out.println(str1.indexOf("x")) ;		// û�в鵽����-1
	}
};