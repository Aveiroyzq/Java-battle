public class LoginDemo01{
	public static void main(String args[]){
		if(args.length!=2){			// Ӧ���ж�����Ĳ��������Ƿ���2
			System.out.println("����Ĳ�������ȷ��ϵͳ�˳���") ;	// ����һ����ȷ�ĸ�ʽ
			System.out.println("��ʽ��java LoginDemo01 �û��� ����") ;
			System.exit(1) ;		// ϵͳ�˳�
		}
		String name = args[0] ;		// ȡ���û���
		String password = args[1] ;	// ȡ������
		if(name.equals("lixinghua")&&password.equals("mldn")){	// ��֤
			System.out.println("��ӭ" + name + "���٣�") ;
		}else{
			System.out.println("������û��������룡") ;
		}
	}
};