import java.io.File ;
import java.io.IOException ;
public class FileDemo10{
	public static void main(String args[]){
		File f = new File("d:"+File.separator) ;		// 实例化File类的对象
		if(f.isDirectory()){	// 判断是否是目录
			System.out.println(f.getPath() + "路径是目录。") ;
		}else{
			System.out.println(f.getPath() + "路径不是目录。") ;
		}
	}
};