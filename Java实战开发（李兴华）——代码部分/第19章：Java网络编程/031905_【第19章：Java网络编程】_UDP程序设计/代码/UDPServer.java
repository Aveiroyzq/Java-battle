import java.net.DatagramPacket ;
import java.net.DatagramSocket ;
import java.net.InetAddress ;

public class UDPServer{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		DatagramSocket ds = null ;		// ���巢�����ݱ��Ķ���
		DatagramPacket dp = null ;		// ����DatagramPacket����
		ds = new DatagramSocket(3000) ;	// �������3000�˿��ϵȴ�������������Ϣ\
		String str = "hello World!!!" ;
		dp = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("localhost"),9000) ; // ���е���Ϣʹ��buf����
		System.out.println("������Ϣ��") ;
		ds.send(dp);	// ������Ϣ��ȥ
		ds.close() ;
	}
};