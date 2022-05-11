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
				<h1>ad</span></h1>	
				<hr>
				<div class="form-group">
					<h2>광고 신청하시겠습니까?</h2>
					<button class="btn btn-danger" type="button" id="btn_applyAd">신청하기</button>
				</div>
			</div> 
		</div><!-- /container -->
		<script src="/resources/assets/js/classie.js"></script>
		<script>
		$(function() {
			$("#btn_id").click(function(){
                alert("신 청 완 료 ★");
                alert("관 리 자 승 인 기 다 리 라 우 ★");
                $("#btn_applyAd").attr("disabled", true);
            });
        })
		</script>
</body>
</html>