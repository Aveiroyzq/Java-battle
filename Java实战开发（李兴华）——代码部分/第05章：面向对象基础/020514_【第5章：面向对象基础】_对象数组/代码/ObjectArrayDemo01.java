class Person{
	private String name ;		// ��������
	public Person(String name){	// ͨ�����췽����������
		this.name = name ;		// Ϊ������ֵ
	}
	public String getName(){
		return this.name ;		// ȡ������
	}
};
public class ObjectArrayDemo01{
	public static void main(String args[]){
		// ������ ��������[] = new ������[����]
		Person per[] = new Person[3] ;	// �����������ռ��С������
		System.out.println("============== �������� =================") ;
		// ���������ʼ��֮ǰ��ÿһ��Ԫ�ض���Ĭ��ֵ
		for(int x=0;x<per.length;x++){	// ѭ�����
			System.out.print(per[x] + "��") ;	// ��Ϊֻ�ǿ��ٺ��˿ռ䣬���Զ���Ĭ��ֵ
		}
		// �ֱ�Ϊ�����е�ÿ��Ԫ�س�ʼ����ÿһ�����Ƕ��󣬶���Ҫ����ʵ����	
		per[0] = new Person("����") ;	// ʵ������һ��Ԫ��
		per[1] = new Person("����") ;	// ʵ�����ڶ���Ԫ��
		per[2] = new Person("����") ;	// ʵ����������Ԫ��
		System.out.println("\n============== ����ʵ���� =================") ;
		for(int x=0;x<per.length;x++){	// ѭ�����
			System.out.print(per[x].getName() + "��") ;	// ��ʱ���Ѿ�ʵ��������ˣ����Ի�ֱ�Ӵ�ӡ������
		}
	}
};