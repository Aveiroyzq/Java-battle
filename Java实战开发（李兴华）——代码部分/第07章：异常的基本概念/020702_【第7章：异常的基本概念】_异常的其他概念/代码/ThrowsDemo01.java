class Math{
	public int div(int i,int j) throws Exception{	// �������������������쳣���򽻸������ô�����
		int temp = i / j ;	// ���㣬���Ǵ˴��п��ܳ����쳣
		return temp ;
	}
};
public class ThrowsDemo01{
	public static void main(String args[]){
		Math m = new Math() ;		// ʵ����Math�����
		try{
			System.out.println("����������" + m.div(10,2)) ;
		}catch(Exception e){
			e.printStackTrace() ;	// ��ӡ�쳣
		}
	}
};