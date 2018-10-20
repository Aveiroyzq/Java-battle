interface Color{
	public static final int RED = 1 ;	// 定义红色
	public static final int GREEN = 2 ;	// 定义绿色
	public static final int BLUE = 3 ;	// 定义蓝色
}
public class ColorDemo02{
	public static void main(String args[]){
		System.out.println(Color.RED + Color.GREEN) ;	// 颜色相加
	}
};