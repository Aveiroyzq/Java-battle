abstract class A{	// �Ƕ�����һ��������
	public static final String FLAG = "CHINA" ;	// ȫ�ֳ���
	private String name = "���˻�" ;	// ����һ����ͨ������
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void print() ;		// ������󷽷�
};