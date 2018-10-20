class Array{		// ��ʾ����
	private int temp[] ;		// ��������
	private int foot ;	// �������λ��
	public Array(int len){
		if(len>0){
			this.temp = new int[len] ;
		}else{
			this.temp = new int[1] ;	// ����ά�ֿռ���1��
		}
	}
	public boolean add(int i){	// ����Ԫ��
		if(this.foot<this.temp.length){	// ���пռ�
			this.temp[foot] = i ;	// ����Ԫ��
			this.foot ++ ;// �޸Ľű�
			return true ;
		}else{
			return false ;
		}
	}
	public int[] getArray(){
		return this.temp ;
	}
};
class SortArray extends Array{	// ������
	public SortArray(int len){
		super(len) ;
	}
	public int[] getArray(){	// ��д����
		java.util.Arrays.sort(super.getArray()) ;	// �������
		return super.getArray() ;
	}
};
class ReverseArray extends Array{	// ��ת������
	public ReverseArray(int len){
		super(len) ;
	}
	public int[] getArray() {
		int t[] = new int[super.getArray().length] ;	// ����һ���µ�����
		int count = t.length - 1 ;
		for(int x=0 ;x<t.length;x++){
			t[count] = super.getArray()[x] ;	// ���鷴ת
			count-- ;
		}
		return t ;
	}
};
public class ArrayDemo{
	public static void main(String args[]){
		// ReverseArray a = null ;	// ������ת�����
		// a = new ReverseArray(5) ;	// ����5���ռ��С
		SortArray a = null ;
		a = new SortArray(5) ;
		System.out.print(a.add(23) + "\t") ;
		System.out.print(a.add(21) + "\t") ;
		System.out.print(a.add(2) + "\t") ;
		System.out.print(a.add(42) + "\t") ;
		System.out.print(a.add(5) + "\t") ;
		System.out.print(a.add(6) + "\t") ;
		print(a.getArray()) ;

	}
	public static void print(int i[]){	// �����������
		for(int x=0;x<i.length;x++){
			System.out.print(i[x] + "��") ;
		}
	}
};