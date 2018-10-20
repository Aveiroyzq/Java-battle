import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
public class BlobDemo01{
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
		String name = "���˻�" ;
		String sql = "INSERT INTO userblob(name,photo) VALUES (?,?) " ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;
		File f = new File("d:" + File.separator + "mldn.gif") ;	// ͼƬ�ļ�
		InputStream input = null ;
		input = new FileInputStream(f) ;
		pstmt.setString(1,name) ;	// ���õ�һ����?��������
		pstmt.setBinaryStream(2,input,(int)f.length()) ;	// ����������
		pstmt.executeUpdate() ;	// �������ݿ�
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};