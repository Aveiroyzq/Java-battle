import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
public class JDBC20UpdateDemo{
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
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "SELECT id,name,password,age,sex,birthday FROM user WHERE id=?" ;// �˴�����Ҫ�����κε�����
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql,
			ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE) ;	// ��ʾ��������Ը���
		pstmt.setInt(1,4) ;
		rs = pstmt.executeQuery() ;	// ��ѯ����
		rs.last() ;	// �����һ��

		rs.updateString("name","���") ;	// ��������
		rs.updateString("password","lizang") ;	// ��������
		rs.updateInt("age",23) ;	// ����Ҫ���������
		rs.updateString("sex","Ů") ;	// ����Ҫ������Ա�
		rs.updateDate("birthday",new java.sql.Date(new java.util.Date().getTime()));
		rs.cancelRowUpdates() ;	// ȡ������
		rs.updateRow() ;	// �����ύ����
		rs.close() ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};