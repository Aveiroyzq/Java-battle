import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.sql.Blob ;
import java.sql.ResultSet ;
import java.io.File ;
import java.io.FileOutputStream ;
import java.io.InputStream ;
import java.io.InputStream ;
import java.io.OutputStream ;

public class BlobDemo03{
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
		int id = 1 ;
		String sql = "SELECT name,photo FROM userblob WHERE id=?" ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;
		pstmt.setInt(1,id) ;
		rs = pstmt.executeQuery() ;	// ִ�в�ѯ
		if(rs.next()){
			String name = rs.getString(1) ;
			System.out.println("������" + name) ;
			Blob b = rs.getBlob(2) ;
			File f = new File("d:" + File.separator + "loadmldn.gif") ;	// ͼƬ�ļ�
			OutputStream out = null ;
			out = new FileOutputStream(f) ;
			out.write(b.getBytes(1,(int)b.length())) ;
			out.close() ;
		}
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};