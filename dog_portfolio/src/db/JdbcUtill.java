package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtill {

	static Connection conn;

	public static Connection DB_Connection() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://db-46lnk.pub-cdb.ntruss.com:3306/dogfind_db","dogfind_dba","kevin1141@");
			System.out.println("DB-Success");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void Close_DB(Connection conn) throws SQLException {
		conn.close();
	}

}
