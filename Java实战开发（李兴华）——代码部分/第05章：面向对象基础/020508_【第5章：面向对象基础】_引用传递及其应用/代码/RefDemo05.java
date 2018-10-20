class Person{			// ����Person��
	private String name ;	// ����
	private int age ;		// ����
	private Book book ;		// һ������һ����
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		age = a ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public void setBook(Book b){
		book = b ;
	}
	public Book getBook(){
		return book ;
	}
};
class Book{				// ����Book��
	private String title ;	// ����
	private float price ;	// �۸�
	private Person person ;	// һ��������һ����
	public Book(String title,float price){
		this.setTitle(title) ;
		this.setPrice(price) ;
	}
	public void setTitle(String t){
		title = t ;
	}
	public void setPrice(float p){
		price = p ;
	}
	public String getTitle(){
		return title ;
	}
	public float getPrice(){
		return price ;
	}
	public void setPerson(Person p){
		person = p ;
	}
	public Person getPerson(){
		return person ;
	}
};
public class RefDemo05{
	public static void main(String arg[]){
		Person per = new Person("����",30) ;
		Book bk = new Book("JAVA SE���Ŀ���",90.0f) ;
		per.setBook(bk) ;		// �������������Ĺ�ϵ��һ������һ����
		bk.setPerson(per) ;		// �������������Ĺ�ϵ��һ��������һ����
		System.out.println("�����ҵ��� --> ������" + per.getName()+"�����䣺" 
			+ per.getAge() +"��������" + per.getBook().getTitle() + "���۸�" 
			+ per.getBook().getPrice()) ;	// ����ͨ�����ҵ���
		System.out.println("�����ҵ��� --> ������" + bk.getTitle() + "���۸�"
			+ bk.getPrice() + "��������" + bk.getPerson().getName() + "�����䣺"
			+ bk.getPerson().getAge()) ;	// Ҳ����ͨ�����ҵ���������
	}
};