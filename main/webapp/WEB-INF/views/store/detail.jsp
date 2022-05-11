<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0, user-scalable=yes">
<title> </title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script type="text/javascript" src="https://unpkg.com/swiper@7/swiper-bundle.min.js"></script>
<script type="text/javascript" src="/resources/assets/js/common.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="/resources/assets/css/storeCommon.css">
<link rel="stylesheet" type="text/css" href="/resources/assets/css/storeLayOut.css">
<jsp:include page="../common/head.jsp" />
</head>
<body id="wrap">
<jsp:include page="../common/nav.jsp" />
	<header id="header">
	<div class="wrap">
	</div>
	</header>
	<section id="container"> 
	<!-- 상단 카테고리 java script는 추후 검색 대비 -->
	<jsp:include page="../common/category.jsp" />

	<div id="detail">
		<div class="wrap">
			<!-- 상단 가게소개 -->
			<div class="detail">
				<div class="store">
					<div class="title">${store.name}</div>
					<div class="content">
						<div class="desc">
							<div class="img">
								<img onerror="this.src='/resources/assets/images/noimage.png'" src="${store.logo}">
							</div>
							<div class="con">
								<div class="stars">
									<div class="star">
										<p class="${store.scope >= 1 ? 'on' : ''}">★</p>
										<p class="${store.scope >= 2 ? 'on' : ''}">★</p>
										<p class="${store.scope >= 3 ? 'on' : ''}">★</p>
										<p class="${store.scope >= 4 ? 'on' : ''}">★</p>
										<p class="${store.scope == 5 ? 'on' : ''}">★</p>
									</div>
									<div class="num">${store.scope}</div>
								</div>

								<div class="info">
									<dl>
										<dt>최소주문금액</dt>
										<dd>${store.minPrice}원</dd>
									</dl>
									<dl>
										<dt>결제</dt>
										<dd>신용카드, 현금</dd>
									</dl>
									<dl>
										<dt>배달시간</dt>
										<dd>
											${store.delTime}분
											<button type="button">
												<img src="/resources/assets/images/icon_questionmark.png">
												<p>
													최근 주문의 배달시간을 분석한 정보 입니다. <br>실제 배달시간과는 차이가 있을 수 있습니다.
												</p>
											</button>
										</dd>
									</dl>
								</div>
							</div>
						</div>
						<div class="mega">
							<div class="ttl">
								<img src="/resources/assets/images/icon_megaphone.png">
								<p>사장님알림</p>
							</div>
							<div class="txt">
								<a href="javascript:;"> ${store.notice}</a>
							</div>
						</div>
					</div>
				</div>
				<div class="menu tab-area">
					<div class="tabs tab-btns">
						<ul>
							<li class="active"><a href="javascript:;">메뉴 <em
									class="num">56</em></a></li>
							<li><a href="javascript:;">리뷰 <em class="num">${store.reviewNum}</em></a>
							</li>
							<li><a href="javascript:;">가게 정보</a></li>
						</ul>
					</div>
					<div class="content">
						<div class="tab-box active">
							<div class="setmenu">
								<ul>
									<li>
										<div class="setmenu-layer">
										
											<!-- 메뉴 -->
											
										</div>
										<div class="d-grid">
											<button class="btn btn-warning btn-block button more">더보기</button>
										</div>
									</li>
								</ul>
								<script type="text/javascript">
									//<![CDATA[ 
									$(function() {
										$(".setmenu > ul li:nth-child(1) .setmenu-layer").addClass("on");
										$(".setmenu > ul li:nth-child(1) .setmenu-button").addClass("on");
										$(".info dd button").click(function() {
											if ($(this).hasClass('on')) {
												$(this).removeClass("on");
											} else {
												$(this).addClass("on");
											}
										});
										$(".setmenu-button").click(
											function() {
												if ($(this).hasClass('on')) {
													$(".setmenu-layer").removeClass("on");
													$(".setmenu-button").removeClass("on");
												} else {
													$(".setmenu-layer").removeClass("on");
													$(".setmenu-button").removeClass("on");
												$(this).siblings(".setmenu-layer").addClass("on");
												$(this).addClass("on");
											}
										});
									})
								</script>
							</div>
							<div class="information">
								<a href="#">원산지 정보</a> <a href="#">알레르기 유발 정보</a>
							</div>
						</div>
						<div class="tab-box">
							<div class="review">
								<div class="stars">
									<div class="star-point">
										<div class="num">${store.scope}</div>
										<div class="star">
											<p class="${store.scope >= 1 ? 'on' : ''}">★</p>
											<p class="${store.scope >= 2 ? 'on' : ''}">★</p>
											<p class="${store.scope >= 3 ? 'on' : ''}">★</p>
											<p class="${store.scope >= 4 ? 'on' : ''}">★</p>
											<p class="${store.scope == 5 ? 'on' : ''}">★</p>
										</div>
									</div>
								</div>
								<div class="option">
									<div class="count">
										<span>리뷰<strong>${store.reviewNum}</strong>개
										</span> <span>사장님댓글<strong>${store.replyNum}</strong>개
										</span>
									</div>
								</div>
								<div class="list">
									<ul class="reviewList">
										<!-- 리뷰 -->
										
									</ul>
								</div>
							</div>
						</div>
						<div class="tab-box">
							<div class="info">
								<div class="desc">
									<div class="ttl">
										<img src="/resources/assets/images/icon_megaphone.png">
										<p>사장님알림</p>
									</div>
									<div class="txt">
										${store.notice}
									</div>
								</div>
								<div class="desc">
									<div class="ttl">
										<img src="/resources/assets/images/icon_market.png">
										<p>업체정보</p>
									</div>
									<div class="txt">
										<dl>
											<dt>영업시간</dt>
											<dd>${store.startTime} - ${store.endTime}</dd>
										</dl>
										<dl>
											<dt>전화번호</dt>
											<dd>${store.tel}</dd>
										</dl>
										<dl>
											<dt>주소</dt>
											<dd>${store.address}</dd>
										</dl>
									</div>
								</div>
								<div class="desc">
									<div class="ttl">
										<img src="/resources/assets/images/icon_payment.png">
										<p>결제정보</p>
									</div>
									<div class="txt">
										<dl>
											<dt>최소주문금액</dt>
											<dd>${store.minPrice}원</dd>
										</dl>
										<dl>
											<dt>결제수단</dt>
											<dd>신용카드 , 현금 , 요기서결제</dd>
										</dl>
									</div>
								</div>
								<div class="desc">
									<div class="ttl">
										<img src="/resources/assets/images/icon_business.png">
										<p>사업자정보</p>
									</div>
									<div class="txt">
										<dl>
											<dt>상호명</dt>
											<dd>${store.name}</dd>
										</dl>
										<dl>
											<dt>사업자등록번호</dt>
											<dd>  ${store.bno}</dd>
										</dl>
									</div>
								</div>
								<div class="desc">
									<div class="ttl">
										<img src="/resources/assets/images/icon_origin.png">
										<p>원산지정보</p>
									</div>
									<div class="txt">${store.originInfo}</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="order">
				<div class="title">장바구니</div>
				<div class="content">
					<div class="list">
						<div class="empty">주문표에 담긴 메뉴가 없습니다.</div>
					</div>
					<div class="info">
						<p>배달요금 ${store.delPrice}원 별도</p>
					</div>
				</div>
				<div class="button">
					<button type="submit" disabled>주문하기</button>
				</div>
			</div>
		</div>
	</div>
	<div id="modal-order" class="popup-layer">
		<!-- 메뉴 상세 부분 -->
		<div class="popup-box">
			<div class="popup-close">
				<i></i>
			</div>
			<div class="popup-title">메뉴상세</div>
			<div class="popup-cont">
				<div class="image menuImage">
					<img src="">
				</div>
				<div class="info">
					<!-- 메뉴이름 -->
					<div class="name"></div>
					<!-- 메뉴설명 -->
					<div class="text"></div>
				</div>
				<div class="price">
					<dl>
						<dt>가격</dt>
						<dd></dd>
					</dl>
				</div>
				<div class="option">
					<dl>
						<dt>
							옵션그룹이름
						</dt>
						<dd>
							<ul>
								<li>
									<!-- 옵션 체크박스 --> <label class="checkbox"> <input
										type="checkbox"> <i></i>
										<p>옵션1</p> <em>+ (옵션1가격)원</em>
								</label>
								</li>
								<li><label class="checkbox"> <input type="checkbox">
										<i></i>
										<p>옵션2</p> <em>+ (옵션2가격)원</em>
								</label></li>
							</ul>
						</dd>
					</dl>
				</div>
				<div class="quantity">
					<dl>
						<dt>수량</dt>
						<dd>
							<button type="button" class="quantity_minus" id="minus"></button>
							<span class="quantity_number" id="numberPlace">1</span>
							<button type="button" class="quantity_plus" id="plus"></button>
						</dd>
					</dl>
				</div>
				<div class="total">
					<dl>
						<dt>총 주문금액</dt>
						<dd><strong></strong><p>(최소주문금액 <span></span>원)</p></dd>
					</dl>
				</div>
			</div>
			<div class="mine-button">
				<div class="popup-button">
					<a href="#" class="btn btn_01">주문표에 추가</a> <a href="#"
						class="btn btn_02">주문하기</a>
				</div>
			</div>
		</div>
	</div>
	 <script type="text/javascript">
        //<![CDATA[ 
        $(function() {
            // 리뷰 관련 스크립트
            
            //전역으로 
            var sno = ${store.sno}
			var lastRno;
			var lastNo;
			var amount; // undefined
			
            // review String
            function getReviewStr(review) {
				var str = '';
				

				str += '<li>';
				if(review.rno == review.groupId) {
					str += '<div class="user">';
					str += '	<strong data-rno="' + review.rno + '">' + review.id + '</strong>';
					str += '	<p>' + review.regDate + '</p>';
					str += '</div>';
					str += '<div class="grade">';
					str += '	<div class="star">';
					str += '		<p class=' + (review.scope >= 1 ? "on" : "") + '>★</p>';
					str += '		<p class=' + (review.scope >= 2 ? "on" : "") + '>★</p>';
					str += '		<p class=' + (review.scope >= 3 ? "on" : "") + '>★</p>';
					str += '		<p class=' + (review.scope >= 4 ? "on" : "") + '>★</p>';
					str += '		<p class=' + (review.scope == 5 ? "on" : "") + '>★</p>';
					str += '		<p>' + review.scope + '</p>';
					str += '	</div>';
					str += '</div>';
					if(review.attachs.length) {
						str += "	<div class='img'>";
						str += "		<img src='" + review.attachs[0].origin + "'>";
						str += "	</div>";
					}
					str += '<div class="comment">' + review.content + '</div>';
				}
				else{
					str+= '<div class="answer">';
					str+= '	<div class="owner_user">';
					str+= '		<strong data-rno="' + review.rno + '">' + review.id + '</strong>';
					str+= '		<p>' + review.regDate + '</p>';
					str+= '	</div>';
					str += '<input type="hidden" value="' + review.rno + '">';
					str+= '	<div class="owner_comment">';
					str+= 		review.content;
					str+= '	</div>';
					str+= '</div>';
				}
				str += '</li>';

				return str;
			}

			function getMenuStr(menu) {
				var str = '';
				str += '<div class="desc" data-price="' + menu.price + '" data-info="' + (menu.info == null ? " " : menu.info) + '" data-name="' + menu.name + '" data-mno="' + menu.mno + '">';
				str += '	<div class="con">';
				str += '		<div class="ttl">' + menu.name + '</div>';
				str += '		<div class="txt">' + (menu.info == null ? " " : menu.info) + '</div>';
				str += '		<div class="pri">';
				str += '			<p class="price">' + menu.price + '원</p>';
				str += '		</div>';
				str += '	</div>';
				if(menu.attach) {
					str += '	<div class="img">';
					str += '		<img src="' + menu.attach.origin + '">';
					str += '	</div>';
				}
				str += '</div>';

				return str;
			}

            
            // 리뷰 목록 띄우기
            function showList(lastRno, amount) {
				console.log(lastRno, amount)
				var param = {sno: sno, lastRno: lastRno, amount: amount}
    			reviewService.getList(param, function(result) {
            		// console.log(result);
					var str = '';
					for(var i in result) {
						str += getReviewStr(result[i]);
					}
					$(".list ul.reviewList").html(str);
            	}, function(xhr) {
            		console.log(xhr);
            	})
    		}
			showList(lastRno, amount);
			
			// 무한스크롤 리뷰 더보기
			$(document).scroll(function() {
				var dh = $(document).height();
				var wh = $(window).height();
				var wst = $(window).scrollTop();
				if(dh == wh + wst) {
					var lastRno = $(".list ul li:last-child strong").data("rno");
					var param = {sno:sno, lastRno:lastRno};
					reviewService.getList(param, function(result) {
						var str = '';
						for(var i in result) {
							str += getReviewStr(result[i]);
						}
						$(".list ul.reviewList").append(str);
            		})
				}
			})
			
			
			// 메뉴 목록 띄우기
            function showMenuList(lastNo, amount) {
				var param = {sno: sno, lastNo: lastNo, amount: amount}
    			scrollService.getMenuList(param, function(result) {
					var str = '';
					for(var i in result) {
						str += getMenuStr(result[i]);
					}
					$(".setmenu-layer").html(str);
            	}, function(xhr) {
            		console.log(xhr);
            	})
    		}
			showMenuList(lastNo, amount);
			
			// 메뉴 더보기
			$(".more").on("click", function() {
				var lastNo = $(".desc:last-child").data("mno");
				var param = {sno:sno, lastNo:lastNo};
				scrollService.getMenuList(param, function(result) {
					var str = '';
					console.log(result)
					for(var i in result) {
						str += getMenuStr(result[i]);
					}
					$(".setmenu-layer").append(str);
				})
			})
			var price;
			// 메뉴 클릭시 이벤트(모달띄워야함)
			$(".setmenu-layer").on("click", ".desc", function() {
				var mno = $(this).data("mno");
				price = $(this).data("price");
				var name = $(this).data("name");
				var info = $(this).data("info");
				var minPrice = '${store.minPrice}';
				var img;
				if($(this).find("img").attr("src")) {
					img = $(this).find("img").attr("src");
					$("#modal-order .menuImage img").attr("src", img);
				}
				else {
					$("#modal-order .menuImage img").removeAttr("src")
				}

				$("#modal-order .info .name").get(0).innerHTML = name;
				$("#modal-order .info .text").get(0).innerHTML = info;
				$("#modal-order .price dd").get(0).innerHTML = price;
				$("#modal-order #numberPlace").get(0).innerHTML = 1;
				$("#modal-order .total dd strong").get(0).innerHTML = price;
				$("#modal-order .total dd span").get(0).innerHTML = minPrice;

                if ($('#modal-order').hasClass('active')){
                    $('#modal-order').removeClass("active");
                    $("html, body").css("overflow","initial");
                } else{
                    $('#modal-order').addClass("active");
                    $("html, body").css("overflow","hidden");
                }
				$("#modal-order .popup-close").click(function(){
					$("#modal-order").removeClass("active");
					$("html, body").css("overflow","initial");
				});
				$('#modal-order').on('click', function(e){
					if(!$('.popup-box').has(e.target).length){
						$("#modal-order").removeClass("active");
						$("html, body").css("overflow","initial");
					}
				});
			})

			var min = 1;
			var max = 50;
			$("#minus").on("click", function() {
				price = $("#modal-order .price dd").get(0).innerHTML;
				var num = $("#modal-order #numberPlace").get(0).innerHTML;
				if(num > min) {
					$("#modal-order #numberPlace").get(0).innerHTML = num - 1;
					$("#modal-order .total dd strong").get(0).innerHTML = parseInt(price) * parseInt(num-1);
				}
				if(num == min) {
					$("#numberPlace").css("color", "#e11414");
				}
				else {
					$("#numberPlace").css("color", "#000000");
				}


			})

			$("#plus").on("click", function() {
				price = $("#modal-order .price dd").get(0).innerHTML;
				var num = $("#modal-order #numberPlace").get(0).innerHTML;
				if(num < max) {
					$("#modal-order #numberPlace").get(0).innerHTML = parseInt(num) + 1;
					$("#modal-order .total dd strong").get(0).innerHTML = parseInt(price) * parseInt(parseInt(num)+1);
				}
				if(num == max) {
					$("#numberPlace").css("color", "#909090");
				}
				else {
					$("#numberPlace").css("color", "#0080FF");
				}


			})

        });
        //]]>
        </script>
		<div id="Image">
		<div class="img">
			<img src="">
		</div>
		<script>
            $(function() {
                $(document).ready(function() {
                    $('.review .list ul').on("click", "img", function() {
                        $('#Image').addClass("on");
                        $('html').css('overflow', 'hidden');
                    });
                    $('#Image .close, #Image .bg').click(function() {
                        $('#Image').removeClass("on");
                        $('html').css('overflow', 'auto');
                    });
                });
                $('.review .list ul').on("click", "img", function(){
                    var imgPath = $(this).attr("src");
                    $("#Image .img img").attr({src:imgPath});
                    return false;

                });
            });
            </script>
		<div class="bg"></div>
		<div class="close"></div>
	</div>
	</section>

	<jsp:include page="../common/footer.jsp"></jsp:include>


</body>
</html>
