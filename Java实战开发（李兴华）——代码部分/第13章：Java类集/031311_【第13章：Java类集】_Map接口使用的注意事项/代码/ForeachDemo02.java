import java.util.HashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
public class ForeachDemo02{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		for(Map.Entry<String,String> me:map.entrySet()){
			System.out.println(me.getKey() + " --> " + me.getValue()) ;
		}
	}
};