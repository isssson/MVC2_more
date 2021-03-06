<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<title>모레-제안서</title>
<script type="text/javascript"
   src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript"
   src="https://service.iamport.kr/js/iamport.payment-1.1.5.js"></script>
</head>
<style>
section {
   width: 1200px;
   margin: 0px auto;
}

#profile, #profile2 {
   width: 90px;
   height: 90px;
}

#star {
   margin-top: 30px;
}

#star svg {
   color: rgb(255, 238, 0);
}

#cer {
   margin-top: 20px;
   margin-bottom: 30px;
}

.bg-soft-primary {
   background-color: rgba(25, 118, 222, 0.1);
}

.card {
   margin: 20px auto;
   border-radius: 5px;
   box-shadow: 1px 1px 3px 1px #bdbfc4;
}
.revMainContainer{
	background-image:url(https://d3cwtye3iv0eb9.cloudfront.net/media/images/part/1544382373866000/pc/origin.jpg);
	background-repeat:no-repeat;
	background-size:cover;
    height: 380px;
    width: 100%;
}
.revMainContainer .revMainTextBox{
    width: 100%;
    height: 400px;
    padding-right: 15px;
    padding-left: 15px;
    margin:0 auto;  
}
.revMainText{
    margin:0 auto;
    width: 550px;
    height: 400px;
    display: flex;
    flex-direction: column;
    justify-content: center;
}
.revMainText h1{
    height: 100px;
    font-size: 42px;
    font-weight: bold;
    color: white;
    text-align: center;
}
</style>
<body>
   <%@ include file="/WEB-INF/views/header.jsp"%>
   <div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					${dto.cate2} 레슨 제안서<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">레슨을 확인해보세요</span>
				</h1>	
			</div>
		</div>
	</div>
	<br>
	<br>
   <section>
      <div>
         <form name="fm" action="paymentsSuccess.do" method="POST">
            <input type="hidden" name="m_id" value="${m_dto.id}">
            <input type="hidden" name="e_id" value="${dto.id}"> 
            <input type="hidden" name="cost" value="${dto.cost}"> 
            <input type="hidden" name="s_idx" value="${dto.s_idx}">
            <input type="hidden" name="cate1" value="${dto.cate1}">
            <input type="hidden" name="cate2" value="${dto.cate2}">
         </form>

         <input type="hidden" name="name" value="${m_dto.name}"> 
         <input type="hidden" name="email" value="${m_dto.email}"> 
         <input type="hidden" name="tel" value="${m_dto.tel}"> 
         <input type="hidden" name="ename" value="${dto.name}">
         	
		<c:if test="${sessionScope.sessionStatus eq 1}">
         	<button id="payments_module" type="button" class="btn btn-outline-primary">레슨 결제하기</button>
        </c:if>
         <c:if test="${sessionScope.sessionId eq dto.id}">
            <a href="suggestUpdate.do?s_idx=${dto.s_idx}"><button>수정</button></a>
            <a href="suggestDelete.do?s_idx=${dto.s_idx}"><button>삭제</button></a>
         </c:if>
      </div>

      <div class="row-vh d-flex flex-row">
         <div class="row-vh d-flex flex-row">
            <div style="width: 370px; height: auto; overflow: hidden;">
               <div class="card mb-3 p-4 shadow-sm" style="width: 100%">
                  <div class="d-flex align-items-top mb-3">
                     <c:if test="${dto.pic_path == null}">
                        <div style="margin-right: 20px;">
                           <img
                              src="https://d3cwtye3iv0eb9.cloudfront.net/media/images/defaults/useridentity/thumb.webp"
                              id="profile" class="rounded u-lg-avatar">
                        </div>
                     </c:if>
                     <c:if test="${dto.pic_path != null}">
                        <div style="margin-right: 20px;">
                           <img src="resources/img/${dto.pic_path}" id="profile2">
                        </div>
                     </c:if>
                     <div>
                        <p class="text-dark mb-3 h5">${dto.name}</p>
                        <p class="m-0 font-subhead">${dto.addr}</p>
                        <p>${dto.tel}</p>
                     </div>
                  </div>
                  <div style="text-align: center;">
                     <a href="expertProfile.do?id=${dto.id}"
                        class="btn px-2 py-1 rounded font-footnote border text-secondary font-weight-normal">
                        <span class="text-primary" style="font-size: 14px;">
                           프로필 보러가기 </span>
                     </a>
                  </div>
                  <div id="star">
                     <i class="fas fa-star fa-1x"></i>(0개 리뷰)
                  </div>
                  <div class="text mb-5 mt-3">
                     <div class="card-text mb-2">
                        <b>전문가 ${dto.name}님의 기본정보</b>
                     </div>
                     <div class="card-text mb-2">
                        <i class="fas fa-school"></i> 대학교: ${dto2.univ}
                     </div>
                     <div class="card-text mb-2">
                        <i class="fas fa-graduation-cap"></i> 학과: ${dto2.major}
                     </div>
                     <div class="card-text mb-2">
                        <i class="fab fa-algolia"></i> 경력: ${dto2.career}
                     </div>
                     <div class="card-text mb-2">
                        <i class="fas fa-certificate"></i> 자격증: ${dto2.cer}
                     </div>
                  </div>
                  <div>
                     <img
                        src="https://d3cwtye3iv0eb9.cloudfront.net/static/images/base/icons/ic_client_info.svg"
                        width="24" alt="" class="mr-1"> <span
                        class="font-subhead text-secondary">전문가 ${dto.name}님의
                        한줄소개</span>
                     <p
                        class="font-subhead p-3 bg-soft-primary rounded mt-1 mb-0 text-dark font-weight-normal">
                        ${dto2.intro}</p>
                  </div>
               </div>
            </div>
            <div style="width: 650px; margin-left: 100px;">
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 시작일은 언제인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${fn:substring(dto.start_date,0,10)}</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 종료일은 언제인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${fn:substring(dto.end_date,0,10)}</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 가능한 요일은 무슨
                     요일인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.day}입니다.</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 시작 시간은
                     몇시인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.start_time}시입니다.</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 종료 시간은
                     몇시인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.end_time}시입니다.</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨 비용은 얼마인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.cost}만원입니다.</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">전문가님이 제공하는 레슨
                     장소가 있다면 어디인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.ls_location}</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨은 어떤 방식인가요?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.process}</p>
                     </div>
                  </div>
               </div>
               <div class="card mb-5">
                  <div class="card-header mb-2 text-muted p-3">레슨관련 요구사항이
                     있습니까?</div>
                  <div class="card-body py-0">
                     <div class="my-3">
                        <p class="card-text mb-3">${dto.s_intro}</p>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </section>
   <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
<script>
   $("#payments_module").click(function() {
      var cost = document.querySelector('input[name="cost"]').value;
      var userEmail = document.querySelector('input[name="email"]').value;
      var userTel = document.querySelector('input[name="tel"]').value;
      var expertId = document.querySelector('input[name="e_id"]').value;
      var userName = document.querySelector('input[name="name"]').value;
      var expertName = document.querySelector('input[name="ename"]').value;
      var cate2 = document.querySelector('input[name="cate2"]').value;
      var clientId = document.querySelector('input[name="m_id"]').value;
      var IMP = window.IMP;
      IMP.init('imp59329395');
      IMP.request_pay({
         pg : 'inicis',
         merchant_uid : expertId + new Date().getTime(),
         name : 'MORE: ' + cate2 + '(' + expertName + ')',
         amount : cost * 100,
         buyer_email : userEmail,
         buyer_name : userName,
         buyer_tel : userTel
      }, function(rsp) {
         if (rsp.success) {
            var msg = '결제가 완료되었습니다.';
            document.fm.submit();
         } else {
            var msg = '결제에 실패하였습니다.';
            msg += '실패사유 : ' + rsp.error_msg;
         }
         alert(msg);
      });
   });
</script>
</html>