class Math{
	public int div(int i,int j) throws Exception{	// �������������������쳣���򽻸������ô�����
		System.out.println("***** ���㿪ʼ *****") ;
		int temp = 0 ;	// ����ֲ�����
		try{
			temp = i / j ;	// ���㣬���Ǵ˴��п��ܳ����쳣
		}catch(Exception e){
			throw e ;
		}finally{	// �����Ƿ����쳣����Ҫִ��ͳһ����
			System.out.println("***** ������� *****") ;
		}
		return temp ;
	}
};
public class ThrowDemo02{
	public static void main(String args[]){
		Math m = new Math() ;
		try{
			System.out.println("����������" + m.div(10,0)) ;
		}catch(Exception e){
			System.out.println("�쳣������" + e) ;
		}
	}
};