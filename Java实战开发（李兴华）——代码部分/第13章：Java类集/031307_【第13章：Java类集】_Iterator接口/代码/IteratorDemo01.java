import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class IteratorDemo01{
	public static void main(String args[]){
		List<String> all=  new ArrayList<String>() ;	// 
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		Iterator<String> iter = all.iterator() ;	// 为Iterator接口实例化
		while(iter.hasNext()){	// 判断是否有内容
			System.out.println(iter.next()) ;	// 输出内容
		}
	}
};