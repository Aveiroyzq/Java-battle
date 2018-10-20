import java.net.* ;
import java.io.* ;
public class EchoServer{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		ServerSocket server = null ;		// ����ServerSocket��
		Socket client = null ;	// ��ʾ�� ����
		BufferedReader buf = null ;	// ����������
		PrintStream out = null ;		// ��ӡ��������
		server = new ServerSocket(8888) ;	// ��������8888�˿��ϼ���
		boolean f = true ;	// ��������λ
		while(f){
			System.out.println("���������У��ȴ��ͻ������ӡ�") ;
			client = server.accept() ;		// �õ����ӣ�������뵽����״̬
			out = new PrintStream(client.getOutputStream()) ;
			// ׼�����տͻ��˵�������Ϣ
			buf = new BufferedReader(new InputStreamReader(client.getInputStream())) ;
			boolean flag = true ;	// ��־λ����ʾ����һֱ���ղ���Ӧ��Ϣ
			while(flag){
				String str = buf.readLine() ;		// ���տͻ��˷��͵�����
				if(str==null||"".equals(str)){	// ��ʾû������
					flag = false ;	// �˳�ѭ��
				}else{
					if("bye".equals(str)){	// ������������Ϊbye��ʾ����
						flag = false ;
					}else{
						out.println("ECHO : " + str) ;	// ��Ӧ��Ϣ
					}
				}
			}
			client.close() ;
		}
		server.close() ;
	}
};