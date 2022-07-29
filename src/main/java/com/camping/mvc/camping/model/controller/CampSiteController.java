package com.camping.mvc.camping.model.controller;

import java.util.List;

import com.camping.api.CampSiteAPI;
import com.camping.mvc.camping.model.service.CampSiteService;
import com.camping.mvc.camping.model.vo.CampingVO;

public class CampSiteController {
	CampSiteService campSiteService = new CampSiteService();
	
	public void initCampSiteData() {
//		CampSiteAPI campSiteApi = new CampSiteAPI();
		List<CampingVO> list = CampSiteAPI.callCampListByXML();
		for(CampingVO camp : list) {
			campSiteService.insertCampSiteData(camp);
		}
		System.out.println("완료");
	}
	
	public static void main(String[] args) {
		CampSiteController controller = new CampSiteController();
		controller.initCampSiteData();
	}
}
