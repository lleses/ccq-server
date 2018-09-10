package cn.dl.official;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 查查券官网
 */
@Controller
public class OfficialController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

}