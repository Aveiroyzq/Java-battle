import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
public class ClobDemo01{
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
		String name = "���˻�" ;	// ��ʾ����
		String sql = "INSERT INTO userclob(name,note) VALUES (?,?) " ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;	// ����PreapredStatement����
		File f = new File("d:" + File.separator + "mldn.txt") ;
		InputStream input = null ;
		input = new FileInputStream(f) ;	// ͨ����������ȡ�ļ�
		pstmt.setString(1,name) ;
		pstmt.setAsciiStream(2,input,(int)f.length()) ;
		pstmt.executeUpdate() ;
		conn.close() ;			// ���ݿ�ر�
	}
};