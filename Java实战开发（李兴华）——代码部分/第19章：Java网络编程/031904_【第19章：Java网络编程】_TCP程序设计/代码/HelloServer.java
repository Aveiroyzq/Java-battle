import java.net.* ;
import java.io.* ;
public class HelloServer{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		ServerSocket server = null ;		// ����ServerSocket��
		Socket client = null ;	// ��ʾ�� ����
		PrintStream out = null ;		// ��ӡ��������
		server = new ServerSocket(8888) ;	// ��������8888�˿��ϼ���
		System.out.println("���������У��ȴ��ͻ������ӡ�") ;
		client = server.accept() ;		// �õ����ӣ�������뵽����״̬
		String str = "hello world" ;	// ��ʾҪ�������Ϣ
		out = new PrintStream(client.getOutputStream()) ;
		out.println(str) ;	// ��ͻ��������Ϣ
		client.close() ;
		server.close() ;
	}
};