import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.Color ;
import javax.swing.JFrame ;
class MyWindowEventHandle extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing --> 窗口关闭") ;
		System.exit(1) ;
	}
};

public class MyEventWindowEventJFrame02{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.addWindowListener(new MyWindowEventHandle()) ;	// 加入事件
		frame.setSize(300,150) ;
		frame.setBackground(Color.WHITE) ;
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};