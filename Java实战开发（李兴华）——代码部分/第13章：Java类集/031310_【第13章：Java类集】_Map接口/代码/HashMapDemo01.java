import java.util.HashMap ;
import java.util.Map ;
public class HashMapDemo01{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		String val = map.get("mldn") ;	// ����keyȡ��ֵ
		System.out.println("ȡ���������ǣ�" + val) ;
	}
};