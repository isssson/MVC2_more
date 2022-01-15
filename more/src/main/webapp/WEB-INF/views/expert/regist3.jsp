<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		location.href = 'wrong.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist3.css" rel="stylesheet">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<title>모레-전문가등록</title>
</head>
<body onload="execDaumPostcode()">
<%@ include file="/WEB-INF/views/header.jsp" %>
    <div id="section" class="bg-white">
        <form action="regist4.do?cate1=${dto.cate1 }&cate2=${dto.cate2}" id="regist3" method="POST">
          <div class="container">
            <div class="content">
              <h4 class="text-center">주소</h4>
              <div class="service-choice-box">
                <input type="hidden" class="col-sm-3 form-label" name="" id="postcode" placeholder="우편번호" style="border-radius: 0.25rem; border: 1px solid #ced4da;">
                <input type="hidden" class="form-control" name="ls_location" id="address" placeholder="주소" style="margin-bottom: 5px">
                <input type="hidden" class="form-control" name="" id="detailAddress" placeholder="상세주소">
                <input type="hidden" class="" id="extraAddress" placeholder="참고항목">
                <div id="wrap" style="display:none;width:500px;height:300px;margin:5px 0;position:relative"></div>
              </div>
            </div>
          </div>
          <div class="container-fluid bg-eee">
            <div class="container step-nav">
              <div class="row">
                <div class="col-xs-6">
                  <a href="" class="prev-btn" id="prev-btn">
                    뒤로 가기
                  </a>
                </div>
                <div class="col-xs-6">
                  <button type="submit" class="blue-btn form-control" id="next-btn" style="background-color: #ff9797; border-color: #ff9797;">다음</button>
                </div>
              </div>
            </div>
          </div>
        </form>
      </div>
      <script>
        // 우편번호 찾기 찾기 화면을 넣을 element
        let element_wrap = document.getElementById('wrap');
        
        function foldDaumPostcode() {
            // iframe을 넣은 element를 안보이게 한다.
            element_wrap.style.display = 'none';
        }
        
        function execDaumPostcode() {
          console.log('들어옴');
            // 현재 scroll 위치를 저장해놓는다.
            let currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
            new daum.Postcode({
                oncomplete: function(data) {
                    // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
        
                    // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                    // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                    let addr = ''; // 주소 변수
                    let extraAddr = ''; // 참고항목 변수
                    console.log('들어옴1');
                    //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                    if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                        addr = data.roadAddress;
                    } else { // 사용자가 지번 주소를 선택했을 경우(J)
                        addr = data.jibunAddress;
                    }
        
                    // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                    if(data.userSelectedType === 'R'){
                        // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                        // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                        if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                            extraAddr += data.bname;
                        }
                        // 건물명이 있고, 공동주택일 경우 추가한다.
                        if(data.buildingName !== '' && data.apartment === 'Y'){
                            extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                        }
                        // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                        if(extraAddr !== ''){
                            extraAddr = ' (' + extraAddr + ')';
                        }
                        // 조합된 참고항목을 해당 필드에 넣는다.
                        document.getElementById("extraAddress").value = extraAddr;
                    
                    } else {
                        document.getElementById("extraAddress").value = '';
                    }
        
                    // 우편번호와 주소 정보를 해당 필드에 넣는다.
                    document.getElementById('postcode').value = data.zonecode;
                    document.getElementById("address").value = addr;
                    // 커서를 상세주소 필드로 이동한다.
                    document.getElementById("detailAddress").focus();
        
                    // iframe을 넣은 element를 안보이게 한다.
                    // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
                    element_wrap.style.display = 'none';
        
                    // 우편번호 찾기 화면이 보이기 이전으로 scroll 위치를 되돌린다.
                    document.body.scrollTop = currentScroll;
                    document.getElementById('regist3').submit();
                },
                // 우편번호 찾기 화면 크기가 조정되었을때 실행할 코드를 작성하는 부분. iframe을 넣은 element의 높이값을 조정한다.
                onresize : function(size) {
                    element_wrap.style.height = size.height+'px';
                },
                width : '100%',
                height : '100%'
            }).embed(element_wrap);
        
            // iframe을 넣은 element를 보이게 한다.
            element_wrap.style.display = 'block';
        }
      </script>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>