import java.net.URL ;
import java.io.InputStream ;
import java.util.Scanner ;
public class URLDemo{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		URL url = new URL("http","www.mldnjava.cn",80,"/curriculum.htm") ;
		InputStream input = url.openStream() ;	// ��������
		Scanner scan = new Scanner(input) ;		// ʵ����Scanner��
		scan.useDelimiter("\n") ;	// ���ö�ȡ�ָ���
		while(scan.hasNext()){
			System.out.println(scan.next()) ;
		}
	}
};