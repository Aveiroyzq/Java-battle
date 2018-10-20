class Person{			// 定义Person类
	private String name ;	// 姓名
	private int age ;		// 年龄
	private Book book ;		// 一个人有一本书
	private Person child ;	// 一个人有一个孩子
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
	public void setChild(Person c){
		child = c ;
	}
	public Person getChild(){
		return child ;
	}
};
class Book{				// 定义Book类
	private String title ;	// 标题
	private float price ;	// 价格
	private Person person ;	// 一本书属于一个人
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
public class RefDemo06{
	public static void main(String arg[]){
		Person per = new Person("张三",30) ;
		Person cld = new Person("张草",10) ;	// 定义一个孩子
		Book bk = new Book("JAVA SE核心开发",90.0f) ;
		Book b = new Book("一千零一夜",30.3f) ;
		per.setBook(bk) ;		// 设置两个对象间的关系，一个人有一本书
		bk.setPerson(per) ;		// 设置两个对象间的关系，一本书属于一个人
		cld.setBook(b) ;		// 设置对象间的关系，一个孩子有一本书
		b.setPerson(cld) ;		// 设置对象间的关系，一本书属于一个孩子
		per.setChild(cld) ;		// 设置对象间的关系，一个人有一个孩子
		System.out.println("从人找到书 --> 姓名：" + per.getName()+"；年龄：" 
			+ per.getAge() +"；书名：" + per.getBook().getTitle() + "；价格：" 
			+ per.getBook().getPrice()) ;	// 可以通过人找到书
		System.out.println("从书找到人 --> 书名：" + bk.getTitle() + "；价格："
			+ bk.getPrice() + "；姓名：" + bk.getPerson().getName() + "；年龄："
			+ bk.getPerson().getAge()) ;	// 也可以通过书找到其所有人
		// 通过人找到孩子，并找到孩子所拥有的书
		System.out.println(per.getName() + "的孩子 --> 姓名："
			+ per.getChild().getName() + "；年龄：" + per.getChild().getAge()
			+ "；书名：" + per.getChild().getBook().getTitle() + "；价格："
			+ per.getChild().getBook().getPrice()) ;
	}
};