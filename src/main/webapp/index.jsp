<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/views/07_common/header.jsp"%>
	<h1>헬로방구리</h1>
  <div><a href="<%=path%>/camping/list">캠핑검색창 강사님 여기에요 도와주세요</a></div>
  <div style="font-size:100px;"><a href="<%=path%>/views/01_Main/main.jsp">자 드가자</a></div>
  
  
  
  	<form class="pe-xl-3" action="<%=path %>/camping/list" method="get">
				<div class="mb-4">
					<label class="form-label" for="form_dates"></label>
					<div class="datepicker-container datepicker-container-left">
						<input class="form-control" type="text" name="bookingDate"
							id="form_dates" placeholder="날짜를 선택하세요" >
					</div>
				</div>
				<div class="mb-4">
					<label class="form-label" for="form_search"></label>
					<div class="input-label-absolute input-label-absolute-right">
						<div class="label-absolute">
							<i class="fa fa-search"></i>
						</div>
						<input class="form-control pe-4" type="search" name="searchValue"
							placeholder="캠핑장명" id="form_search" >
					</div>
					<button class="form-control pe-4" type="submit"
						style="background-color: #F05945; color: white">
						<i class="fas fa-filter me-1"></i>캠핑장검색
					</button>
				</div>
			</form>
  
  
</body>
</html>