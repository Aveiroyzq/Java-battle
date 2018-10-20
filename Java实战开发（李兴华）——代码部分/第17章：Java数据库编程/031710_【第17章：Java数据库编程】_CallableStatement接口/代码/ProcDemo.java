import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.CallableStatement ;
import java.sql.Types ;
public class ProcDemo{
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
		CallableStatement cstmt = null ;		// ���ݿ����
		String sql = "{CALL myproc(?,?,?)}"	;	// ���ù���
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		cstmt = conn.prepareCall(sql) ;
		cstmt.setInt(1,70) ;	// ���õ�һ��������70
		cstmt.setInt(2,80) ;	// ���õڶ���������80
		cstmt.registerOutParameter(2,Types.INTEGER) ;
		cstmt.registerOutParameter(3,Types.INTEGER) ;
		cstmt.execute() ;		// ִ�й���
		System.out.println("INOUT�ķ���ֵ��" + cstmt.getInt(2)) ;
		System.out.println("OUT�ķ���ֵ��" + cstmt.getInt(3)) ;
		cstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};