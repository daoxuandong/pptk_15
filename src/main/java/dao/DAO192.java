package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAO192 {
	public static Connection con;
	public DAO192(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3307/pttk_15";
			String dbClass = "com.mysql.jdbc.Driver";
			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root","dong24102002");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}