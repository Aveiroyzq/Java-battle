import java.net.InetAddress ;
public class InetAddressDemo{
	public static void main(String args[]) throws Exception {// �����쳣�׳�
		InetAddress locAdd = null ;
		InetAddress remAdd = null ;
		locAdd = InetAddress.getLocalHost() ;// �õ�����
		remAdd = InetAddress.getByName("http://www.mldnjava.cn/")  ;
		System.out.println("������IP��ַ��" + locAdd.getHostAddress()) ;
		System.out.println("MLDNJAVA��IP��ַ��" + remAdd.getHostAddress()) ;
		System.out.println("�����Ƿ�ɴ" + locAdd.isReachable(5000)) ;
	}
};