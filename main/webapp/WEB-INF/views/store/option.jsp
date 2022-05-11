<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<jsp:include page="../common/nav.jsp"></jsp:include>
	<div style="border:1px solid;"></div>
		<div style="width:100%; padding:0px; margin:0px;">
			<div class="col-3 p-0" id="nav">
				<jsp:include page="../store/sidebar.jsp"></jsp:include>
			</div>
			<div class="col-8 float-right" style="position:relative; display:inline-block;">
				<div class="bossHeader" style="border-bottom: 1px solid; margin:15px 5px 10px -40px">
					<a class="btn btn-primary" href="#" style="padding-top: 5px; padding-bottom: 5px;float: right; margin: 5px 55px 5px 0px">옵션그룹추가</a>
					<h1 class="mine" style="margin: 0px"><span>OptionGroup</span></h1>
				</div>
				<div class="optGroup" style="margin: 0px 0px 5px 0px; border-bottom: 1px solid; padding: 5px">
					<h3>옵션그룹이름</h3>
					<p>옵션이름</p>
					<a href="#"><div style="display: flex; float: right; margin: 0px 55px 5px 0px;">x</a></div><br>
					<a>옵션조건선택여부</a>
				</div>
					<div class="optGroup" style="margin: 0px 0px 5px 0px; border-bottom: 1px solid; padding: 5px">
					<h3>옵션그룹이름</h3>
					<p>옵션이름</p>
					<a href="#"><div style="display: flex; float: right; margin: 0px 55px 5px 0px;">x</a></div><br>
					<a>옵션조건선택여부</a>
				</div>
					<div class="optGroup" style="margin: 0px 0px 5px 0px; border-bottom: 1px solid; padding: 5px">
					<h3>옵션그룹이름</h3>
					<p>옵션이름</p>
					<a href="#"><div style="display: flex; float: right; margin: 0px 55px 5px 0px;">x</a></div><br>
					<a>옵션조건선택여부</a>
				</div>
					<div class="optGroup" style="margin: 0px 0px 5px 0px; border-bottom: 1px solid; padding: 5px">
					<h3>옵션그룹이름</h3>
					<p>옵션이름</p>
					<a href="#"><div style="display: flex; float: right; margin: 0px 55px 5px 0px;">x</a></div><br>
					<a>옵션조건선택여부</a>
				</div>
			</div>
		</div>
		<script src="/resources/assets/js/classie.js"></script>
</body>
</html>