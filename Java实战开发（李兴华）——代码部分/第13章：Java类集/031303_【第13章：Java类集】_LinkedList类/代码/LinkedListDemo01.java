import java.util.LinkedList ;
public class LinkedListDemo01{
	public static void main(String args[]){
		LinkedList<String> link = new LinkedList<String>() ;
		link.add("A") ;	// ����Ԫ��
		link.add("B") ;	// ����Ԫ��
		link.add("C") ;	// ����Ԫ��
		System.out.println("��ʼ������" + link) ;
		link.addFirst("X") ;	// �ڿ�ͷ��������
		link.addLast("Y") ;		// �ڽ�β��������
		System.out.println("����ͷ��β֮�������" + link) ;
	}
};