import java.io.File ;
import java.io.IOException ;
public class FileDemo04{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"test.txt") ;		// 实例化File类的对象
		f.delete() ;	// 删除文件
	}
};