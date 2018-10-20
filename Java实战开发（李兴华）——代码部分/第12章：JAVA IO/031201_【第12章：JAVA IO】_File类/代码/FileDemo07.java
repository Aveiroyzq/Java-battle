import java.io.File ;
import java.io.IOException ;
public class FileDemo07{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"mldn") ;		// 实例化File类的对象
		f.mkdir() ;	// 创建文件夹
	}
};