
<!DOCTYPE html>
<html lang="zxx">
      <%@page import="java.sql.*" %>
<head>
<title>Home Page</title>
<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content=" " />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Meta-Tags -->
<link href="scss/bootstrap.css" rel="stylesheet" type="text/css" media="all" /><!--bootstrap-css-->
<link href="scss/font-awesome.css" rel="stylesheet"> <!--font-awesome-css-->
<link rel="stylesheet" href="scss/flexslider.css" type="text/css" media="screen" /><!--flexslider-css-->
<link href="scss/circles.css" rel="stylesheet" type="text/css" media="all" /><!--skill-circles-->
<link href="scss/style.css" rel="stylesheet" type="text/css" media="all" /><!--style-sheet-->
<link href='scss/aos.css' rel='stylesheet prefetch' type="text/css" media="all" /><!--Animation-effects-css-->
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Cabin:400,500,600,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!--//fonts-->

</head>
<body>
<!--banner start here-->
<div class="banner" id="home">
<div class="agileinfo-dot">
   <div class="header">
		   <div class="header-main">
			 <div class="header-top-agileits">
		   	 <div class="container">
				
				<ul class="agile_forms" data-aos="fade-left">
					<li><a class="active" href="login.jsp" data-toggle="modal" data-target="#myModal2"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a> </li>
					<li><a href="#" data-toggle="modal" data-target="#myModal3"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Register</a> </li>
				</ul>
				<div class="clearfix"> </div>
				</div>
			</div>
		   	 <div class="container">
			<nav class="navbar navbar-default">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a  href="index.html">Web Programming</a></h1>
					</div>
					<!-- navbar-header -->
					<div class="collapse navbar-collapse cl-effect-13" id="bs-example-navbar-collapse-1">

						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.html" class="active scroll">Home</a></li>
							<li><a href="#about" class="scroll">About</a></li>
						</ul>

					</div>

					<div class="w3ls_search">
													
												
												</div>
					

					<div class="clearfix"> </div>	
				</nav>
		   </div>
		   </div>
<div class="container">
		   <div class="banner-bottom">
		   	   <section class="slider">
				 <div class="flexslider">
					<ul class="slides">
					  <li>
					  	<div class="banner-bottom-text">
					  			<h3>Hello World!!!</h3>
						  
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
					  		<h3>Is Good to Be A Programmer</h3>
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
					  			<h3>CSC506 Web Programming</h3>
						  
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
                                                    <h3>Group Team  </h3>
                                                    <h3>CSC/16D/4334</h3> <br>
                                                     <h3>CSC/16D/4328</h3> <br>
                                                     <h3>CSC/16D/4320</h3> <br>
                                                     <h3>CSC/15D/5220</h3> <br>
                                                     <h3>CS/14/3646</h3> <br>
                                                    
					 	</div>
					  </li>			  
				    </ul>
				 </div>
				 <div class="clearfix"> </div>
		      </section>
			<div class="thim-click-to-bottom">
				<a href="#about" class="scroll">
					<i class="fa fa-chevron-down" aria-hidden="true"></i>
				</a>
			</div>
			
		   </div>
		</div>
	</div>
</div>
</div>
<!--banner end here-->
	<!-- Modal2 -->
		<div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
														<div class="modal-dialog">
														<!-- Modal content-->
															<div class="modal-content">
																<div class="modal-header">
																	<button type="button" class="close" data-dismiss="modal">&times;</button>
																	
																	<div class="signin-form profile">
																	<h3 class="agileinfo_sign">Login</h3>	
																			<div class="login-form">
																				<form action="LoginServlet" >
																					<input type="email" name="un" placeholder="E-mail" required="">
																					<input type="password" name="pw" placeholder="Password" required="">
																					<div class="tp">
																						<input type="submit" name="submit" value="Login">
																					</div>
																				</form>
																			</div>
																			<div class="login-social-grids">
																				
																			</div>
																			<p><a href="#" data-toggle="modal" data-target="#myModal3" > Don't have an account?</a></p>
																		</div>
																</div>
															</div>
														</div>
													</div>
													<!-- //Modal2 -->	
													<!-- Modal3 -->
													<div class="modal fade" id="myModal3" tabindex="-1" role="dialog">
														<div class="modal-dialog">
														<!-- Modal content-->
															<div class="modal-content">
																<div class="modal-header">
																	<button type="button" class="close" data-dismiss="modal">&times;</button>
																	
																	<div class="signin-form profile">
																	<h3 class="agileinfo_sign">Register</h3>
                                                                                                                                        
  <%
        
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
 %> 

  <script>
               alert("Successfully Registered!");
       </script>
              
<%
  }

         
else{
 %> 
    <script>
               alert("User name or Email Incorrect !");
       </script>
<%     
}
         }
%>
    
    

                                                                                                                                        
                                                                                                                                        
                                                                                                                                        
                                                                                                                                        
                                                                                                                                        
																			<div class="login-form">
																				<form action="#" method="post">
																				   <input type="text" name="name" placeholder="Name" required="">
																					<input type="email" name="email" placeholder="Email" required="">
                                                                                                                                                                        <input type="text" name="phone" placeholder="Phone Number" required="">
                                                                                                                                                                        <input type="text" name="address" placeholder="Address" required="">
																					<input type="password" name="password" placeholder="Password" required="">
																					
                                                                                                                                                                        <input type="submit" name="submit" value="Register">
																				</form>
																			</div>
																			<p><a href="#"> By clicking register, I agree to your terms</a></p>
																		</div>
																</div>
															</div>
														</div>
													</div>
													
		<!-- //Modal3 -->
<!--banner bottom-->
<div class="banner-btm-w3layouts" id="about">
	<div class="container">
	<div class="tittle-agileinfo">
		<span>01</span>
		<h2>Welcome To Web Programming Class</h2>
		<p >The course code is CSC506</p>
	</div>
		<div class="about-main">
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-bookmark-o" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">The Course Information</h3>
			<p class="para-agileits-w3layouts">Scope of the Project
The focus of this study is to design an online integrated placement system for Mautech Secondary School which will go a long way in reducing the stress and cost of the manual system. 
</p>
		</div>
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-money" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">The First Assignment</h3>
			<p class="para-agileits-w3layouts">The study is going to cover the conduct of Junior School Certificate Examination (JSCE) placement exercise conducted annually in Junior Secondary Schools.</p>
		</div>
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-money" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">The Second Assignment</h3>
			<p class="para-agileits-w3layouts">The significance of the study is to ease data capturing of all Junior Secondary three (JS III) students before the commencement of Junior School Certificate Examination (JSCE) exams, provide a quick and accurate grading of their performance after the </p>
		</div>
		<div class="clearfix"> </div>	
		</div>
	</div>
</div>



	

	<!-- //contact -->

<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!--search-bar-->
		<script src="js/main.js"></script>	
<!--//search-bar-->
<!-- FlexSlider -->
				  <script defer src="js/jquery.flexslider.js"></script>
				  <script type="text/javascript">
					$(function(){				 
					});
					$(window).load(function(){
					  $('.flexslider').flexslider({
						animation: "slide",
						start: function(slider){
						  $('body').removeClass('loading');
						}
					  });
					});
				  </script>
<!-- FlexSlider -->
<!-- clients-slider-script -->
				<script src="js/slideshow.min.js"></script>
				<script src="js/launcher.js"></script>
<!-- //clients-slider-script -->
<!-- /circle-->
	 <script type="text/javascript" src="js/circles.js"></script>
					         <script>
								var colors = [
										['#ffffff', '#fd9426'], ['#ffffff', '#fc3158'],['#ffffff', '#53d769'], ['#ffffff', '#147efb']
									];
								for (var i = 1; i <= 7; i++) {
									var child = document.getElementById('circles-' + i),
										percentage = 30 + (i * 10);
										
									Circles.create({
										id:         child.id,
										percentage: percentage,
										radius:     80,
										width:      10,
										number:   	percentage / 1,
										text:       '%',
										colors:     colors[i - 1]
									});
								}
						
				</script>
	<!-- //circle -->
	<!-- for-Map -->
		<script type="text/javascript">
			$(function() {
			
				var menu_ul = $('.faq > li > ul'),
					   menu_a  = $('.faq > li > a');
				
				menu_ul.hide();
			
				menu_a.click(function(e) {
					e.preventDefault();
					if(!$(this).hasClass('active')) {
						menu_a.removeClass('active');
						menu_ul.filter(':visible').slideUp('normal');
						$(this).addClass('active').next().stop(true,true).slideDown('normal');
					} else {
						$(this).removeClass('active');
						$(this).next().stop(true,true).slideUp('normal');
					}
				});
			
			});
		</script>
<!-- //for-Map -->
<script src="js/jzBox.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() {
		/*
			var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			};
		*/								
		$().UItoTop({ easingType: 'easeOutQuart' });
		});
	</script>
<!-- Animation-effect -->
<script src='js/aos.js'></script>
<script src="js/aosindex.js"></script>
<!-- //Animation-effect -->
	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<script src="js/bootstrap.js"></script>

</body>
</html>