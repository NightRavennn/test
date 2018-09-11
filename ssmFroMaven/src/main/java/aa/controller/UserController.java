package aa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aa.model.UserModel;
import aa.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userSerive;
	
	@RequestMapping("/test")
	public String test(String aa) {
		System.out.println(aa);
		return "success";
	}
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String Login(String uname,String pwd) {
		UserModel user = userSerive.findUser(uname, pwd);
		System.out.println(user.toString());
		return "success";
	}
}
