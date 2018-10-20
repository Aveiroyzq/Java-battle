import java.io.File ;
import java.io.IOException ;
public class FileDemo09{
	public static void main(String args[]){
		File f = new File("d:"+File.separator) ;		// 实例化File类的对象
		File files[] = f.listFiles() ;	// 列出全部内容
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]) ;
		}
	}
};