import java.net.DatagramPacket ;
import java.net.DatagramSocket ;

public class UDPClient{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		DatagramSocket ds = null ;		// ����������ݱ��Ķ���
		byte[] buf = new byte[1024] ;	// ���ٿռ䣬�Խ�������
		DatagramPacket dp = null ;		// ����DatagramPacket����
		ds = new DatagramSocket(9000) ;	// �ͻ�����9000�˿��ϵȴ�������������Ϣ
		dp = new DatagramPacket(buf,1024) ; // ���е���Ϣʹ��buf����
		ds.receive(dp)  ;	// ��������
		String str = new String(dp.getData(),0,dp.getLength()) + "from " + 
			dp.getAddress().getHostAddress() + "��" + dp.getPort() ;
		System.out.println(str) ;	// �������
	}
};