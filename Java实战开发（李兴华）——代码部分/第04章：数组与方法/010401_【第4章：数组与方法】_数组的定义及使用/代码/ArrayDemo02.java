public class ArrayDemo02{
	public static void main(String args[]){
		int score[] = null ;			// ��������
		score = new int[3] ;			// Ϊ���鿪�ٿռ䣬��СΪ3
		for(int x=0;x<3;x++){			// Ϊÿһ��Ԫ�ظ�ֵ
			score[x] = x * 2 + 1 ;		// ÿһ��ֵ��������
		}
		for(int x=0;x<score.length;x++){
			System.out.println("score["+x+"] = " + score[x]) ;
		}
	}
};