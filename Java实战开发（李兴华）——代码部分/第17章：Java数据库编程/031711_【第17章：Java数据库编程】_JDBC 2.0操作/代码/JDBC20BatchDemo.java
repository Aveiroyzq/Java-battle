import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
public class JDBC20BatchDemo{
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
		String sql = "INSERT INTO user(name,password,age,sex,birthday) VALUES (?,?,?,?,?)" ;// �˴�����Ҫ�����κε�����
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql) ;	// ��ʾ��������Ը���
		for(int i=0;i<10;i++){
			pstmt.setString(1,"���˻� - " + i) ;
			pstmt.setString(2,"MLDN - " + i) ;
			pstmt.setInt(3,20 + i) ;
			pstmt.setString(4,"��")  ;
			pstmt.setDate(5,new java.sql.Date(new java.util.Date().getTime())) ;
			pstmt.addBatch() ;	// �����������ȴ�ִ��
		}
		int temp[] = pstmt.executeBatch() ;
		System.out.println("������" + temp.length + "�����ݡ�") ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};