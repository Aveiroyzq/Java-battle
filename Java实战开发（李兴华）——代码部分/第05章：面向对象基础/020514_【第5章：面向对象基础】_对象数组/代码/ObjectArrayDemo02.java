class Person{
	private String name ;		// ��������
	public Person(String name){	// ͨ�����췽����������
		this.name = name ;		// Ϊ������ֵ
	}
	public String getName(){
		return this.name ;		// ȡ������
	}
};
public class ObjectArrayDemo02{
	public static void main(String args[]){
		// ����һ���������飬��������������ʹ�þ�̬��ʼ����ʽ���
		Person per[] = {new Person("����"),new Person("����"),new Person("����")} ;
		System.out.println("\n============== ������� =================") ;
		for(int x=0;x<per.length;x++){	// ѭ�����
			System.out.print(per[x].getName() + "��") ;	// ��ʱ���Ѿ�ʵ��������ˣ����Ի�ֱ�Ӵ�ӡ������
		}
	}
};