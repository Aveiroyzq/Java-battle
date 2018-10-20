import java.util.WeakHashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Collection ;
public class WeakHashMapDemo01{
	public static void main(String args[]){
		Map<String,String> map = null; // 声明Map对象，其中key和value的类型为String
		map = new WeakHashMap<String,String>() ;
		map.put(new String("mldn"),new String("www.mldn.cn")) ;
		map.put(new String("zhinangtuan"),new String("www.zhinangtuan.net.cn")) ;
		map.put(new String("mldnjava"),new String("www.mldnjava.cn")) ;
		System.gc() ;	// 强制性进行垃圾的收集操作
		map.put(new String("lxh"),new String("lixinghua")) ;
		System.out.println(map) ;
	}
};