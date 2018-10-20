import java.util.* ;
public class ScannerDemo02{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in) ;	// 从键盘接收数据
		System.out.print("输入数据：") ;
		scan.useDelimiter("\n") ;
		String str = scan.next() ;	// 接收数据
		System.out.println("输入的数据为：" + str) ;
	}
};