class Color{
	public static final Color RED = new Color("红色") ;	// 定义第一个对象
	public static final Color GREEN = new Color("绿色") ;	// 定义第一个对象
	public static final Color BLUE = new Color("蓝色") ;	// 定义第一个对象
	private String name ;
	private Color(String name){
		this.name = name ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public static Color getInstance(int i){
		switch(i){
			case 1:{
				return RED ;
			}
			case 2:{
				return GREEN ;
			}
			case 3:{
				return BLUE ;
			}default:{
				return null ;
			}
		}

	}
};
public class ColorDemo01{
	public static void main(String args[]){
		Color c1 = Color.RED ;	// 取得红色
		System.out.println(c1.getName()) ;	// 输出名字
		Color c2 = Color.getInstance(3) ;	// 根据编号取得名字
		System.out.println(c2.getName()) ;
	}
};