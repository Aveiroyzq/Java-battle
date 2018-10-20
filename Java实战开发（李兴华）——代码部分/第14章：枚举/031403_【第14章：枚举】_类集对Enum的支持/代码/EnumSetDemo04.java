import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo04{
	public static void main(String args[]){
		EnumSet<Color> esOld = null ;			// 声明一个EnumSet对象
		EnumSet<Color> esNew = null ;
		System.out.println("======== EnumSet.complementOf(Color.class) =====") ;
		esOld = EnumSet.noneOf(Color.class) ;	// 将枚举的全部类型设置到EnumSet对象之中
		esOld.add(Color.RED) ;	// 增加内容
		esOld.add(Color.GREEN) ;	// 增加内容
		esNew = EnumSet.complementOf(esOld) ;	// 不包含指定内容
		print(esNew) ;
	}
	public static void print(EnumSet<Color> temp){	// 专门的输出操作
		for(Color c:temp){		//  循环输出EnumSet中的内容
			System.out.print(c + "、") ;
		}
		System.out.println() ;
	}
};