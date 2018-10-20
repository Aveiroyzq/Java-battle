public class InterDemo04{
	public static void main(String args[]){
		System.out.print("第一次运行：") ;
		fun("LXH","Li","李兴华") ;	// 传入三个参数
		System.out.print("\n第二次运行：") ;
		fun("MLDN") ;				// 传入一个参数
	}
	public static void fun(Object...args){	// 固定语法，输入任意多个数据，使用数组表示
		for(int i=0;i<args.length;i++){
			System.out.print(args[i] + "、") ;
		}
	}
};