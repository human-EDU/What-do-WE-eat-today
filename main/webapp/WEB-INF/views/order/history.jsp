<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>결제내역확인</title>
<jsp:include page="../common/head.jsp"/>
</head>
<body>
    <!-- Page Wrapper -->
	<div class="wrapper">
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">
            <!-- Main Content -->
            <div id="content">
				<jsp:include page="../common/nav.jsp"/>
                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                    		<p class="h2">주문이 <span class="h2 text-danger">완료</span>되었습니다.</p>
							<p class="h6">주문번호 : ${history.ono}</p>
                    		
                        </div>
                        <div class="card-body">
								<%-- history : ${history} --%>
								
							<ul>
								<%-- <li>결제번호 : ${history.pno}</li> --%>
								<%-- <li>결제아이디 : ${history.id}</li> --%>
								<li>주문매장 : ${history.name}</li>
								<li>총금액 : ${history.amount} 원</li>
								<%-- <li>결제완료메일 : ${history.email}</li> --%>
								<%-- <li>결제uid : ${history.impUid}</li> --%>
<!--  								<button type="button" class="btn btn-warning" data-bs-toggle="popover" title="결제내역" data-bs-content="Some content inside the popover">
								결제내역확인
								</button> -->
								<li>결제방식 : ${history.payMethod}</li>
								<li>카드승인번호 : ${history.applyNum}</li>
								<li>할부 : ${history.quota}</li>
								<li>상태 : ${history.status}</li>
<%-- 								<li>결제일 : ${history.timeStamp}</li>
								<li>취소일 : ${history.cancleDate}</li> --%>
							</ul>
							<hr>
							<ul>
								<li>메뉴</li>
								<li>가격 ${history.amount} 원</li>
							</ul>
							<hr>
							<ul>
								<li>배달주소 : ${history.address}</li>
								<li>핸드폰 : ${history.phoneNumber}</li>
								<li>가게사장님께</li>
							</ul>
						<hr>
						<div class="mb-3">
							<button type="button" class="btn"> 주문내역삭제</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../common/footer.jsp"/>
</div>
</body>
</html>