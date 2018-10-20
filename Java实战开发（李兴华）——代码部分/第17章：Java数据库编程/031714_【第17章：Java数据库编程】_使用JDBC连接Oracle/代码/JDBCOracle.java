import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
public class JDBCOracle{
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:MLDN" ;
	// MySQL���ݿ�������û���
	public static final String DBUSER = "scott" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "tiger" ;
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		Connection conn = null ;		// ���ݿ�����
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		PreparedStatement pstmt = null ;
		String sql = "INSERT INTO person(id,name,age,birthday) VALUES (myseq.nextVal,?,?,?)" ;
		pstmt = conn.prepareStatement(sql) ;
		pstmt.setString(1,"���˻�") ;
		pstmt.setInt(2,30) ;
		pstmt.setDate(3,new java.sql.Date(new java.util.Date().getTime())) ;
		pstmt.executeUpdate() ;	// ִ�и��²���
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};