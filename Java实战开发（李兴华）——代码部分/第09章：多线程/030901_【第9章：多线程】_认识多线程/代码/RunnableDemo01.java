class MyThread implements Runnable{	// ʵ��Runnable�ӿڣ���Ϊ�̵߳�ʵ����
	private String name ;		// ��ʾ�̵߳�����
	public MyThread(String name){
		this.name = name ;		// ͨ�����췽������name����
	}
	public void run(){	// ��дrun()��������Ϊ�߳� �Ĳ�������
		for(int i=0;i<10;i++){
			System.out.println(name + "���У�i = " + i) ;
		}
	}
};
public class RunnableDemo01{
	public static void main(String args[]){
		MyThread mt1 = new MyThread("�߳�A ") ;	 // ʵ��������
		MyThread mt2 = new MyThread("�߳�B ") ;	 // ʵ��������
		Thread t1 = new Thread(mt1) ;		// ʵ����Thread�����
		Thread t2 = new Thread(mt2) ;		// ʵ����Thread�����
		t1.start() ;	// �������߳�
		t2.start() ;	// �������߳�
	}
};