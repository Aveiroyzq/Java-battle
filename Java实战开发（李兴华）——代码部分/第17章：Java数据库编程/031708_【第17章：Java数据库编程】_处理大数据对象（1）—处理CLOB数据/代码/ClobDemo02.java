import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.util.Scanner ;
public class ClobDemo02{
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
			StringBuffer note = new StringBuffer() ;
			System.out.println("������" + name) ;
			InputStream input = rs.getAsciiStream(2) ;
			Scanner scan = new Scanner(input) ;	// ʹ��Scanner���ȡ����
			scan.useDelimiter("\r\n") ;	// ���ļ�������Ϊ�ָ��
			while(scan.hasNext()){
				note.append(scan.next()).append("\n") ;
			}
			System.out.println("���ݣ�" + note) ;
			input.close() ;
		}
		rs.close() ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};