import javax.swing.JPanel ;
import javax.swing.JButton ;
import javax.swing.JLabel ;
import javax.swing.JFrame ;
public class JPanelDemo01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome TO MLDN") ; // ʵ�����������
		JPanel pan = new JPanel() ;	// ׼������һ�����
		// �������е����ݶ����뵽��JPanel֮��
		pan.add(new JLabel("��ǩ-A")) ;
		pan.add(new JLabel("��ǩ-B")) ;
		pan.add(new JLabel("��ǩ-C")) ;
		pan.add(new JButton("��ť-X")) ;
		pan.add(new JButton("��ť-Y")) ;
		pan.add(new JButton("��ť-Z")) ;
		frame.add(pan) ;// �������뵽����֮��
		frame.pack() ;// ��������Զ�������С
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};