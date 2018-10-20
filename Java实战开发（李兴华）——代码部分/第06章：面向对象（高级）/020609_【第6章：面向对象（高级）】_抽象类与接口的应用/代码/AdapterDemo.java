interface Window{		// ����Window�ӿڣ���ʾ���ڲ���
	public void open() ;	// ��
	public void close() ;	// �ر�
	public void activated() ;	// ���ڻ
	public void iconified() ;	// ������С��
	public void deiconified();// ���ڻָ���С
}
abstract class WindowAdapter implements Window{
	public void open(){} ;	// ��
	public void close(){} ;	// �ر�
	public void activated(){} ;	// ���ڻ
	public void iconified(){} ;	// ������С��
	public void deiconified(){};// ���ڻָ���С
};
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("���ڴ򿪡�") ;
	}
	public void close(){
		System.out.println("���ڹرա�") ;
	}
};
public class AdapterDemo{
	public static void main(String args[]){
		Window win = new WindowImpl() ;
		win.open() ;
		win.close() ;
	}
};