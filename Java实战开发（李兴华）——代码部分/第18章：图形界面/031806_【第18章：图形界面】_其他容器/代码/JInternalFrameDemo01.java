import java.io.File ;
import java.awt.Container ;
import javax.swing.JPanel ;
import javax.swing.JButton ;
import javax.swing.ImageIcon ;
import javax.swing.Icon ;
import javax.swing.JLabel ;
import javax.swing.JFrame ;
import javax.swing.JDesktopPane ;
import javax.swing.JInternalFrame ;
import javax.swing.JScrollPane ;
import java.awt.BorderLayout ;
public class JInternalFrameDemo01 {
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome TO MLDN") ; // ʵ�����������
		Container cont = frame.getContentPane() ;
		JDesktopPane desk = new JDesktopPane() ;	// ���崰�������
		cont.add(desk,BorderLayout.CENTER) ;	// ������ʾ��ʽ
		cont.add(new JLabel("�ڲ�����"),BorderLayout.SOUTH) ;
		JInternalFrame jif = null ;
		String picPath = "d:" + File.separator + "mldn.gif" ;
		Icon icon = new ImageIcon(picPath) ;	// ʵ����Icon����
		JPanel pan = null ;
		for(int i=0;i<3;i++){
			jif = new JInternalFrame("MLDN-" + i,true,true,true,true) ;
			pan = new JPanel() ;
			pan.add(new JLabel(icon)) ;	// �����ǩ
			jif.setLocation(35 - i * 10 , 35 - i * 10) ; // ������ʾλ��
			jif.add(pan) ;
			jif.pack() ;
			jif.setVisible(true) ;
			desk.add(jif) ;
		}


		frame.setSize(230,120) ;// ��������Զ�������С
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};