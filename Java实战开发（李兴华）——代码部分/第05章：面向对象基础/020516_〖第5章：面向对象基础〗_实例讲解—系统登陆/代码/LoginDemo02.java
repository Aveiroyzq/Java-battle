class Check{		// ��ɾ������֤����
	public boolean validate(String name,String password){
		if(name.equals("lixinghua")&&password.equals("mldn")){		// ��֤
			return true ;
		}else{
			return false ;
		}
	}
};
class Operate{					// ����ֻ�ǵ��þ������֤�Ĳ���
	private String info[] ;		// ����һ���������ԣ����ڽ���ȫ���������
	public Operate(String info[]){
		this.info = info ;		// ͨ�����췽��ȡ��ȫ�����������
	}
	public String login(){
		Check check = new Check() ;	// ʵ����Check�������ڼ����Ϣ
		this.isExit() ;				// �ж�����Ĳ����Ƿ���ȷ
		String str = null ;			// ���ڷ�����Ϣ
		String name = this.info[0] ;// ȡ������
		String password = this.info[1] ;	// ȡ������
		if(check.validate(name,password)){	// ��½��֤
			str = "��ӭ" + name + "���٣�" ;
		}else{
			str = "������û��������룡" ;
		}
		return str ;
	}
	public void isExit(){			// �жϲ����������������Ƿ��˳�����
		if(this.info.length!=2){
			System.out.println("����Ĳ�������ȷ��ϵͳ�˳���") ;	// ����һ����ȷ�ĸ�ʽ
			System.out.println("��ʽ��java LoginDemo02 �û��� ����") ;
			System.exit(1) ;		// ϵͳ�˳�
		}
	}
};
public class LoginDemo02{
	public static void main(String args[]){
		Operate oper = new Operate(args) ;		// ʵ����������Ķ���
		System.out.println(oper.login()) ;		// ȡ����֤֮�����Ϣ
	}
};