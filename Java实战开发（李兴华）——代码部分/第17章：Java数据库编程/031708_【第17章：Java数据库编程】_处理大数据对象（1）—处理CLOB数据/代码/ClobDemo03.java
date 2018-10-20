import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.sql.Clob ;
import java.sql.ResultSet ;
public class ClobDemo03{
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
		int id = 1 ;		// ��ȡ�ı��
		
		String sql = "SELECT name,note FROM userclob WHERE id=? " ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;	// ����PreapredStatement����
		pstmt.setInt(1,id) ;
		rs = pstmt.executeQuery() ;
		if(rs.next()){
			String name = rs.getString(1) ;
			System.out.println("������" + name) ;
			Clob c = rs.getClob(2) ;
			String note = c.getSubString(1,(int)c.length()) ;
			System.out.println("���ݣ�" + note ) ;
			c.truncate(100) ;	// ֻ�ܶ�100������
			System.out.println("���ֶ�ȡ���ݣ�" + c.getSubString(1,(int)c.length())) ;
		}
		rs.close() ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};