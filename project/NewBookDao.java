package teamD.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import koreait.jdbc.day2.OracleUtility;

import java.util.ArrayList;

public class NewBookDao {

	public NewBookDao(String string, String string2, String string3, String string4, String string5, int int1,
			int int2) {
		// TODO Auto-generated constructor stub
	}

	//전체 조회(new_book)
	public List<NewBookDao> selectAll() throws SQLException{
		Connection conn = OracleUtility.getConnection();
		String sql = "select * from new_book";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<NewBookDao> list = new ArrayList<>();
		while(rs.next()) {
			list.add(new NewBookDao(rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getInt(6),
					rs.getInt(7)));
		}
		ps.close();
		conn.close();
		return list;
	}
	
	//이름별 조회
	public List<NewBookDao> selectByBookName(String book_name) throws SQLException{
		Connection conn = OracleUtility.getConnection();
		String sql = "select * from new_book where book_name = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, book_name);
		ResultSet rs = ps.executeQuery();
		
		List<NewBookDao> list = new ArrayList<>();
		while(rs.next()) {
			list.add(new NewBookDao(rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getInt(6),
					rs.getInt(7)));
		}
		ps.close();
		conn.close();
		return list;
	}
}