import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
public class JDBC20ReadDemo{
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
		String sql = "SELECT id,name,password,age,sex,birthday FROM user" ;// �˴�����Ҫ�����κε�����
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt = conn.prepareStatement(sql,
			ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_READ_ONLY) ;
		rs = pstmt.executeQuery() ;	// ��ѯ����
		System.out.println("��2�����ݣ�") ;
		rs.absolute(1) ;	// �ڶ�������
		print(rs,1) ;
		System.out.println("��1�����ݣ�") ;
		rs.beforeFirst() ;
		print(rs,1) ;
		System.out.println("��4�����ݣ�") ;
		rs.afterLast() ;// ���һ������֮��
		print(rs,-1) ;
		rs.close() ;
		pstmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
	public static void print(ResultSet rs,int re) throws Exception{
		if(re>0){
			rs.next() ;		// ��ǰ���
		}else{
			rs.previous() ;	// �ɺ���ǰ
		}
		int id = rs.getInt(1) ;
		String name = rs.getString(2) ;
		String pass = rs.getString(3) ;
		int age = rs.getInt(4) ;
		String sex = rs.getString(5) ;
		java.util.Date d = rs.getDate(6) ;
		System.out.print("��ţ�" + id + "��") ;
		System.out.print("������" + name + "��") ;
		System.out.print("���룺" + pass + "��") ;
		System.out.print("���䣺" + age + "��") ;
		System.out.print("�Ա�" + sex + "��") ;
		System.out.println("���գ�" + d + "��") ;
		System.out.println("----------------------------") ;
	}
};