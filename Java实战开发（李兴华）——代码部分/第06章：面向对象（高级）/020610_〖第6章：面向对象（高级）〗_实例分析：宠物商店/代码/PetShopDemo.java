interface Pet{	// �������ӿ�
	public String getName() ;
	public String getColor() ;
	public int getAge() ;
}
class Cat implements Pet{	// è�ǳ��ʵ�ֽӿ�
	private String name ;	// ��������
	private String color ;	// ������ɫ
	private int age ;		// ��������
	public Cat(String name,String color,int age){
		this.setName(name) ;
		this.setColor(color) ;
		this.setAge(age) ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public String getColor(){
		return this.color ;
	}
	public int getAge(){
		return this.age ;
	}
};
class Dog implements Pet{	// ���ǳ��ʵ�ֽӿ�
	private String name ;	// ��������
	private String color ;	// ������ɫ
	private int age ;		// ��������
	public Dog(String name,String color,int age){
		this.setName(name) ;
		this.setColor(color) ;
		this.setAge(age) ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public String getColor(){
		return this.color ;
	}
	public int getAge(){
		return this.age ;
	}
};
class PetShop{	// �����̵�
	private Pet[] pets ;	// ����һ�����
	private int foot ;
	public PetShop(int len){
		if(len>0){
			this.pets = new Pet[len] ;	// ���������С
		}else{
			this.pets = new Pet[1] ;	// ���ٿ���һ���ռ�
		}
	}
	public boolean add(Pet pet){	// ���ӵ���һ������
		if(this.foot<this.pets.length){
			this.pets[this.foot] = pet ;	// ���ӳ���
			this.foot ++ ;
			return true ;
		}else{
			return false ;
		}
	}
	public Pet[] search(String keyWord){
		// Ӧ��ȷ���ж��ٸ��������Ҫ��
		Pet p[] = null ;
		int count = 0 ;	// ��¼�»��ж��ٸ�������ϲ�ѯ���
		for(int i=0;i<this.pets.length;i++){
			if(this.pets[i]!=null){		// ��ʾ��λ���г���
				if(this.pets[i].getName().indexOf(keyWord)!=-1
					||this.pets[i].getColor().indexOf(keyWord)!=-1){
					count++ ;	// �޸Ĳ��ҵ��ļ�¼��
				}
			}
		}
		p = new Pet[count] ;	// ����ָ���Ĵ�С�ռ�
		int f = 0 ;	// ����Ԫ�ص�λ�ñ��
		for(int i=0;i<this.pets.length;i++){
			if(this.pets[i]!=null){		// ��ʾ��λ���г���
				if(this.pets[i].getName().indexOf(keyWord)!=-1
					||this.pets[i].getColor().indexOf(keyWord)!=-1){
					p[f] = this.pets[i] ;
					f++ ;
				}
			}
		}
		return p ;

	}
};
public class PetShopDemo{
	public static void main(String args[]){
		PetShop ps = new PetShop(5) ;	// �������
		ps.add(new Cat("��è","��ɫ��",2)) ;	// ���ӳ���ɹ�
		ps.add(new Cat("��è","��ɫ��",3)) ;	// ���ӳ���ɹ�
		ps.add(new Cat("��è","��ɫ��",3)) ;	// ���ӳ���ɹ�
		ps.add(new Dog("��������","��ɫ��",3)) ;	// ���ӳ���ɹ�
		ps.add(new Dog("��ë","��ɫ��",2)) ;	// ���ӳ���ɹ�
		ps.add(new Dog("�ƹ�","��ɫ��",2)) ;	// ���ӳ��ʧ��
		print(ps.search("��")) ;
	}
	public static void print(Pet p[]){
		for(int i=0;i<p.length;i++){
			if(p[i]!=null){
				System.out.println(p[i].getName() + "��" + p[i].getColor()
					+"��" + p[i].getAge()) ;
			}
		}
	}
};