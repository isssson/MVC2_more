/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-13 02:17:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1639222609376L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1637128896000L));
    _jspx_dependants.put("jar:file:/C:/김성현/final/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/more/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1635483090484L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("  main {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  }\r\n");
      out.write("  a {\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("  }\r\n");
      out.write("  li {\r\n");
      out.write("      list-style: none;\r\n");
      out.write("  }\r\n");
      out.write("  .u-lg-avatar {\r\n");
      out.write("     width: 10rem;\r\n");
      out.write("     height: 10rem;\r\n");
      out.write("  }  \r\n");
      out.write("  .btn-outline-primary{\r\n");
      out.write("	color: #ff9797;\r\n");
      out.write("	border-color: #ff9797;\r\n");
      out.write("}\r\n");
      out.write(".btn-outline-primary:hover{\r\n");
      out.write("	background-color: #ff9797;\r\n");
      out.write("	border-color: #ff9797;\r\n");
      out.write("	color:white;\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("</style>\r\n");
      out.write("<title>모레-설정</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v5.2.0/js/all.js\"></script>\r\n");
      out.write("<link href=\"resources/css/header.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- ---------------------비회원  -->\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!----------------------기본(의뢰인) 로그인중-->\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- -----------------------전문가 로그인중 -->\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   <script>   \r\n");
      out.write("       function show(){\r\n");
      out.write("         document.getElementById('hiddenHeaderContainer').style.display='block';\r\n");
      out.write("       }\r\n");
      out.write("       function hide(){\r\n");
      out.write("         document.getElementById('hiddenHeaderContainer').style.display='none';\r\n");
      out.write("       } \r\n");
      out.write("  </script> ");
      out.write("\r\n");
      out.write("<main id=\"content\" role=\"main\">\r\n");
      out.write("  <div class=\"container space-1 mb-4\" style=\"padding-top: 2rem !important;\">\r\n");
      out.write("    <div class=\"row justify-content-center\">\r\n");
      out.write("      <div class=\"col-lg-5 mb-5 mb-lg-0\">\r\n");
      out.write("        <div class=\"card shadow-sm p-5 mb-2\">\r\n");
      out.write("          <div class=\"text-center\">\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <img class=\"u-lg-avatar rounded-circle\" src=\"resources/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pic_path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"name-field text-center mt-3 mb-2\">\r\n");
      out.write("              <p class=\"name-field m-0 text-dark\">\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card shadow-sm p-5 mb-2\">\r\n");
      out.write("          <div>\r\n");
      out.write("            <h6 class=\"font-subhead mb-5 font-weight-medium\">일반 설정</h6>\r\n");
      out.write("            <ul class=\"m-0\">\r\n");
      out.write("              <li class=\"mb-3\">\r\n");
      out.write("                <a href=\"account.do\" class=\"text-secondary d-flex align-items-center\" name=\"나의 계정\">\r\n");
      out.write("                  <i></i>\r\n");
      out.write("                  <p class=\"m-0 col-11 p-0 font-subhead\">계정 설정</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card shadow-sm p-5 only-desktop-visible\">\r\n");
      out.write("          <a class=\"font-subhead text-gray\" href=\"logout.do\">로그아웃</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<link href=\"resources/css/footer.css\" rel=\"stylesheet\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <footer class=\"py-3 my-4\">\r\n");
      out.write("    <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Home</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Features</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">Pricing</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">FAQs</a></li>\r\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-muted\">About</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <p class=\"text-center text-muted\">&copy; 2021 Company, Inc</p>\r\n");
      out.write("  </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"b-example-divider\"></div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/header.jsp(7,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("    <div id=\"headerContainer\">\r\n");
          out.write("        <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("        <div id=\"menubar\">\r\n");
          out.write("          <div id=\"leftMenu\">\r\n");
          out.write("            <div><a href=\"regist1.do\">전문가 등록하기</a></div>\r\n");
          out.write("            <div><a href=\"lessonList.do\">수업 요청하기</a></div>\r\n");
          out.write("            <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("            <div><a href=\"reviewList.do\">후기 게시판</a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div id=\"rightMenu\">\r\n");
          out.write("               <div><a href=\"login.do\">로그인</a></div>\r\n");
          out.write("               <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("	</header>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/header.jsp(27,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("     <div id=\"headerContainer\">\r\n");
          out.write("        <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("        <div id=\"menubar\">\r\n");
          out.write("          <div id=\"leftMenu\">\r\n");
          out.write("            <div id=\"client\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("               <a href=\"#\">레슨</a>\r\n");
          out.write("              </div>\r\n");
          out.write("            <div id=\"joinExpert\">\r\n");
          out.write("               <a href=\"regist1.do\">전문가 등록하기</a>\r\n");
          out.write("             </div>\r\n");
          out.write("            <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("            <div><a href=\"reviewList.do\">후기 게시판</a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div id=\"rightMenu\">\r\n");
          out.write("            <div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</div>\r\n");
          out.write("            <div><a href=\"setting.do\"><i class=\"far fa-user fa-1x\"></i></a></div>\r\n");
          out.write("            <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("      <div id=\"hiddenHeaderContainer\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("        <div class=\"hiddenItem\">\r\n");
          out.write("          <div class=\"Item\"><a href=\"suggestList.do\">레슨 목록</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"lessonList.do\">레슨 요청하기</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"sentRequest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">보낸 요청</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"receiveSuggest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">받은 제안</a></div>\r\n");
          out.write("          <div class=\"Item\"><a href=\"m_documentList.do\">나의 레슨 내역</a></div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("	</header>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/header.jsp(61,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<header>\r\n");
          out.write("     <div id=\"headerContainer\">\r\n");
          out.write("       <a href=\"index.do\"><img src=\"resources/img/more_logo.jpg\" alt=\"logo\" style=\"padding: 10px\"></a>\r\n");
          out.write("       <div id=\"menubar\">\r\n");
          out.write("         <div id=\"leftMenu\">\r\n");
          out.write("           <div id=\"client\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("              <a href=\"#\">레슨</a>\r\n");
          out.write("             </div>\r\n");
          out.write("           <div><a href=\"bbsList.do\">자유 게시판</a></div>\r\n");
          out.write("           <div><a href=\"reviewList.do\">후기 게시판</a></div>\r\n");
          out.write("         </div>\r\n");
          out.write("         <div id=\"rightMenu\">\r\n");
          out.write("           <div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</div>\r\n");
          out.write("           <div><a href=\"setting.do\"><i class=\"far fa-user fa-1x\"></i></a></div>\r\n");
          out.write("		   <div><a href=\"noticeList.do\"><i class=\"far fa-question-circle\"></i></a></div>\r\n");
          out.write("         </div>\r\n");
          out.write("       </div>\r\n");
          out.write("     </div>\r\n");
          out.write("     <div id=\"hiddenHeaderContainer\" onmouseover=\"show()\" onmouseout=\"hide()\">\r\n");
          out.write("       <div class=\"hiddenItem\">\r\n");
          out.write("       	 <div class=\"Item\"><a href=\"requestList.do\">요청서 목록</a></div>\r\n");
          out.write("       	 <div class=\"Item\"><a href=\"suggest.do\">레슨 제안하기</a></div>\r\n");
          out.write("         <div class=\"Item\"><a href=\"sentsuggest.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">보낸 제안</a></div>\r\n");
          out.write("		 <div class=\"Item\"><a href=\"m_documentList.do\">나의 레슨 내역</a></div>\r\n");
          out.write("       </div>\r\n");
          out.write("     </div>\r\n");
          out.write("	</header>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/views/member/setting.jsp(53,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              <div class=\"my-3\">\r\n");
          out.write("                <button type=\"button\" class=\"p-1 btn btn-xs btn-outline-primary rounded-pill\">\r\n");
          out.write("                <span class=\"d-inline rounded-circle  py-1 px-2 font-subhead\">\r\n");
          out.write("                  <img src=\"\" class=\"mr-1 position-relative\" width=\"16\" style=\"top:-2px;\">\r\n");
          out.write("                  전문가\r\n");
          out.write("                </span>\r\n");
          out.write("              </button>\r\n");
          out.write("              </div>\r\n");
          out.write("              </div>\r\n");
          out.write("               <div class=\"align-content-center\">\r\n");
          out.write("             </div>\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /WEB-INF/views/member/setting.jsp(66,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              <div class=\"my-3\">\r\n");
          out.write("                <button type=\"button\" class=\"p-1 btn btn-xs btn-outline-primary rounded-pill\">\r\n");
          out.write("                <span class=\"d-inline rounded-circle  py-1 px-2 font-subhead\">\r\n");
          out.write("                  <img src=\"\" class=\"mr-1 position-relative\" width=\"16\" style=\"top:-2px;\">\r\n");
          out.write("                  의뢰인\r\n");
          out.write("                </span>\r\n");
          out.write("              </button>\r\n");
          out.write("              </div>\r\n");
          out.write("              </div>\r\n");
          out.write("               <div class=\"align-content-center\">\r\n");
          out.write("             </div>\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f5_reused = false;
    try {
      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f5.setParent(null);
      // /WEB-INF/views/member/setting.jsp(90,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionStatus == 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              <li class=\"mb-3\">\r\n");
          out.write("                <a href=\"expertProfile.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"\" class=\"text-secondary d-flex align-items-center\">\r\n");
          out.write("                  <i></i>\r\n");
          out.write("                  <p class=\"m-0 col-11 p-0 font-subhead\">전문가 프로필 설정</p>\r\n");
          out.write("                </a>\r\n");
          out.write("              </li>\r\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      _jspx_th_c_005fif_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f5, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f5_reused);
    }
    return false;
  }
}
