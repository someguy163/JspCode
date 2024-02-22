JDBCEx는 DB연동

//DB 연동 기본 공식
package com.mit.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
	Connection conn = null;

	PreparedStatement pstmt;

	final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDRiver";
	final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public void open() {
		try {	
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL,"ora_user","1234");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {

		}
	}
}
