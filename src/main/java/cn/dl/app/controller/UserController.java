package cn.dl.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dl.app.entity.User;
import cn.dl.app.service.UserService;

@RequestMapping("app/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setInvitationCode(11);
		user.setPhone("123");
		userService.add(user);
		return "1";
	}
}
