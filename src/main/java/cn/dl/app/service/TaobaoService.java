package cn.dl.app.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkDgItemCouponGetResponse;
import com.taobao.api.response.TbkItemGetResponse;

import cn.dl.utils.HttpUtils;

@Service
@Transactional(readOnly = true)
public class TaobaoService {
	public static String url = "http://gw.api.taobao.com/router/rest";
	
//	我的
//	public static String appkey = "25088913";
//	public static String secret = "58b87659f94125aa3aa3ea4befa7f390";
//	public static Long adzone_id = 33051350227L;
	//温总
	public static String appkey = "25093121";
	public static String secret = "53486b21b3dc00aa41ec24df8f96069b";
	public static Long adzone_id = 37994150170L;

	// 黑马淘宝客
	public static String order_appkey = "272246755";
	public static String order_secret = "9b8bd0998fed19fec1c5381f8d67224a";
	public static String order_sid = "3668";

	public String getItem(Long page, String queryName) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		TbkItemGetRequest req = new TbkItemGetRequest();
		req.setFields(
				"num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
		req.setQ(queryName);
		req.setPageNo(page);
		TbkItemGetResponse response = client.execute(req);
		return response.getBody();
	}

	public String getCouponItem(Long page, String queryName) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		TbkDgItemCouponGetRequest req = new TbkDgItemCouponGetRequest();
		req.setAdzoneId(adzone_id);
		req.setQ(queryName);
		req.setPageNo(page);
		TbkDgItemCouponGetResponse rsp = client.execute(req);
		return rsp.getBody();
	}

	/** 获取订单 */
	public String getOrder() {
		String url = "https://www.heimataoke.com/api-qdOrder?appkey=" + order_appkey //
				+ "&appsecret=" + order_secret//
				+ "&sid=" + order_sid//
				+ "&start_time=2018-09-30+07%3a58%3a13&span=1200&page_no=1&page_size=100&order_query_type=create_time&tk_status=1&order_scene=1";
		String string = HttpUtils.get(url);
		return string;
	}

	public static void main(String[] args) throws ApiException, ParseException {
		TaobaoService  TaobaoService =new TaobaoService();
		String couponItem = TaobaoService.getCouponItem(1L,"女装");
		System.out.println(couponItem);

//		TaobaoService taobaoService = new TaobaoService();
//		String order = taobaoService.getOrder();
//		System.out.println(order);

	}

}