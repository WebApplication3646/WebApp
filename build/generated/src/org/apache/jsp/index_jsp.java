package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("      \n");
      out.write("<head>\n");
      out.write("<title>Home Page</title>\n");
      out.write("<!-- Meta-Tags -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\" \" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //Meta-Tags -->\n");
      out.write("<link href=\"scss/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!--bootstrap-css-->\n");
      out.write("<link href=\"scss/font-awesome.css\" rel=\"stylesheet\"> <!--font-awesome-css-->\n");
      out.write("<link rel=\"stylesheet\" href=\"scss/flexslider.css\" type=\"text/css\" media=\"screen\" /><!--flexslider-css-->\n");
      out.write("<link href=\"scss/circles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!--skill-circles-->\n");
      out.write("<link href=\"scss/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!--style-sheet-->\n");
      out.write("<link href='scss/aos.css' rel='stylesheet prefetch' type=\"text/css\" media=\"all\" /><!--Animation-effects-css-->\n");
      out.write("<!--fonts-->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cabin:400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("<!--//fonts-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--banner start here-->\n");
      out.write("<div class=\"banner\" id=\"home\">\n");
      out.write("<div class=\"agileinfo-dot\">\n");
      out.write("   <div class=\"header\">\n");
      out.write("\t\t   <div class=\"header-main\">\n");
      out.write("\t\t\t <div class=\"header-top-agileits\">\n");
      out.write("\t\t   \t <div class=\"container\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<ul class=\"agile_forms\" data-aos=\"fade-left\">\n");
      out.write("\t\t\t\t\t<li><a class=\"active\" href=\"login.jsp\" data-toggle=\"modal\" data-target=\"#myModal2\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Login</a> </li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal3\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Register</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t   \t <div class=\"container\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h1><a  href=\"index.html\">Web Programming</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- navbar-header -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse cl-effect-13\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\" class=\"active scroll\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#about\" class=\"scroll\">About</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"w3ls_search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   </div>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t\t   <div class=\"banner-bottom\">\n");
      out.write("\t\t   \t   <section class=\"slider\">\n");
      out.write("\t\t\t\t <div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t  <li>\n");
      out.write("\t\t\t\t\t  \t<div class=\"banner-bottom-text\">\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>Hello World!!!</h3>\n");
      out.write("\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t \t</div>\n");
      out.write("\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t  <li>\n");
      out.write("\t\t\t\t\t  \t<div class=\"banner-bottom-text\">\n");
      out.write("\t\t\t\t\t  \t\t<h3>Is Good to Be A Programmer</h3>\n");
      out.write("\t\t\t\t\t \t</div>\n");
      out.write("\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t  <li>\n");
      out.write("\t\t\t\t\t  \t<div class=\"banner-bottom-text\">\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>CSC506 Web Programming</h3>\n");
      out.write("\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t \t</div>\n");
      out.write("\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t  <li>\n");
      out.write("\t\t\t\t\t  \t<div class=\"banner-bottom-text\">\n");
      out.write("                                                    <h3>Group Team <br> CSC/16D/4343</h3>\n");
      out.write("\t\t\t\t\t \t</div>\n");
      out.write("\t\t\t\t\t  </li>\t\t\t  \n");
      out.write("\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t      </section>\n");
      out.write("\t\t\t<div class=\"thim-click-to-bottom\">\n");
      out.write("\t\t\t\t<a href=\"#about\" class=\"scroll\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-chevron-down\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!--banner end here-->\n");
      out.write("\t<!-- Modal2 -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Modal content-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"signin-form profile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"agileinfo_sign\">Login</h3>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"LoginServlet\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"un\" placeholder=\"E-mail\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pw\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"login-social-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal3\" > Don't have an account?</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- //Modal2 -->\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Modal3 -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"myModal3\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Modal content-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"signin-form profile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"agileinfo_sign\">Register</h3>\n");
      out.write("                                                                                                                                        \n");
      out.write("  ");

        
 if(request.getParameter("submit") !=null){

Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/csc506database","root","");
Statement st=con.createStatement();
  String name = request.getParameter("name");
  String email = request.getParameter("email");
  String phone = request.getParameter("phone");
  String address = request.getParameter("address");
  String pasword = request.getParameter("password");
  
String strQuery = "SELECT COUNT(*) FROM registrationform where email='"+email+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
if(Countrow.equals("0")){
int i=st.executeUpdate("insert into registrationform(`name`, `email`, `phone`, `address`, `password`)values('"+name+"','"+email+"','"+phone+"','"+address+"','"+pasword+"')");
 
      out.write(" \n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("               alert(\"Successfully Registered!\");\n");
      out.write("       </script>\n");
      out.write("              \n");

  }

         
else{
 
      out.write(" \n");
      out.write("    <script>\n");
      out.write("               alert(\"User name or Email Incorrect !\");\n");
      out.write("       </script>\n");
     
}
         }

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("                                                                                                                                        \n");
      out.write("                                                                                                                                        \n");
      out.write("                                                                                                                                        \n");
      out.write("                                                                                                                                        \n");
      out.write("                                                                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <input type=\"text\" name=\"name\" placeholder=\"Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("                                                                                                                                                                        <input type=\"text\" name=\"phone\" placeholder=\"Phone Number\" required=\"\">\n");
      out.write("                                                                                                                                                                        <input type=\"text\" name=\"address\" placeholder=\"Address\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                                                                                        <input type=\"submit\" name=\"submit\" value=\"Register\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"#\"> By clicking register, I agree to your terms</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t<!-- //Modal3 -->\n");
      out.write("<!--banner bottom-->\n");
      out.write("<div class=\"banner-btm-w3layouts\" id=\"about\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<div class=\"tittle-agileinfo\">\n");
      out.write("\t\t<span>01</span>\n");
      out.write("\t\t<h2>Welcome To Web Programming Class</h2>\n");
      out.write("\t\t<p >The course code is CSC506</p>\n");
      out.write("\t</div>\n");
      out.write("\t\t<div class=\"about-main\">\n");
      out.write("\t\t<div class=\"col-md-4 about-grids\" data-aos=\"zoom-in\">\n");
      out.write("\t\t\t<i class=\"fa fa-bookmark-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t<h3 class=\"subheading-agileits-w3layouts\">The Course Information</h3>\n");
      out.write("\t\t\t<p class=\"para-agileits-w3layouts\">Scope of the Project\n");
      out.write("The focus of this study is to design an online integrated placement system for Mautech Secondary School which will go a long way in reducing the stress and cost of the manual system. \n");
      out.write("</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 about-grids\" data-aos=\"zoom-in\">\n");
      out.write("\t\t\t<i class=\"fa fa-money\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t<h3 class=\"subheading-agileits-w3layouts\">The First Assignment</h3>\n");
      out.write("\t\t\t<p class=\"para-agileits-w3layouts\">The study is going to cover the conduct of Junior School Certificate Examination (JSCE) placement exercise conducted annually in Junior Secondary Schools.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 about-grids\" data-aos=\"zoom-in\">\n");
      out.write("\t\t\t<i class=\"fa fa-money\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t<h3 class=\"subheading-agileits-w3layouts\">The Second Assignment</h3>\n");
      out.write("\t\t\t<p class=\"para-agileits-w3layouts\">The significance of the study is to ease data capturing of all Junior Secondary three (JS III) students before the commencement of Junior School Certificate Examination (JSCE) exams, provide a quick and accurate grading of their performance after the </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!-- //contact -->\n");
      out.write("\n");
      out.write("<!-- js -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("<!--search-bar-->\n");
      out.write("\t\t<script src=\"js/main.js\"></script>\t\n");
      out.write("<!--//search-bar-->\n");
      out.write("<!-- FlexSlider -->\n");
      out.write("\t\t\t\t  <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\t\t  <script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t$(function(){\t\t\t\t \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t$(window).load(function(){\n");
      out.write("\t\t\t\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\t\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\t\t\t\tstart: function(slider){\n");
      out.write("\t\t\t\t\t\t  $('body').removeClass('loading');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t  </script>\n");
      out.write("<!-- FlexSlider -->\n");
      out.write("<!-- clients-slider-script -->\n");
      out.write("\t\t\t\t<script src=\"js/slideshow.min.js\"></script>\n");
      out.write("\t\t\t\t<script src=\"js/launcher.js\"></script>\n");
      out.write("<!-- //clients-slider-script -->\n");
      out.write("<!-- /circle-->\n");
      out.write("\t <script type=\"text/javascript\" src=\"js/circles.js\"></script>\n");
      out.write("\t\t\t\t\t         <script>\n");
      out.write("\t\t\t\t\t\t\t\tvar colors = [\n");
      out.write("\t\t\t\t\t\t\t\t\t\t['#ffffff', '#fd9426'], ['#ffffff', '#fc3158'],['#ffffff', '#53d769'], ['#ffffff', '#147efb']\n");
      out.write("\t\t\t\t\t\t\t\t\t];\n");
      out.write("\t\t\t\t\t\t\t\tfor (var i = 1; i <= 7; i++) {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar child = document.getElementById('circles-' + i),\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpercentage = 30 + (i * 10);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tCircles.create({\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid:         child.id,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpercentage: percentage,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tradius:     80,\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth:      10,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnumber:   \tpercentage / 1,\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext:       '%',\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcolors:     colors[i - 1]\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t<!-- //circle -->\n");
      out.write("\t<!-- for-Map -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar menu_ul = $('.faq > li > ul'),\n");
      out.write("\t\t\t\t\t   menu_a  = $('.faq > li > a');\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tmenu_ul.hide();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tmenu_a.click(function(e) {\n");
      out.write("\t\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\tif(!$(this).hasClass('active')) {\n");
      out.write("\t\t\t\t\t\tmenu_a.removeClass('active');\n");
      out.write("\t\t\t\t\t\tmenu_ul.filter(':visible').slideUp('normal');\n");
      out.write("\t\t\t\t\t\t$(this).addClass('active').next().stop(true,true).slideDown('normal');\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t$(this).removeClass('active');\n");
      out.write("\t\t\t\t\t\t$(this).next().stop(true,true).slideUp('normal');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("<!-- //for-Map -->\n");
      out.write("<script src=\"js/jzBox.js\"></script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<!-- smooth scrolling -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t/*\n");
      out.write("\t\t\tvar defaults = {\n");
      out.write("\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t};\n");
      out.write("\t\t*/\t\t\t\t\t\t\t\t\n");
      out.write("\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- Animation-effect -->\n");
      out.write("<script src='js/aos.js'></script>\n");
      out.write("<script src=\"js/aosindex.js\"></script>\n");
      out.write("<!-- //Animation-effect -->\n");
      out.write("\t<a href=\"#home\" class=\"scroll\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("<!-- //smooth scrolling -->\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
