package accessPoint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {


public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
    
         String uname = request.getParameter("un");
         String password = request.getParameter("pw");
    
         

try
{	    
  
     ControlUserBean user = new ControlUserBean();
     user.setUserName(request.getParameter("un"));
     user.setPassword(request.getParameter("pw"));
 
     user = ControlUserDAO.login(user);
	   		    
     if (user.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect("profile.jsp"); //logged-in page    

      //   request.getSession().removeAttribute("errorMessage");
      //   request.getRequestDispatcher("/index.jsp").forward(request, response);
     }
     
	        
     else 
     {
    
             HttpSession session = request.getSession(false);	    
         
            
             session.setAttribute("errorMessage", "Invalid Login Details");
            // response.sendRedirect(request.getHeader("login")); //error page 
             
             request.getRequestDispatcher("/index.jsp").forward(request, response);
          // request.getSession().getAttribute("errorMessage","Invalid Login ");
    
         
          
         // request.getRequestDispatcher("/login.jsp").forward(request, response);
            } 
	 }	
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
      
}
}

