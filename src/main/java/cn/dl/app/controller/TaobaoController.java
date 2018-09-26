package cn.dl.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taobao.api.ApiException;

import cn.dl.app.service.TaobaoService;
import cn.dl.utils.ParamUtils;

@RestController
@RequestMapping("app/taobao")
public class TaobaoController {

	@Autowired
	private TaobaoService taobaoService;

	@RequestMapping("/getItem")
	public String getItem(HttpServletRequest request) throws ApiException {
		String page = ParamUtils.getStr(request, "page");
		String queryName = ParamUtils.getStr(request, "queryName");
		String item = taobaoService.getItem(Long.valueOf(page), queryName);
		return item;
	}

	@RequestMapping("/getCouponItem")
	public String getCouponItem(HttpServletRequest request) throws ApiException {
		String page = ParamUtils.getStr(request, "page");
		String queryName = ParamUtils.getStr(request, "queryName");
		String item = taobaoService.getCouponItem(Long.valueOf(page), queryName);
		return item;
	}
}
