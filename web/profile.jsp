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
  <title>Profile</title>
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
   
      <div class="navbar-inner">
        <!-- Collapse -->
        <div class="collapse navbar-collapse" id="sidenav-collapse-main">
          <!-- Nav items -->
          <ul class="navbar-nav">
              
               
            <li class="nav-item">
              <a class="nav-link" href="profile.jsp">
                <i class="ni ni-single-02 text-yellow"></i>
                <span class="nav-link-text">Profile</span>
              </a>
            </li>
          
              <li class="nav-item">
              <a class="nav-link" href="index.jsp">
                <i class="ni ni-user-run"></i>
                <span class="nav-link-text">Logout</span>
              </a>
            </li>
            
          </ul>
        </div>
      </div>
    </div>
  </nav>
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
    <div class="container-fluid mt--6">
      <div class="row">
        <div class="col-xl-4 order-xl-2">
          <div class="card card-profile">
            <img src="./assets/img/theme/img-1-1000x600.jpg" alt="Image placeholder" class="card-img-top">
            <div class="row justify-content-center">
              <div class="col-lg-3 order-lg-2">
                <div class="card-profile-image">
                
                    
                         <div class="profile_img">
                  <center>  <span class="prfil-img"><img id="output" class="rounded-circle"> </span> </center>
                    </div>

                      <br>
                      
                      <p><input type="file" accept="image/*" name="image" id="file" onchange="loadFile(event)" style="display: none;"></p>
                 
                      <br>
                       <br>
                  
                        <p><label for="file" style="cursor: pointer;">Upload Image</label></p> 
                      
                      
                      <script>
                          var loadFile = function(event){
                              var image = document.getElementById('output');
                              image.src = URL.createObjectURL(event.target.files[0]);
                              
                          };
                          
                          
                      </script>

                    
                </div>
              </div>
            </div>
         
        
          </div>
        </div>
        <div class="col-xl-8 order-xl-1">
          <div class="card">
            <div class="card-header">
              <div class="row align-items-center">
                <div class="col-8">
                  <h3 class="mb-0">Edit profile </h3>
                </div>
               
              </div>
            </div>
            <div class="card-body">
              <form>
                <h6 class="heading-small text-muted mb-4">User information</h6>
                <div class="pl-lg-4">
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-username">Username</label>
                        <input type="text" id="input-username" class="form-control" placeholder="Username" value="">
                      </div>
                    </div>
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-email">Email address</label>
                        <input type="email" id="input-email" class="form-control" placeholder="" value="<%= currentUser.getUsername()%>">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-first-name">First name</label>
                        <input type="text" id="input-first-name" class="form-control" placeholder="First name" value="">
                      </div>
                    </div>
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-last-name">Last name</label>
                        <input type="text" id="input-last-name" class="form-control" placeholder="Last name" value="">
                      </div>
                    </div>
                  </div>
                </div>
                       <div class="col-4 text-right">
                           <center>  <a href="#!" class="btn btn-sm btn-primary">Update</a></center>
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