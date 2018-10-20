import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;
public class ResultSetDemo02{
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/mldn" ;
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "mysqladmin" ;
	public static void main(String args[]) throws Exception {
		Connection conn = null ;		// ���ݿ�����
		Statement stmt = null ;		// ���ݿ�Ĳ�������
		ResultSet rs = null ;		// �����ѯ���
		String sql = "SELECT id,name,password,age,sex,birthday FROM user" ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		stmt = conn.createStatement() ;
		rs = stmt.executeQuery(sql) ;
		while(rs.next()){	// ����ȡ������
			int id = rs.getInt(1) ;	// ȡ��id�е�����
			String name = rs.getString(2) ;	// ȡ��name�е�����
			String password = rs.getString(3) ; // ȡ��password�е�����
			int age = rs.getInt(4) ;	// ȡ��age�е�����
			String sex = rs.getString(5) ;	// ȡ��sex�е�����
			java.util.Date d = rs.getDate(6) ; // ȡ��birthday�е�����
			System.out.print("��ţ�" + id + "��") ;
			System.out.print("������" + name + "��") ;
			System.out.print("���룺" + password + "��") ;
			System.out.print("���䣺" + age + "��") ;
			System.out.print("�Ա�" + sex + "��") ;
			System.out.println("���գ�" + d + "��") ;
			System.out.println("-----------------------") ;
		}
		rs.close() ;
		stmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};