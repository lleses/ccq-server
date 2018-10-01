package cn.dl.app.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taobao.api.ApiException;

import cn.dl.app.entity.User;
import cn.dl.app.service.UserService;
import cn.dl.utils.ParamUtils;
import cn.dl.utils.ShareCodeUtil;
import cn.dl.utils.StringUtils;

@RestController
@RequestMapping("app/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) throws ApiException {
		Map<String, Object> map = new HashMap<String, Object>();
		String phone = ParamUtils.getStr(request, "phone");
		User user = userService.getByPhone(phone);
		if (user == null) {
			map.put("succ", "-1");
			return StringUtils.json(map);// 不存在用户，进入邀请码页
		}
		map.put("succ", "1");
		map.put("user", user);
		return StringUtils.json(map);// 已存在用户，直接登录
	}

	@RequestMapping("/check")
	public String check(HttpServletRequest request) throws ApiException {
		Map<String, Object> map = new HashMap<String, Object>();
		String phone = ParamUtils.getStr(request, "phone");// 用户的手机号码
		String invitationCode = ParamUtils.getStr(request, "invitationCode");// 邀请人的邀请码

		User InvitePeople = userService.getByInvitationCode(invitationCode);// 邀请人
		if (!"8888".equals(invitationCode) && InvitePeople == null) {
			map.put("succ", "-1");
			return StringUtils.json(map);// 邀请码不正确
		}

		User user = new User();
		user.setPhone(phone);
		if (InvitePeople != null) {
			user.setInvitePeopleId(InvitePeople.getId());
		}
		Integer id = userService.add(user);
		String code = ShareCodeUtil.idToCode(Long.valueOf(id));
		user.setInvitationCode(code);
		userService.update(user);
		map.put("succ", "1");
		map.put("user", user);
		return StringUtils.json(map);
	}

}
