public class ArrayRefDemo02{
	public static void main(String args[]){
		int temp[] = fun() ;		// ͨ������ʵ��������
		print(temp) ;				// ��ӡ��������
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i] + "��") ;
		}
	}
	public static int[] fun(){	// ����һ������
		int ss[] = {1,3,5,7,9} ;	// ����һ������
		return ss ;
	}
};