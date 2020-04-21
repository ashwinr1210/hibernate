package billing.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@RequestMapping("/addCredentials")
	public String add(HttpServletRequest request) {
		try {
			
			if (!request.getParameter("username").isEmpty())
				return new RegisterService().addCredentials(request.getParameter("username"),
						request.getParameter("password"),request.getParameter("email"));
			else
				return "error";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
}
