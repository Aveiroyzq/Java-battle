import java.io.* ;
public class PrintDemo01{
	public static void main(String arg[]) throws Exception{
		PrintStream ps = null ;		// ������ӡ������
		// ���������ʹ��FileOuputStreamʵ��������ζ�����е���������ļ�֮��
		ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt"))) ;
		ps.print("hello ") ;
		ps.println("world!!!") ;
		ps.print("1 + 1 = " + 2) ;
		ps.close() ;
	}
};