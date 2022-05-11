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
			<div class="col-8 float-right" style="position:relative; display: inline-block;">
				<h1>history</span></h1>	
			</div> 
		</div><!-- /container -->
		<script src="/resources/assets/js/classie.js"></script>
</body>
</html>