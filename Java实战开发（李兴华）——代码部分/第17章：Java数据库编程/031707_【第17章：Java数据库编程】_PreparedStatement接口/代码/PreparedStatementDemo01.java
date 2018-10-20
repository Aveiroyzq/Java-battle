import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.text.SimpleDateFormat ;
public class PreparedStatementDemo01 {
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/mldn" ;
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "mysqladmin" ;
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		Connection conn = null ;		// ���ݿ�����
		PreparedStatement pstmt = null ;	// ���ݿ����
		String name = "���˻�" ;	// ����
		String password = "www.mldnjava.cn" ;	// ����
		int age = 30 ;	// ����
		String sex = "��" ;	 // �Ա�
		String birthday = "2007-08-27" ;	// ����
		java.util.Date temp = null ;
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday) ;
		java.sql.Date bir = new java.sql.Date(temp.getTime()) ;
		String sql = "INSERT INTO user(name,password,age,sex,birthday) VALUES (?,?,?,?,?) " ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;	// ʵ����PreapredStatement����
		pstmt.setString(1,name) ;
		pstmt.setString(2,password) ;
		pstmt.setInt(3,age) ;
		pstmt.setString(4,sex) ;
		pstmt.setDate(5,bir) ;
		int t = pstmt.executeUpdate() ;	// ִ�и���
		System.out.println(t);
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};