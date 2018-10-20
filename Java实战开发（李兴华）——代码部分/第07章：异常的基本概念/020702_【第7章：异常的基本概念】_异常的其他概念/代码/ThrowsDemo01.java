class Math{
	public int div(int i,int j) throws Exception{	// 定义除法操作，如果有异常，则交给被调用处处理
		int temp = i / j ;	// 计算，但是此处有可能出现异常
		return temp ;
	}
};
public class ThrowsDemo01{
	public static void main(String args[]){
		Math m = new Math() ;		// 实例化Math类对象
		try{
			System.out.println("除法操作：" + m.div(10,2)) ;
		}catch(Exception e){
			e.printStackTrace() ;	// 打印异常
		}
	}
};