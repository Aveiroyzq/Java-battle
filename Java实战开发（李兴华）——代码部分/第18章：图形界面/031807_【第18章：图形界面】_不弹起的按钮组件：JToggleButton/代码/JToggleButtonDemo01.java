import javax.swing.JFrame ;
import javax.swing.JToggleButton ;
import java.awt.GridLayout ;

public class JToggleButtonDemo01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JToggleButton but1 = new JToggleButton("��ѡ��",true) ;	 // Ĭ��ѡ��
		JToggleButton but2 = new JToggleButton("δѡ��") ;
		JToggleButton but3 = new JToggleButton("����") ;
		frame.setLayout(new GridLayout(3,1)) ;	// �����Ű���ʽ
		frame.add(but1) ;
		frame.add(but2) ;
		frame.add(but3) ;
		frame.setSize(200,100) ;
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};