import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class IteratorDemo01{
	public static void main(String args[]){
		List<String> all=  new ArrayList<String>() ;	// 
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		Iterator<String> iter = all.iterator() ;	// ΪIterator�ӿ�ʵ����
		while(iter.hasNext()){	// �ж��Ƿ�������
			System.out.println(iter.next()) ;	// �������
		}
	}
};