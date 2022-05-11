<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../views/common/head.jsp"/>
	<link rel="stylesheet" href="/resources/assets/css/demo.css" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300|Prata' rel='stylesheet' type='text/css' />
	<script type="text/javascript" src="/resources/assets/js/modernizr.custom.26887.js"></script> 
</head>
	<body class="spinPanel">
		<jsp:include page="../views/common/nav.jsp"></jsp:include>
        <div class="containers">
			
			<div style="margin: 50px; text-align: center;">
				<div style="margin: 30px; font-size: 50px;">
					<a href="index"><strong>오늘 뭐 먹조 <span class="text-primary">?</span></strong></a>
				</div>
			</div>
			<div class="main">
			
				<div class="fs-slider" id="fs-slider">
					
					
					<figure>
						<img src="/resources/assets/images/chicken.jpg" alt="image01" />
						<a href="/store/list/1">
							<figcaption>
								<h3>치킨</h3>
								<p>American apparel flexitarian put a bird on it, mixtape typewriter irony aesthetic. </p>
							</figcaption>
						</a>
					</figure>
					
					<figure>
						<img src="/resources/assets/images/pizza.jpg" alt="image02" />
						<a href="/store/list/2">
							<figcaption>
								<h3>양식</h3>
								<p>Cardigan craft beer mixtape, skateboard forage fixie truffaut messenger bag. </p>
							</figcaption>
						</a>
					</figure>
					
					<figure>
						<img src="/resources/assets/images/chinese.jpg" alt="image03" />
						<a href="/store/list/3">
							<figcaption>
								<h3>중식</h3>
								<p>Truffaut iphone flexitarian, banh mi thundercats cliche wolf biodiesel gastropub. </p>
							</figcaption>
						</a>
					</figure>
					
					<figure>
						<img src="/resources/assets/images/bibimbap.jpg" alt="image04" />
						<a href="/store/list/4">
							<figcaption>
								<h3>한식</h3>
								<p>Scenester fixie pickled, shoreditch fugiat enim craft beer retro mustache.</p>
							</figcaption>
						</a>
					</figure>
					
					<figure>
						<img src="/resources/assets/images/sushi.jpg" alt="image05" />
						<a href="/store/list/5">
							<figcaption>
								<h3>일식</h3>
								<p>Aute sunt aliqua do sapiente. Food truck ut sustainable thundercats four loko.</p>
							</figcaption>
						</a>
					</figure>

					<figure>
						<img src="/resources/assets/images/bossam.jpg" alt="image06" />
						<a href="/store/list/6">
							<figcaption>
								<h3>족발/보쌈</h3>
								<p>길어야해요오오오오오오오오오오오오오오오오오오오오</p>
							</figcaption>
						</a>
					</figure>
					
				</div><!-- /fs-slider -->
			
			</div>
			
        </div>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script src="/resources/assets/js/jquery.imgslider.js"></script>
		<script>
			$(function() {
				$( '#fs-slider' ).imgslider();
			});
		</script>
	</body>
</html>