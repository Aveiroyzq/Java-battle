package org.lxh.debugdemo;
class Math{
	public int div(int i,int j) throws Exception{
		int temp = 0 ;
		temp = i / j ;
		return temp ;
	}
}

public class DebugDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println() ;
		Math m = new Math() ;		// 实例化Math类的对象
		int x = 10 ;
		int y = 2 ;
		int result = 0 ;		// 接收保存的结果
		try {
			result = m.div(x, y) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("计算结果，result = " + result) ;
	}

}
