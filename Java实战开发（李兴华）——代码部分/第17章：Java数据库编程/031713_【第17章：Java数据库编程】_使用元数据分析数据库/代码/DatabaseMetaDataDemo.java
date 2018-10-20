import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.DatabaseMetaData ;
import java.sql.ResultSet ;
public class DatabaseMetaDataDemo{
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
		DatabaseMetaData dmd = null ;		// ���ݿ�Ԫ����
		ResultSet rs = null ;
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		dmd = conn.getMetaData() ;	// ʵ��������
		System.out.println("���ݿ����ƣ�" + dmd.getDatabaseProductName() ) ;
		System.out.println("���ݿ�汾��" + dmd.getDatabaseMajorVersion() + "."
			+ dmd.getDatabaseMinorVersion()) ;
		rs = dmd.getPrimaryKeys(null,null,"user") ;	// ȡ��user�������
		while(rs.next()){
			System.out.println("�����" + rs.getString(1)) ;
			System.out.println("��ģʽ��" + rs.getString(2)) ;
			System.out.println("�����ƣ�" + rs.getString(3)) ;
			System.out.println("�����ƣ�" + rs.getString(4)) ;
			System.out.println("�������кţ�" + rs.getString(5)) ;
			System.out.println("�������ƣ�" + rs.getString(6)) ;
		}
		conn.close() ;			// ���ݿ�ر�
	}
};