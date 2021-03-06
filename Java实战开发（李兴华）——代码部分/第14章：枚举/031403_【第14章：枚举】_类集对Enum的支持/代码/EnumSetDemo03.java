import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo03{
	public static void main(String args[]){
		EnumSet<Color> es = null ;			// 声明一个EnumSet对象
		System.out.println("======== EnumSet.noneOf(Color.class) =====") ;
		es = EnumSet.noneOf(Color.class) ;	// 将枚举的全部类型设置到EnumSet对象之中
		es.add(Color.RED) ;	// 增加内容
		es.add(Color.GREEN) ;	// 增加内容
		print(es) ;
	}
	public static void print(EnumSet<Color> temp){	// 专门的输出操作
		for(Color c:temp){		//  循环输出EnumSet中的内容
			System.out.print(c + "、") ;
		}
		System.out.println() ;
	}
};