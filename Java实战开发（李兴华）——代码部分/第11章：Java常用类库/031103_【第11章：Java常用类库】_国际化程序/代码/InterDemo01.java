import java.util.ResourceBundle ;
public class InterDemo01{
	public static void main(String args[]){
		ResourceBundle rb = ResourceBundle.getBundle("Message") ;	// 找到资源文件，不用编写后缀
		System.out.println("内容：" + rb.getString("info")) ;		// 从资源文件中取得内容
	}
};