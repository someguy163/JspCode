package com.mit.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//오라클 기반의 데이터베이스 세팅 기본 구문
// DAO는 DB에 접근해서 데이터를 처리 (CRUD 등)를 위한 객체이다.(데이터베이스에 접근해 데이터를 조회하거나 조작하는 기능을 전담하는 객체)
//DAO에 메서드로 select, insert, delete, update 와 같이 DB에 접근해 데이터를 조작하는 연산을 구현해놓고, 넣어야하거나 빼내야하는 데이터를 DTO를 사용해서 가져오고 빼낸다.
public class StudentDAO {
	Connection conn = null;
	PreparedStatement pstmt; // SQL 실행을 위한 객체

	final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; // 오른쪽 주소를 왼쪽 변수에 담기
	final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public void open() { // 데이터 베이스 접속 구문
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "ora_user", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() { // 데이터 베이스 해제 구문
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(Student s) { // insert 메소드
		open();
		String sql = "INSERT INTO student(id, username, univ, birth, email) values(SEQ_ID.NEXTVAL,?,?,?,?)"; // sql 변수
																												// 만들고

		try {
			pstmt = conn.prepareStatement(sql); // 위 변수를 호출
			pstmt.setString(1, s.getUsername());
			pstmt.setString(2, s.getUniv());
			pstmt.setDate(3, s.getBirth());
			pstmt.setString(4, s.getEmail());

			pstmt.executeUpdate(); // 수행결과로 Int 타입의 값을 반환합니다.( INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를
									// 반환합니다.)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public List<Student> getAll() {
		open();
		List<Student> students = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement("select * from student order by 1");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setUsername(rs.getString("username"));
				s.setUniv(rs.getString("univ"));
				s.setBirth(rs.getDate("birth"));
				s.setEmail(rs.getString("email"));

				students.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return students;
	}
}
