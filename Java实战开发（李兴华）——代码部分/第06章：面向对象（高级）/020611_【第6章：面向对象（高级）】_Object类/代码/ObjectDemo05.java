public class ObjectDemo05{
	public static void main(String args[]){
		int temp[] = {1,3,5,7,9} ;	// ��������
		Object obj = temp ;	// ʹ��Object��������
		print(obj) ;
	}
	public static void print(Object o){
		if(o instanceof int[]){		// �ж��Ƿ�����������
			int x[] = (int[])o ;
			for(int i=0;i<x.length;i++){
				System.out.print(x[i] + "\t") ;
			}
		}
	}
};