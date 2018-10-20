import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.ResultSetMetaData ;
import java.sql.PreparedStatement ;
public class ResultSetMetaDataDemo{
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
		ResultSetMetaData rsmd = null ;		// ���ݿ�Ԫ����
		PreparedStatement pstmt = null ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		String sql = "SELECT id,name,password,age,sex,birthday FROM user" ;
		pstmt = conn.prepareStatement(sql) ;	// ʵ��������
		rsmd = pstmt.getMetaData() ;
		System.out.println("һ������" + rsmd.getColumnCount() + "�����ݡ�") ;
		if(rsmd.isAutoIncrement(1) ){
			System.out.println(rsmd.getColumnName(1)+"�����Զ������ġ�") ;
		}
		conn.close() ;			// ���ݿ�ر�
	}
};