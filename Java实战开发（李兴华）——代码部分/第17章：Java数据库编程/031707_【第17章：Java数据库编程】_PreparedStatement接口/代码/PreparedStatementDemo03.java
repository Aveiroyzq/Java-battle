import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.ResultSet ;
import java.sql.PreparedStatement ;
import java.text.SimpleDateFormat ;
public class PreparedStatementDemo03 {
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
		String keyWord = "��" ;	 // ���ò�ѯ�ؼ���
		ResultSet rs = null ;	// ���ղ�ѯ���
		String sql = "SELECT id,name,password,age,sex,birthday " +
				" FROM user" ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;	// ʵ����PreapredStatement����
		rs = pstmt.executeQuery() ;	// ִ�в�ѯ
		while(rs.next()){
			int id = rs.getInt(1) ;
			String name = rs.getString(2) ;
			String pass = rs.getString(3) ;
			int age = rs.getInt(4) ;
			String sex = rs.getString(5) ;
			java.util.Date d = rs.getDate(6) ;
			System.out.print("��ţ�" + id + "��") ;
			System.out.print("������" + name + "��") ;
			System.out.print("���룺" + pass + "��") ;
			System.out.print("���䣺" + age + "��") ;
			System.out.print("�Ա�" + sex + "��") ;
			System.out.println("���գ�" + d + "��") ;
			System.out.println("-------------------------") ;
		}
		rs.close() ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};