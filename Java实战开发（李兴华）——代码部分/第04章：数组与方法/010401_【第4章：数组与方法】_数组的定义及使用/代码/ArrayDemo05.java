public class ArrayDemo05{
	public static void main(String args[]){
		int score[] = {67,89,87,69,90,100,75,90} ;		// ʹ�þ�̬��ʼ����������
		int max = 0 ;						// ���������е����ֵ
		int min = 0 ;						// ���������е���Сֵ
		max = min = score[0] ;				// �ѵ�һ��Ԫ�ص����ݸ�ֵ��max��min
		for(int x=0;x<score.length;x++){		// ѭ�����
			if(score[x]>max){				// �����жϺ���Ԫ���Ƿ��max��
				max = score[x] ;			// ��������޸�max������
			}
			if(score[x]<min){				// �����жϺ�����Ԫ���Ƿ��minС
				min = score[x] ;			// ���С�����޸�min����
			}
		}
		System.out.println("��߳ɼ���" + max) ;
		System.out.println("��ͳɼ���" + min) ;
	}
};