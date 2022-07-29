package com.camping.mvc.camping.model.dao;
import static com.camping.common.jdbc.JDBCTemplate.close;

import static com.camping.common.jdbc.JDBCTemplate.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.camping.mvc.camping.model.vo.ReviewVO;

public class CampReviewDAO {

	// 캠핑장 리뷰 작성 쿼리문 - int
	public int insertReview(Connection conn, ReviewVO review) {
		PreparedStatement pstmt = null;
		String query = "INSERT INTO REVIEW VALUES(SEQ_REV_NO.NEXTVAL, ?,?, SYSDATE,DEFAULT,?,DEFAULT,DEFAULT) ";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, review.getRev_title());
			pstmt.setString(2, review.getRev_content());
			pstmt.setString(3, review.getRev_star());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	
	// 캠핑장 번호별 리뷰 조회 쿼리문 
	public ReviewVO findReviewByNo(Connection conn, int campNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReviewVO review = null;
		String query = "SELECT REV_NO, REV_TITLE, REV_CONTENT, REV_REGIST, REV_STAR, USER_NO, CS_NO "
				+ "FROM REVIEW "
				+ "WHERE CS_NO = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, campNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				review = new ReviewVO();
				review.setRev_title(rs.getString("REV_TITLE"));
				review.setRev_content(rs.getString("REV_CONTENT"));
				review.setRev_star(rs.getString("REV_STAR"));
				review.setUser_no(rs.getInt("USER_NO"));
				review.setCs_no(rs.getInt("CS_NO"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return review;
	}
	
	
	
	
	public static void main(String[] args) {
		Connection conn = getConnection();
		CampReviewDAO dao = new CampReviewDAO();
		ReviewVO review = new ReviewVO();
		
		review.setRev_title("제목");
		review.setRev_content("자바에서 작성한 테스트 글");
		review.setRev_star("4");
		int result = dao.insertReview(conn, review);
		System.out.println("리뷰 : " + result);
	}
	
}
