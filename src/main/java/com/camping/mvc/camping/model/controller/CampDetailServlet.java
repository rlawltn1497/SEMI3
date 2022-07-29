package com.camping.mvc.camping.model.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.camping.mvc.camping.model.service.CampSiteService;
import com.camping.mvc.camping.model.vo.CampingVO;


@WebServlet("/camping/Detail")
public class CampDetailServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private CampSiteService service = new CampSiteService();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int campNo = Integer.parseInt(req.getParameter("campingNo"));
		
		CampingVO campingVO = service.findCampDetailByNo(campNo);
		
		System.out.println(campingVO);
		
		req.setAttribute("campingVO", campingVO);
		req.getRequestDispatcher("/views/02_Camping/campingDetail.jsp").forward(req, resp);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
