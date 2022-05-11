<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html lang="ko">
   	<head>
		<!-- <meta name="google-signin-client_id" content="347160871077-577pujh4td24j5iv9dog5kp903esu6rh.apps.googleusercontent.com"> -->
    	<jsp:include page="../common/head.jsp"></jsp:include>
      
   </head>
   <!-- body -->
   <body class="main-layout">
     <jsp:include page="../common/nav.jsp"></jsp:include>
      <!-- loader  -->
    <!--   <div class="loader_bg">
         <div class="loader"><img src="/resources/assets/images/loading.gif" alt="#" /></div>
      </div> -->
      <!-- end loader -->
 
      <!-- banner -->
      <section class="banner_main">
         <div class="container">
	        <div class="row d_flex ">
	        <div class="col-md-6">
               <div class="text-bg">
                  <h1>저기압일땐<br>
					  고기앞으로<br>
					  가기위해 -></h1>
                  <h3>★ 집밥귱선생님의 오마카세 ㅎㅅㅎ ★</h3>
               </div>
            </div>
	            <div class="col-md-6" style="margin-top: 100px;">
	               <form id="request" class="main_form align-items-center " method="post" name="frm">
	                  <div class="row input-group">
	                     <div class="col-md-12 ">
							<span id="idError"></span>
	                        <input class="contactus check" placeholder="아이디" type="text" id="id" name="id">
	                     </div>
	                     <div class="col-md-12 list">
							<span id="pwError"></span>
	                        <input class="contactus check" placeholder="비밀번호" id="pw" type="password" name="password">
	                     </div>
	                     <div class="col-md-12 list">
							<span id="pwCheckError"></span>
	                        <input class="contactus check" placeholder="비밀번호 확인" type="password" id="pwCheck" name="password2">
	                     </div>
	                     <div class="col-md-12 list">
							<span id="nameError"></span>
	                        <input class="contactus check" placeholder="이름" type="text" name="name" id="name">
	                     </div>
	                     <div class="col-md-12 list">
							<span id="phoneNumError"></span>
	                        <input class="contactus check" placeholder="전화번호" type="text" name="tel" id="phoneNum">
	                     </div>
	                     <div class="col-md-12 list">
							<span id="emailError"></span>
	                        <input class="contactus check" placeholder="이메일" type="email" name="email" id="email">
	                     </div>
	                     <div class="col-md-12 ">
	                        <input class="contactus" placeholder="닉네임" type="text" name="nickName">
	                     </div>
	                     <div class="col-md-12 ">
	                        <input class="contactus" placeholder="사장이름" type="text" name="bossName">
	                     </div>
						
						<sec:csrfInput/>
	                    <div class="col-sm-12">
	                        <button class="send_btn" id="send_btn">회원가입</button>
	                    </div>
	                 </div>
	              </form>
	           </div>
	        </div>
         </div>
      </section>
      <!-- end banner -->

      <!--  footer -->
      <footer>
         <jsp:include page="../common/footer.jsp"/>
      </footer>
      <!-- end footer -->
      
      <script>
		// function validate() {
		// 	var re = /^[a-zA-Z0-9]{4,12}$/ // 아이디와 패스워드가 적합한지 검사할 정규식
		// 	var re2 = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
			
		// 	var id = document.getElementById("id");
		// 	var pw = document.getElementById("pw");
		// 	var elail = document.getElementById("email");
				
		// 	// 아이디 유효성
		// 	if(!check(re, id, "아이디는 4~12자의 영문 대소문자와 숫자로만 입력")) {
		// 		return false;
		// 	}
		// 	// 비밀번호 유효성
		// 	if(!check(re, pw, "비밀번호는 4~12자의 영문 대소문자와 숫자로만 입력")) {
		// 		return false;
		// 	}
			
		// 	if(frm.pw.value != frm.checkpw.value) {
		// 		alert("비밀번호가 다릅니다.")
		// 		frm.checkpw.value = "";
		// 		frm.checkpw.focus();
		// 		return false;
		// 	}

		// 	if(frm.name.value=="") {
		// 		alert("이름을 입력해주세요!");
		// 		frm.name.focus();
		// 		return false;
		// 	}

		// 	if(frm.tel.value=="") {
		// 		alert("전화번호를 입력해주세요!");
		// 		frm.tel.focus();
		// 		return false;
		// 	}

		// 	if(frm.nickName.value="") {
		// 		alert("닉네임을 입력해주세요!");
		// 		frm.nickName.focus();
		// 		return false;
		// 	}
			
		// 	function check(re, what, message) {
		// 		if(re.test(what.value)) {
		// 			return true;
		// 		}
		// 		alert(message);
		// 		what.value = "";
		// 		what.focus();
		// 		//return false;
		// 	}
		// 	alert("회원가입이 완료되었습니다.")
		// }

		// $('.id_input').on("propertychange change keyup paste input", function(){
		// 	// console.log("keyup 테스트");	
		// 	var memberId = $('.id_input').val();
		// 	var data = {id : id}
		// 	$.ajax({
		// 		type: "post",
		// 		url: "/member/memberIdchk",
		// 		data: data,
		// 		success: function(result) {
		// 			/* console.log("성공" + + result); */
		// 			if(result != 'fail') {
		// 				$('.id_input_re_1').css("display", "inline-block");
		// 				$('.id_input_re_2').css("display", "none");
		// 			} else {
		// 				$('.id_input_re_2').css("display", "inline-blick");
		// 				$('.id_input_re_1').css("display", "none");
		// 			}
		// 		}
		// 	});
		// });

		window.onload = function() {
			var frm = document.frm;
			var input = document.querySelectorAll('.check')

			var errorId = ["idError", "pwError", "pwCheckError", "nameError", "phoneNumError", "emailError"];
			var error = document.querySelectorAll('.list > span')

			function innerReset(error) {
				for(var i = 0; i < error.length; i++) {
					error[i].innerHTML = "";
				}
			}

			innerReset(error);

			// 아이디 입력문자 유효성검사
			frm.id.onkeydown = function() {
				innerReset(error);
				var idLimit = /^[a-zA-Z0-9-_]{5,20}$/; //정규식 5~20자 (a~z, A~Z, 0~9, -, _만 입력가능)
				if(!idLimit.test(input[0].value)) {
					document.getElementById(errorId[0]).innerHTML = "5~20자의 영문 소대문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.";
				}
			}

			// 비밀번호 입력문자 유효성검사
			frm.pw.onkeydown = function() {
				innerReset(error);
				var pwLimit = /^[a-zA-Z0-9~!@#$%^&*()_-]{10,20}$/; //정규식(a~z, A~Z, 0~9, ~!@#$%^&*()_- 만 입력가능)
				if(!pwLimit.test(input[1].value)) {
					document.getElementById(errorId[1]).innerHTML = "10~20자의 영문 소대문자, 숫자와 특수기호 '~!@#$%^&*()_-'만 사용 가능합니다.";
				}
			}

			// 비밀번호 확인 입력문자 유효성검사
			frm.pwCheck.onkeydown = function() {
				innerReset(error);
			}

			// 휴대번호 입력문자 유효성검사
			frm.phoneNum.onkeydown = function() {
				innerReset(error);
				var pnumLimit = /01[016789]-[^0][0-9]{2,3}-[0-9]{3,4}/; // 정규식(^$--> 문자의미, 01, (6자리중 "1자리"), 0~9--> "8자리")
				if(!pnumLimit.test(input[4].value)) {
					document.getElementById(errorId[4]).innerHTML = "올바른 형식이 아닙니다. 다시 확인해주세요.";
				}
			}

			frm.email.onkeydown = function() {
				innerReset(error);
				var emailLimit = /[0-9a-zA-Z-@_.]/; // 정규식 0~9, a~z, A~Z, -, _, .내에서만 입력가능
				if(!emailLimit.test(input[5].value)) {
					document.getElementById(errorId[5]).innerHTML = "올바른 형식이 아닙니다. 영문, 숫자, (-)(_)(.) 입력만 가능합니다.";
				}
			}

			frm.onsubmit = function() {
				var errorStr = [" 아이디를", " 비밀번호를", " 비밀번호 확인을", " 성함을", " 휴대폰번호를", " 이메일을"];
				innerReset(error);

				for(var i = 0; i < input.length - 1; i++) {
					if(!input[i].value) {
						document.getElementById(errorId[i]).innerHTML = errorStr[i] + " 입력해 주세요.";
						input[i].focus();
						return false;
					}
				}
				if(frm.pw.value != frm.pwCheck.value) {
					document.getElementById("pwCheckError").innerHTML = "비밀번호가 일치하지 않습니다.";
					frm.pwCheck.focus();
					return false;
				}

				var idLimit = /^[a-zA-Z0-9-_]{5,20}$/; //정규식(a~z, A~Z, 0~9, -, _만 입력가능)
				var pwLimit = /^[a-zA-Z0-9~!@#$%^&*()_-]{10,20}$/;///[a-zA-Z0-9]{10, 20}/; //정규식(a~z, A~Z, 0~9,~!@#$%^&*()_-특수문자 만 입력가능)
				var pnumLimit = /01[016789]-[^0][0-9]{2,3}-[0-9]{3,4}/; // 01로 시작, 0,1,6,7,8,9 중 한자리, 0~9에서 8자리 입력
				var emailLimit = /[0-9a-zA-Z-_.]/; // 정규식 0~9, a~z, A~Z, -, _, .내에서만 입력가능

				if(!idLimit.test(input[0].value)) {
					document.getElementById(errorId[0]).innerHTML = "5~20자의 영문 소대문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.";
					console.log(input[0].value);
					frm.id.focus();
					return false;
				}

				if(!pwLimit.test(input[1].value)) {
					document.getElementById(errorId[1]).innerHTML = "10~20자의 영문 소대문자, 숫자와 특수기호 '~!@#$%^&*()_-'만 사용 가능합니다.";
					console.log(input[1].value);
					frm.pw.focus();
					return false;
				}

				if(!pnumLimit.test(input[4].value)) {
					document.getElementById(errorId[4]).innerHTML = "올바른 형식이 아닙니다. 다시 확인해주세요.";
					console.log(input[4].value);
					frm.phoneNum.focus();
					return false;
				}
				
				if(!emailLimit.test(input[5].value)) {
					document.getElementById(errorId[5]).innerHTML = "올바른 형식이 아닙니다. 영문, 숫자, (-)(_)(.) 입력만 가능합니다.";
					console.log(input[5].value);
					frm.email.focus();
					return false;
				}
				alert("회원가입이 완료되었습니다! :D")
			}

		} 
      </script>
   	
		
   </body>
</html>



