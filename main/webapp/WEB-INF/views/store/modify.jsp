<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../common/head.jsp"/>
	<link rel="stylesheet" href="/resources/assets/css/normalizeStoreManagement.css" />
	<link rel="stylesheet" href="/resources/assets/css/demoStoreManagement.css" />
	<link rel="stylesheet" href="/resources/assets/css/componentStoreManagement.css" />
	<script src="/resources/assets/js/modernizr.custom.js"></script>
</head>
<body style="background-color : white;">
<jsp:include page="../common/nav.jsp"/>
	<div style="border:1px solid;"></div>
		<div style="width:100%; padding:0px; margin:0px;">
			<div class="col-3 p-0" id="nav">
				<jsp:include page="../store/sidebar.jsp"></jsp:include>
			</div>
			<div class="col-8 float-right" style="position:relative; display: inline-block;">
				<div class="card-body">
						<c:if test="${member.sno == null}">
							<h1>등록 되어 있는 가게가 없습니다.</h1>
						</c:if>
						<c:if test="${member.sno != null}">
                            <form method="post">
							<h1>My Store</h1>
							<hr>
							  <div class="form-group">
							    <label for="title">카테고리</label>
							    <input type="text" class="form-control" placeholder="category" id="category" name="category" value='${store.category}'>
							  </div>
		
							  <div class="form-group">
							    <label for="writer">가게 이름</label>
							    <input type="text" class="form-control" placeholder="name" id="name" name="name" value='${store.name}'>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">사업자 등록 번호</label>
							    <input type="text" class="form-control" placeholder="business number" id="bno" name="bno" value='${store.bno}'>
							  </div>

							  <div class="form-group">
							    <label for="content">주소</label>
							    <input type="text" class="form-control" placeholder="address" id="address" name="address" value='${store.address}'>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">영업 시작 시간</label>
							    <input type="text" class="form-control" placeholder="startTime" id="startTime" name="startTime" value='${store.startTime}'>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">영업 종료 시간</label>
							    <input type="text" class="form-control" placeholder="endTime" id="endTime" name="endTime" value='${store.endTime}'>
							  </div>

							  <div class="form-group">
							    <label for="writer">가게 공지사항</label>
							  	<textarea class="form-control" placeholder="store Notice" id="notice" name="notice" style="resize:none; height:200px">${store.notice}</textarea>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">원산지 표기</label>
							    <input type="text" class="form-control" placeholder="origin Info" id="originInfo" name="originInfo" value='${store.originInfo}'>
							  </div>
							  
							  <h1>DELIVERY</h1>
							  <hr>

							  <div class="form-group">
							    <label for="writer">배달 최소 금액</label>
							    <input type="text" class="form-control" placeholder="Delivery Min Price" id="minPrice" name="minPrice" value='${store.minPrice}'>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">배달료</label>
							    <input type="text" class="form-control" placeholder="Delivery Price" id="delPrice" name="delPrice" value='${store.delPrice}'>
							  </div>
							  
							  <div class="form-group">
							    <label for="writer">배달 시간</label>
							    <input type="text" class="form-control" placeholder="Delivery Time" id="delTime" name="delTime" value='${store.delTime}'>
							  </div>

							  <!-- 
							  <h1>Logo</h1>
							  
							  <div class="form-group uploadDiv">
							    <label for="attach" class="btn btn-success btn-sm">첨부</label>
							    <input type="file" class="form-control d-none" placeholder="attach" id="attach" name="attach" multiple>
							  </div>
							  <ul class="list-group small px-1 upload-files">
                                  
                              </ul>                         
							  	<style>
							  		.thumbs figure {overflow: hidden;}
							  		.thumbs figure img {transition: all .2s;}
							  		.thumbs figure img:hover {transform: scale(1.05);}
							  	</style>
                              <div class="pt-3 ">
                              	<div class="row thumbs">
                              		<div class="col-6 col-sm-4 col-lg-3 col-xl-2">
		                              	<figure class="d-inline-block " style="position : relative;">
			                              	<figcaption>
			                              		<button type="button" class="close" style="position : absolute; top:15px; right:15px"><span>&times;</span></button>
			                              	</figcaption>
			                              	<a href="/display?origin=%ED%8C%8C%EC%9B%8C%EB%A0%88%EC%9D%B8%EC%A1%B0_ERD.png&amp;uuid=5a9e8713-8e6b-4d5f-9365-2290c0c060d7.png&amp;path=2022%2F05%2F04&amp;image=true" data-lightbox="aa-1" data-title="웅냥냥">
			                              		<img alt="" src="/display?origin=%ED%8C%8C%EC%9B%8C%EB%A0%88%EC%9D%B8%EC%A1%B0_ERD.png&amp;uuid=s_5a9e8713-8e6b-4d5f-9365-2290c0c060d7.png&amp;path=2022%2F05%2F04&amp;image=true" class="mx-1 my-2 img-thumbnail"></a>
			                              	</a>
		                              	</figure>
                              		</div>
                              	</div>
                              	 -->

							  <sec:csrfInput/>
							  <button type="submit" class="btn btn-primary" id="btnReg">등록하기</button>
							</form>
						</c:if>
                        </div>	
			</div>
		</div><!-- /container -->
		<script src="/resources/assets/js/classie.js"></script>
</body>
</html>