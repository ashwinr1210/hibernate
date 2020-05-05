package billing.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(value="/checkCredentials",method = RequestMethod.POST)
	public String add(@ModelAttribute LoginModel model) {
		System.out.println("@@@@@@@@@@@@");
		
        try {
        	if(!model.getUsername().isEmpty())
        		return new LoginService().validateCredentials(model.getUsername(), model.getPassword());
        	else
        		return "error";
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return "error";
	}
	
	
 @RequestMapping("/testing")
	public  @ResponseBody String  test() {
		System.out.println("@@@@@@@@@@@@");	
        try {
       
        		return "ashwin";
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return "error";
	}
	
//	@RequestMapping(value="/checkCredentials",method = RequestMethod.POST)
//	public String add(HttpServletRequest request) {
//		System.out.println("@@@@@@@@@@@@");
//		
//        try {
//        	if(!request.getParameter("username").isEmpty())
//        		return new LoginService().validateCredentials(request.getParameter("username"), request.getParameter("password"));
//        	else
//        		return "error";
//        	
//        }catch(Exception e) {
//        	e.printStackTrace();
//        }
//		return "error";
//	}
}
