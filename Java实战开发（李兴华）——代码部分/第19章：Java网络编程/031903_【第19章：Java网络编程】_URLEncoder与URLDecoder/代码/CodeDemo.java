import java.net.URLDecoder ;
import java.net.URLEncoder ;
public class CodeDemo{
	public static void main(String args[]) throws Exception{
		String keyWord = "���˻�" ;	 
		String encod = URLEncoder.encode(keyWord,"UTF-8") ;	// ���б���Ĳ���
		System.out.println("����֮������ݣ�" + encod) ;
		String decod = URLDecoder.decode(encod,"UTF-8") ; // ���н������
		System.out.println("����֮������ݣ�" + decod) ;
	}
};