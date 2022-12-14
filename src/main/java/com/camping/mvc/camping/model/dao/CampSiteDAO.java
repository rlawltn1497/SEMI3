package com.camping.mvc.camping.model.dao;




import static com.camping.common.jdbc.JDBCTemplate.close;
import static com.camping.common.jdbc.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.camping.common.util.PageInfo;
import com.camping.mvc.camping.model.vo.CampingVO;

public class CampSiteDAO {
	
		
//			public List<CampingVO> selectAll(Connection conn) {
//			List<CampingVO> list = new ArrayList<CampingVO>();
//			
//			try {
//				String sql = "SELECT * FROM camp_site ORDER BY cs_no";
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				ResultSet rs = pstmt.executeQuery(); 
//				while(rs.next()) {
//					int cnt = 1;
//					int cs_no       = rs.getInt(cnt++);
//					String cs_name  = rs.getString(cnt++);
//					String cs_line_intro  = rs.getString(cnt++);
//					String cs_intro = rs.getString(cnt++);
//					String cs_allar   = rs.getString(cnt++);
//					String cs_insrnc_at = rs.getString(cnt++);
//					String cs_bizr_no  = rs.getString(cnt++);
//					String cs_managesttus  = rs.getString(cnt++);
//					String cs_feature_name  = rs.getString(cnt++);
//					String cs_induty  = rs.getString(cnt++);
//					String cs_lct_cl  = rs.getString(cnt++);
//					String cs_do_name  = rs.getString(cnt++);
//					String cs_sigungu_name  = rs.getString(cnt++);
//					String cs_zipcode  = rs.getString(cnt++);
//					String cs_addr1  = rs.getString(cnt++);
//					String cs_addr2  = rs.getString(cnt++);
//					String cs_map_x  = rs.getString(cnt++);
//					String cs_map_y  = rs.getString(cnt++);
//					String cs_tel  = rs.getString(cnt++);
//					String cs_homepage  = rs.getString(cnt++);
//					String cs_resve_url  = rs.getString(cnt++);
//					String cs_resve_cl  = rs.getString(cnt++);
//					int cs_manager  = rs.getInt(cnt++);
//					int cs_gnrl_site  = rs.getInt(cnt++);
//					int cs_auto_site  = rs.getInt(cnt++);
//					int cs_glamp_site  = rs.getInt(cnt++);
//					int cs_carav_site  = rs.getInt(cnt++);
//					int cs_indiv_carav_site  = rs.getInt(cnt++);
//					String cs_animal_cmg  = rs.getString(cnt++);
//					String cs_postbl_fclty  = rs.getString(cnt++);
//					String cs_sbrs_cl  = rs.getString(cnt++);
//					String cs_accom_fee  = rs.getString(cnt++);
//					String cs_image  = rs.getString(cnt++);
//					CampingVO cv = new CampingVO(cs_no, cs_name, cs_line_intro, cs_intro, cs_allar,
//							cs_insrnc_at, cs_bizr_no,cs_managesttus,cs_feature_name, cs_induty,
//							cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode,  cs_addr1,
//							 cs_addr2,  cs_map_x,  cs_map_y,  cs_tel,  cs_homepage,  cs_resve_url,
//							 cs_resve_cl,  cs_manager,  cs_gnrl_site,  cs_auto_site,  cs_glamp_site,
//							 cs_carav_site,  cs_indiv_carav_site,  cs_animal_cmg,  cs_postbl_fclty,
//							 cs_sbrs_cl, cs_accom_fee, cs_image);
//					list.add(cv);
//				}
//				pstmt.close();
//				rs.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			return list;
//		}
		
		public int insertCampingData(Connection conn, CampingVO camp) {
			try {
				String sql = "INSERT INTO camp_site VALUES (?, ? , ? , ? , ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
						+ ",?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ? )";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				int cnt = 1;
				pstmt.setInt           (cnt++, camp.getCs_no());
				pstmt.setString        (cnt++, camp.getCs_name());
				pstmt.setString        (cnt++, camp.getCs_line_intro());
				pstmt.setString        (cnt++, camp.getCs_intro());
				pstmt.setString        (cnt++, camp.getCs_allar());
				pstmt.setString        (cnt++, camp.getCs_insrnc_at());
				pstmt.setString        (cnt++, camp.getCs_bizr_no());
				pstmt.setString        (cnt++, camp.getCs_managesttus());
				pstmt.setString        (cnt++, camp.getCs_feature_name());
				pstmt.setString        (cnt++, camp.getCs_induty());
				pstmt.setString        (cnt++, camp.getCs_lct_cl());
				pstmt.setString        (cnt++, camp.getCs_do_name());
				pstmt.setString        (cnt++, camp.getCs_sigungu_name());
				pstmt.setString        (cnt++, camp.getCs_zipcode());
				pstmt.setString        (cnt++, camp.getCs_addr1());
				pstmt.setString        (cnt++, camp.getCs_addr2());
				pstmt.setString        (cnt++, camp.getCs_map_x());
				pstmt.setString        (cnt++, camp.getCs_map_y());
				pstmt.setString        (cnt++, camp.getCs_tel());
				pstmt.setString        (cnt++, camp.getCs_homepage());
				pstmt.setString        (cnt++, camp.getCs_resve_url());
				pstmt.setString        (cnt++, camp.getCs_resve_cl());
				pstmt.setInt           (cnt++, camp.getCs_manager());
				pstmt.setInt           (cnt++, camp.getCs_gnrl_site());
				pstmt.setInt           (cnt++, camp.getCs_auto_site());
				pstmt.setInt           (cnt++, camp.getCs_glamp_site());
				pstmt.setInt           (cnt++, camp.getCs_carav_site());
				pstmt.setInt           (cnt++, camp.getCs_indiv_carav_site());
				pstmt.setString        (cnt++, camp.getCs_animal_cmg());
				pstmt.setString        (cnt++, camp.getCs_postbl_fclty());
				pstmt.setString        (cnt++, camp.getCs_sbrs_cl());
				pstmt.setString        (cnt++, camp.getCs_accom_fee());
				pstmt.setString        (cnt++, camp.getCs_image());
				
				int result = pstmt.executeUpdate();
				pstmt.close();
				return result;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		
		//?????? ????????? ??????????????? ???????????? ???????????? ????????? ?????? ????????? ???????????? ?????????
		public int getCampsiteCount(Connection conn) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "SELECT COUNT(*) FROM camp_site";
			int result = 0;
			try {
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					result = rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return result;
		}
		
		//?????? ??????????????? ??????????????? ???????????? ???????????? ?????????
		public List<CampingVO> findAll(Connection conn, PageInfo pageInfo){
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<CampingVO> list = new ArrayList<>();
			String query = "SELECT RNUM, cs_no, cs_name,cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM (  "
					+ "SELECT ROWNUM AS RNUM, cs_no, cs_name, cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM (  "
					+ " SELECT cs_no, cs_name, cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM camp_site  "
					+ "  WHERE 1 = 1 ORDER BY cs_no DESC ) ) WHERE RNUM BETWEEN ? and ?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, pageInfo.getStartList());
				pstmt.setInt(2, pageInfo.getEndList());
				rs = pstmt.executeQuery();
				while(rs.next()) {
					CampingVO campsite = new CampingVO();
					int cnt = 1;
//					int cs_no               = rs.getInt(cnt++);
					campsite.setRowNum(rs.getInt(cnt++));
					campsite.setCs_no(rs.getInt(cnt++));
//					System.out.println("cs_no : " + cs_no);
//					String cs_name          = rs.getString(cnt++);
					campsite.setCs_name(rs.getString(cnt++));
//					String cs_line_intro    = rs.getString(cnt++);
					campsite.setCs_line_intro(rs.getString(cnt++));
//					String cs_intro         = rs.getString(cnt++);
					campsite.setCs_intro(rs.getString(cnt++));
//					String cs_allar         = rs.getString(cnt++);
					campsite.setCs_allar(rs.getString(cnt++));
//					String cs_insrnc_at     = rs.getString(cnt++);
					campsite.setCs_insrnc_at(rs.getString(cnt++));
//					String cs_bizr_no       = rs.getString(cnt++);
					campsite.setCs_bizr_no(rs.getString(cnt++));
//					String cs_managesttus   = rs.getString(cnt++);
					campsite.setCs_managesttus(rs.getString(cnt++));
//					String cs_feature_name  = rs.getString(cnt++);
					campsite.setCs_feature_name(rs.getString(cnt++));
//					String cs_induty        = rs.getString(cnt++);
					campsite.setCs_induty(rs.getString(cnt++));
//					String cs_lct_cl        = rs.getString(cnt++);
					campsite.setCs_lct_cl(rs.getString(cnt++));
//					String cs_do_name       = rs.getString(cnt++);
					campsite.setCs_do_name(rs.getString(cnt++));
//					String cs_sigungu_name  = rs.getString(cnt++);
					campsite.setCs_sigungu_name(rs.getString(cnt++));
//					String cs_zipcode       = rs.getString(cnt++);
					campsite.setCs_zipcode(rs.getString(cnt++));
//					String cs_addr1         = rs.getString(cnt++);
					campsite.setCs_addr1(rs.getString(cnt++));
//					String cs_addr2         = rs.getString(cnt++);
					campsite.setCs_addr2(rs.getString(cnt++));
//					String cs_map_x         = rs.getString(cnt++);
					campsite.setCs_map_x(rs.getString(cnt++));
//					String cs_map_y         = rs.getString(cnt++);
					campsite.setCs_map_y(rs.getString(cnt++));
//					String cs_tel           = rs.getString(cnt++);
					campsite.setCs_tel(rs.getString(cnt++));
//					String cs_homepage      = rs.getString(cnt++);
					campsite.setCs_homepage(rs.getString(cnt++));
//					String cs_resve_url     = rs.getString(cnt++);
					campsite.setCs_resve_url(rs.getString(cnt++));
//					String cs_resve_cl      = rs.getString(cnt++);
					campsite.setCs_resve_cl(rs.getString(cnt++));
//					int cs_manager          = rs.getInt(cnt++);
					campsite.setCs_manager(rs.getInt(cnt++));
//					int cs_gnrl_site        = rs.getInt(cnt++);
					campsite.setCs_gnrl_site(rs.getInt(cnt++));
//					int cs_auto_site        = rs.getInt(cnt++);
					campsite.setCs_auto_site(rs.getInt(cnt++));
//					int cs_glamp_site       = rs.getInt(cnt++);
					campsite.setCs_glamp_site(rs.getInt(cnt++));
//					int cs_carav_site       = rs.getInt(cnt++);
					campsite.setCs_carav_site(rs.getInt(cnt++));
//					int cs_indiv_carav_site = rs.getInt(cnt++);
					campsite.setCs_indiv_carav_site(rs.getInt(cnt++));
//					String cs_animal_cmg    = rs.getString(cnt++);
					campsite.setCs_animal_cmg(rs.getString(cnt++));
//					String cs_postbl_fclty  = rs.getString(cnt++);
					campsite.setCs_postbl_fclty(rs.getString(cnt++));
//					String cs_sbrs_cl       = rs.getString(cnt++);
					campsite.setCs_sbrs_cl(rs.getString(cnt++));
//					String cs_accom_fee     = rs.getString(cnt++);
					campsite.setCs_accom_fee(rs.getString(cnt++));
//					String cs_image         = rs.getString(cnt++);
					campsite.setCs_image(rs.getString(cnt++));
//					CampingVO cv = new CampingVO(cs_no, cs_name, cs_line_intro, cs_intro, cs_allar,
//							cs_insrnc_at, cs_bizr_no,cs_managesttus,cs_feature_name, cs_induty,
//							cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode,  cs_addr1,
//							 cs_addr2,  cs_map_x,  cs_map_y,  cs_tel,  cs_homepage,  cs_resve_url,
//							 cs_resve_cl,  cs_manager,  cs_gnrl_site,  cs_auto_site,  cs_glamp_site,
//							 cs_carav_site,  cs_indiv_carav_site,  cs_animal_cmg,  cs_postbl_fclty,
//							 cs_sbrs_cl, cs_accom_fee, cs_image);
//					list.add(cv);
					list.add(campsite);
				}
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return list;
		}
		
		//????????? ????????? ????????? ???????????? ?????????
		public int getCampsiteCount(Connection conn, String searchWord, String addr, String[] campTypes,
				String[] checkBoxs) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "SELECT COUNT(*) FROM camp_site WHERE 1=1";
			
			if(searchWord != null) {
				query += "AND cs_name LIKE ? ";
			}
			if(addr != null) {
				query += "AND cs_do_name LIKE ? ";
			}
			if(campTypes != null) {
				for(int i = 0; i < campTypes.length; i++) {
					query += "AND cs_induty LIKE ? ";
				}
			}
			if(checkBoxs != null) {
				for(int i = 0; i < checkBoxs.length; i++) {
					query += "AND cs_postbl_fclty LIKE ? ";
				}
			}
			int result = 0;
			
			try {
				pstmt = conn.prepareStatement(query);
				int count = 1;
				if(searchWord != null) {
					pstmt.setString(count++,  "%" + searchWord + "%");
				}
				if(addr != null) {
					pstmt.setString(count++,  "%" + addr + "%");
				}
				if(campTypes != null) {
					for(int i = 0; i < campTypes.length; i++) {
					pstmt.setString(count++, "%" + campTypes[i] + "%");
					}
				}
				if(checkBoxs != null) {
					for(int i = 0; i < checkBoxs.length; i++) {
						pstmt.setString(count++, "%" + checkBoxs[i] + "%");
						}
				}
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = rs.getInt(1);
				}
				System.out.println("???????????????1");
				close(pstmt);
				close(rs);
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
			}
			System.out.println("????????? ?????? campsiteCount : " + result);
			return result;
		}
		
		//???????????? ???????????? ???????????? ?????????
		public List<CampingVO> findAll(Connection conn, PageInfo pageInfo, String searchWord, String addr,
				String[] campTypes, String[] checkBoxs) {
			System.out.println("???????????????  : "+pageInfo.getStartList());
			System.out.println("?????????????????? : "+pageInfo.getEndList());
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<CampingVO> list = new ArrayList<>();
			String queryBefore = "SELECT RNUM, cs_no, cs_name,cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM (  "
					+ "SELECT ROWNUM AS RNUM, cs_no, cs_name, cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM (  "
					+ " SELECT cs_no, cs_name, cs_line_intro, cs_intro, cs_allar, cs_insrnc_at, cs_bizr_no, cs_managesttus  "
					+ ", cs_feature_name, cs_induty, cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode, cs_addr1, cs_addr2, cs_map_x  "
					+ ", cs_map_y, cs_tel, cs_homepage, cs_resve_url, cs_resve_cl, cs_manager, cs_gnrl_site, cs_auto_site, cs_glamp_site  "
					+ ", cs_carav_site, cs_indiv_carav_site, cs_animal_cmg, cs_postbl_fclty, cs_sbrs_cl, cs_accom_fee, cs_image FROM camp_site  "
					+ "  WHERE 1 = 1";
			
			String queryAfter = " ORDER BY cs_no DESC ) ) WHERE RNUM BETWEEN ? and ?";
			
			if(searchWord != null) {
				queryBefore += "AND cs_name LIKE ? ";
			}
			if(addr != null) {
				queryBefore += "AND cs_do_name LIKE ? ";
			}
			if(campTypes != null) {
				for(int i = 0; i < campTypes.length; i++) {
					queryBefore += "AND cs_induty LIKE ? ";
				}
			}
			if(checkBoxs != null) {
				for(int i = 0; i < checkBoxs.length; i++) {
					queryBefore += "AND cs_postbl_fclty LIKE ? ";
				}
			}
			
			String query = queryBefore + queryAfter;
			try {
				pstmt = conn.prepareStatement(query);
				int count = 1;
				
				if(searchWord != null) {
					pstmt.setString(count++,  "%" + searchWord + "%");
				}
				if(addr != null) {
					pstmt.setString(count++,  "%" + addr + "%");
				}
				if(campTypes != null) {
					for(int i = 0; i < campTypes.length; i++) {
					pstmt.setString(count++, "%" + campTypes[i] + "%");
					}
				}
				if(checkBoxs != null) {
					for(int i = 0; i < checkBoxs.length; i++) {
						pstmt.setString(count++, "%" + checkBoxs[i] + "%");
						}
				}
				
				
				pstmt.setInt(count++, pageInfo.getStartList());
				pstmt.setInt(count++, pageInfo.getEndList());
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					CampingVO campsite = new CampingVO();
					int cnt = 1;
//					int cs_no               = rs.getInt(cnt++);
					campsite.setRowNum(rs.getInt(cnt++));
					campsite.setCs_no(rs.getInt(cnt++));
//					System.out.println("cs_no : " + cs_no);
//					String cs_name          = rs.getString(cnt++);
					campsite.setCs_name(rs.getString(cnt++));
//					String cs_line_intro    = rs.getString(cnt++);
					campsite.setCs_line_intro(rs.getString(cnt++));
//					String cs_intro         = rs.getString(cnt++);
					campsite.setCs_intro(rs.getString(cnt++));
//					String cs_allar         = rs.getString(cnt++);
					campsite.setCs_allar(rs.getString(cnt++));
//					String cs_insrnc_at     = rs.getString(cnt++);
					campsite.setCs_insrnc_at(rs.getString(cnt++));
//					String cs_bizr_no       = rs.getString(cnt++);
					campsite.setCs_bizr_no(rs.getString(cnt++));
//					String cs_managesttus   = rs.getString(cnt++);
					campsite.setCs_managesttus(rs.getString(cnt++));
//					String cs_feature_name  = rs.getString(cnt++);
					campsite.setCs_feature_name(rs.getString(cnt++));
//					String cs_induty        = rs.getString(cnt++);
					campsite.setCs_induty(rs.getString(cnt++));
//					String cs_lct_cl        = rs.getString(cnt++);
					campsite.setCs_lct_cl(rs.getString(cnt++));
//					String cs_do_name       = rs.getString(cnt++);
					campsite.setCs_do_name(rs.getString(cnt++));
//					String cs_sigungu_name  = rs.getString(cnt++);
					campsite.setCs_sigungu_name(rs.getString(cnt++));
//					String cs_zipcode       = rs.getString(cnt++);
					campsite.setCs_zipcode(rs.getString(cnt++));
//					String cs_addr1         = rs.getString(cnt++);
					campsite.setCs_addr1(rs.getString(cnt++));
//					String cs_addr2         = rs.getString(cnt++);
					campsite.setCs_addr2(rs.getString(cnt++));
//					String cs_map_x         = rs.getString(cnt++);
					campsite.setCs_map_x(rs.getString(cnt++));
//					String cs_map_y         = rs.getString(cnt++);
					campsite.setCs_map_y(rs.getString(cnt++));
//					String cs_tel           = rs.getString(cnt++);
					campsite.setCs_tel(rs.getString(cnt++));
//					String cs_homepage      = rs.getString(cnt++);
					campsite.setCs_homepage(rs.getString(cnt++));
//					String cs_resve_url     = rs.getString(cnt++);
					campsite.setCs_resve_url(rs.getString(cnt++));
//					String cs_resve_cl      = rs.getString(cnt++);
					campsite.setCs_resve_cl(rs.getString(cnt++));
//					int cs_manager          = rs.getInt(cnt++);
					campsite.setCs_manager(rs.getInt(cnt++));
//					int cs_gnrl_site        = rs.getInt(cnt++);
					campsite.setCs_gnrl_site(rs.getInt(cnt++));
//					int cs_auto_site        = rs.getInt(cnt++);
					campsite.setCs_auto_site(rs.getInt(cnt++));
//					int cs_glamp_site       = rs.getInt(cnt++);
					campsite.setCs_glamp_site(rs.getInt(cnt++));
//					int cs_carav_site       = rs.getInt(cnt++);
					campsite.setCs_carav_site(rs.getInt(cnt++));
//					int cs_indiv_carav_site = rs.getInt(cnt++);
					campsite.setCs_indiv_carav_site(rs.getInt(cnt++));
//					String cs_animal_cmg    = rs.getString(cnt++);
					campsite.setCs_animal_cmg(rs.getString(cnt++));
//					String cs_postbl_fclty  = rs.getString(cnt++);
					campsite.setCs_postbl_fclty(rs.getString(cnt++));
//					String cs_sbrs_cl       = rs.getString(cnt++);
					campsite.setCs_sbrs_cl(rs.getString(cnt++));
//					String cs_accom_fee     = rs.getString(cnt++);
					campsite.setCs_accom_fee(rs.getString(cnt++));
//					String cs_image         = rs.getString(cnt++);
					campsite.setCs_image(rs.getString(cnt++));
//					CampingVO cv = new CampingVO(cs_no, cs_name, cs_line_intro, cs_intro, cs_allar,
//							cs_insrnc_at, cs_bizr_no,cs_managesttus,cs_feature_name, cs_induty,
//							cs_lct_cl, cs_do_name, cs_sigungu_name, cs_zipcode,  cs_addr1,
//							 cs_addr2,  cs_map_x,  cs_map_y,  cs_tel,  cs_homepage,  cs_resve_url,
//							 cs_resve_cl,  cs_manager,  cs_gnrl_site,  cs_auto_site,  cs_glamp_site,
//							 cs_carav_site,  cs_indiv_carav_site,  cs_animal_cmg,  cs_postbl_fclty,
//							 cs_sbrs_cl, cs_accom_fee, cs_image);
//					list.add(cv);
					list.add(campsite);
				}
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("???????????????4 ??????!!");
			}finally {
				close(pstmt);
				close(rs);
			}
			System.out.println(list.toString());
			return list;
		
	}
		
		// ????????? ?????? ???????????? ?????????
		public CampingVO findCampDetailByNo(Connection conn, int campNo) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			CampingVO campingVO = null;
			String query = "SELECT CS_NO, CS_NAME, CS_ADDR1, CS_INDUTY, CS_RESVE_CL, CS_SBRS_CL, CS_POSTBL_FCLTY, CS_HOMEPAGE "
					+ "FROM CAMP_SITE " + "WHERE CS_NO = ? ";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, campNo);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					campingVO = new CampingVO();
					campingVO.setCs_no(rs.getInt("CS_NO"));
					campingVO.setCs_name(rs.getString("CS_NAME"));
					campingVO.setCs_addr1(rs.getString("CS_ADDR1"));
					campingVO.setCs_induty(rs.getString("CS_INDUTY"));
					campingVO.setCs_resve_cl(rs.getString("CS_RESVE_CL"));
					campingVO.setCs_sbrs_cl(rs.getString("CS_SBRS_CL"));
					campingVO.setCs_postbl_fclty(rs.getString("CS_POSTBL_FCLTY"));
					campingVO.setCs_homepage(rs.getString("CS_HOMEPAGE"));
					return campingVO;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return null;
		}
		
	
	public static void main(String[] args) {
//		CampSiteDAO cd = new CampSiteDAO();
//		Connection conn = getConnection();
//		System.out.println(cd.selectAll(conn));
		
		//?????? ??????
		Connection conn = getConnection();
		CampSiteDAO cd = new CampSiteDAO();
		int count = cd.getCampsiteCount(conn);
		System.out.println("????????? ?????? : " + count);
		System.out.println("------------------------");
		
		//????????? ????????? ??????
		PageInfo info = new PageInfo(1, 10, count, 20);
		List<CampingVO> list = cd.findAll(conn, info);
		for(CampingVO c : list) {
			System.out.println(c.toString());
		}
		System.out.println("------------------------");
		
		//????????? ?????? ????????? ?????? ???????????????
		
		String searchWord = "??????";
		String addr = "?????????";
		String[] campTypes = {"???????????????"};
		String[] checkBoxs = {"?????????"};
		count = cd.getCampsiteCount(conn, "??????", "?????????", campTypes, checkBoxs);
		System.out.println("????????? ?????? : " + count);
		System.out.println("------------------------");
	}

}
