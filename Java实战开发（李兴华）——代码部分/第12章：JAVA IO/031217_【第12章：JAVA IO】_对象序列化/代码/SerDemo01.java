import java.io.File ;
import java.io.FileOutputStream ;
import java.io.OutputStream ;
import java.io.ObjectOutputStream ;
public class SerDemo01{
	public static void main(String args[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// 定义保存路径
		ObjectOutputStream oos = null ;	// 声明对象输出流
		OutputStream out = new FileOutputStream(f) ;	// 文件输出流
		oos = new ObjectOutputStream(out) ;
		oos.writeObject(new Person("张三",30)) ;	// 保存对象
		oos.close() ;	// 关闭
	}
};