import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
public class TranDemo02{
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
		Statement stmt = null ;		// �������ݿ����
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;

		conn.setAutoCommit(false) ;	// ȡ�����Զ��ύ

		stmt = conn.createStatement() ;
		stmt.addBatch("INSERT INTO user(name,password,age,sex,birthday)" +
			" VALUES ('LXH-1','hello-1',11,'��','1975-03-05') ") ;
		stmt.addBatch("INSERT INTO user(name,password,age,sex,birthday)" +
			" VALUES ('LXH-2','hello-2',12,'Ů','1976-03-05') ") ;
		// ���롰'��֮�󣬴�SQL�﷨�ͳ����˴������ԣ��϶�ִ�е�������ʱ����ִ������
		stmt.addBatch("INSERT INTO user(name,password,age,sex,birthday)" +
			" VALUES ('LXH-'3','hello-3',13,'��','1977-06-01') ") ;
		stmt.addBatch("INSERT INTO user(name,password,age,sex,birthday)" +
			" VALUES ('LXH-4','hello-4',14,'Ů','1965-03-05') ") ;
		stmt.addBatch("INSERT INTO user(name,password,age,sex,birthday)" +
			" VALUES ('LXH-5','hello-5',15,'Ů','1965-08-05') ") ;
		try{
			int temp[] = stmt.executeBatch() ;
			System.out.println("�����ˣ�" + temp.length+ "�����ݡ�") ;
			conn.commit() ;	// ���еĲ����ɹ���
		}catch(Exception e){
			try{
				conn.rollback() ;
			}catch(Exception e1){
				
			}
		}
		stmt.close() ;
		conn.close() ;			// ���ݿ�ر�
	}
};