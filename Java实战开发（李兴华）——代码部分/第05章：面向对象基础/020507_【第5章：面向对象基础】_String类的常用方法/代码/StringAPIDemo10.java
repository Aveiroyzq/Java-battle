public class StringAPIDemo10{
	public static void main(String args[]){
		String str1 = "**HELLO" ;			// �����ַ���
		String str2 = "HELLO**" ;			// �����ַ���
		if(str1.startsWith("**")){			// �ж��Ƿ��ԡ�**����ͷ
			System.out.println("��**HELLO����**��ͷ") ;
		}
		if(str2.endsWith("**")){			// �ж��Ƿ��ԡ�**����β
			System.out.println("��HELLO**����**��β") ;
		}
	}
};