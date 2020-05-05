package billing.login;

import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/register")
public class RegisterController {
	@RequestMapping(value="/addCredentials",method = RequestMethod.POST)
	public String add(@ModelAttribute LoginModel model) {
		try {
			
			if (!model.getUsername().isEmpty())
				return new RegisterService().addCredentials(model.getUsername(),
						model.getPassword(),model.getEmail(),model.getDate());
			else
				return "errorr";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "errorr";
	}
	
	

}
