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
		Math m = new Math() ;		// ʵ����Math��Ķ���
		int x = 10 ;
		int y = 2 ;
		int result = 0 ;		// ���ձ���Ľ��
		try {
			result = m.div(x, y) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��������result = " + result) ;
	}

}
