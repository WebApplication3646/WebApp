<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="accessPoint.ControlUserBean"%>
<!DOCTYPE HTML>

 <% ControlUserBean currentUser = (ControlUserBean) (session.getAttribute("currentSessionUser"));%>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content=" ">
  <meta name="author" content="Creative Tim">
  <title>Post</title>
  <!-- Favicon -->

  <!-- Fonts -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
  <!-- Icons -->
  <link rel="stylesheet" href="./assets/vendor/nucleo/css/nucleo.css" type="text/css">
  <link rel="stylesheet" href="./assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
 
  <link rel="stylesheet" href="./css/argon.css?v=1.2.0" type="text/css">
</head>

<body>
  <!-- Sidenav -->
  <nav class="sidenav navbar navbar-vertical  fixed-left  navbar-expand-xs navbar-light bg-white" id="sidenav-main">
    <div class="scrollbar-inner">
   
     
  <!-- Main content -->
  <div class="main-content" id="panel">
    <!-- Topnav -->
    <nav class="navbar navbar-top navbar-expand navbar-dark bg-default border-bottom">
      <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <!-- Search form -->
      
          <!-- Navbar links -->
          <ul class="navbar-nav align-items-center  ml-md-auto ">
          
         
       
        
          </ul>
          <ul class="navbar-nav align-items-center  ml-auto ml-md-0 ">
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <div class="media align-items-center">
                  <span class="avatar avatar-sm rounded-circle">
                    <img alt="Image placeholder" src="./assets/img/theme/team-4.jpg">
                  </span>
                  <div class="media-body  ml-2  d-none d-lg-block">
                     <%= currentUser.getUsername()%> 
                 
                  </div>
                </div>
              </a>
              <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Welcome!</h6>
                </div>
                <a href="profile.jsp" class="dropdown-item">
                  <i class="ni ni-single-02"></i>
                  <span>My profile</span>
                </a>
               
                <div class="dropdown-divider"></div>
                <a href="index.jsp" class="dropdown-item">
                  <i class="ni ni-user-run"></i>
                  <span>Logout</span>
                </a>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- Header -->
    <!-- Header -->
    <div class="header pb-6 d-flex align-items-center" style="min-height: 500px; background-image: url(./assets/img/theme/profile-cover.jpg); background-size: cover; background-position: center top;">
      <!-- Mask -->
      <span class="mask bg-gradient-default opacity-8"></span>
      <!-- Header container -->
      <div class="container-fluid d-flex align-items-center">
        <div class="row">
          <div class="col-lg-7 col-md-12">
             <h2 class="display-2 text-white">Welcome!  </h2> 
               <h2 class="display-2 text-white">  <%= currentUser.getUsername()%> </h2> 
         
          
          </div>
        </div>
      </div>
    </div>
    <!-- Page content -->
    
            <div class="card-body">
                
                
                             <%
        if(request.getParameter("submit") !=null){
            
         
            String post = request.getParameter("post");
             String name = request.getParameter("name");
         
          
            
            Connection con;
            PreparedStatement pst;
            ResultSet rs;  
                                                    
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/csc506database","root","");
            pst = con.prepareStatement("INSERT INTO `csc506database`.`comment` (`post`, `name`) VALUES (?, ?);");      
               
             
                  pst.setString(1, post);
            pst.setString(2, name);
        
            
            
            
            pst.executeUpdate();
            
            %>
           <script>
               alert("Posted");
           </script>
        
            <%
        }
    
    
    %>
                
                
             
             
                
              <form>
                <h6 class="heading-small text-muted mb-4">Post/Comment</h6>
                <div class="pl-lg-4">
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-username">Name</label>
                        <input type="text" id="input-username" class="form-control" placeholder="Username" name="name">
                      </div>
                    </div>
                      
                        <div class="col-md-9">
                     <textarea name="post" placeholder="Write Comment..." >  </textarea>
                  </div>
                   
                 
                       <div class="col-4 text-right">
                           <center>  <button type="submit" class="btn btn-sm btn-primary" name="submit">Post</button></center>
                </div>
                <hr class="my-4" />
              
              </form>
             
            </div>
          </div>
        </div>
      </div>
      <!-- Footer -->
      
    </div>
  </div>

  <!-- Core -->
  <script src="./assets/vendor/jquery/dist/jquery.min.js"></script>
  <script src="./assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="./assets/vendor/js-cookie/js.cookie.js"></script>
  <script src="./assets/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
  <script src="./assets/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>

  <script src="./assets/js/argon.js?v=1.2.0"></script>
</body>

</html>
