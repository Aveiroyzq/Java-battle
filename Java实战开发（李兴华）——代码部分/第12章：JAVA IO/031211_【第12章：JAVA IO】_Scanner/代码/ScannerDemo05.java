import java.util.* ;
import java.text.* ;
import java.io.* ;
public class ScannerDemo05{
	public static void main(String args[]){
		File f = new File("D:" + File.separator + "test.txt") ;	// 指定操作文件
		Scanner scan = null ;
		try{
			scan = new Scanner(f) ;	// 从键盘接收数据
		}catch(Exception e){}
		StringBuffer str = new StringBuffer() ;
		while(scan.hasNext()){
			str.append(scan.next()).append('\n')	;	//	取数据
		}
		System.out.println("文件内容为：" + str) ;
	}
};