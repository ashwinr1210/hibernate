package billing.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/checkCredentials")
	public String add(HttpServletRequest request) {
        try {
        	if(!request.getParameter("username").isEmpty())
        		return new LoginService().validateCredentials(request.getParameter("username"), request.getParameter("password"));
        	else
        		return "error";
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return "error";
	}
}
