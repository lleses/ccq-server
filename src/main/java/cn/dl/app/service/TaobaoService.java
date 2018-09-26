package cn.dl.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkDgItemCouponGetResponse;
import com.taobao.api.response.TbkItemGetResponse;

@Service
@Transactional(readOnly = true)
public class TaobaoService {

	public static String url = "http://gw.api.taobao.com/router/rest";
	public static String appkey = "25088913";
	public static String secret = "58b87659f94125aa3aa3ea4befa7f390";
	public static Long adzone_id = 33051350227L;

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

	// taobao.tbk.dg.item.coupon.get
	// taobao.tbk.dg.item.coupon.get( 好券清单API【导购】 )
	public String getCouponItem(Long page, String queryName) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		TbkDgItemCouponGetRequest req = new TbkDgItemCouponGetRequest();
		req.setAdzoneId(adzone_id);
		req.setQ(queryName);
		req.setPageNo(page);
		TbkDgItemCouponGetResponse rsp = client.execute(req);
		return rsp.getBody();
	}

	public static void main(String[] args) throws ApiException {
		TaobaoService taobaoService = new TaobaoService();
		long a = 1;
		String item = taobaoService.getItem(a, "2018夏装t恤女短袖百搭宽松黑白闺蜜衣服港风情侣装上衣女打底衫");
		System.out.println(item);
		// userid=3005032613

//		https://uland.taobao.com/coupon/edetail?e=XoElCPr3Ydt9%2BIHBh%2BrOiioPr%2BRaKTNCLYP29st3XV5ow2ATT0uODg13gui0W49o5PdvjO4eOnOie%2FpBy9wBFg%3D%3D&pid=mm_0_0_0&af=1&itemId=524136796550
//		https://uland.taobao.com/coupon/edetail?e=weQ8q7/MxtkGQASttHIRqbqnX/95OJ14NI7JJuOoRMWm/PqYSC+Ilhik+WoBmIst1uBmFy6he+Plzy8u8KTvrq7W5J0N5vbnDfqEFBOhTcxhm/CgnRDDPlapWVmPOMbpSGAm1yz1+uS6t37JuI8wEAMFTfGLA/dyI+bwyUGazcjiYslmRTfxHBdOOR5C4gXnQS0Flu/fbSog+eE+jpQFGFLajOROSSHlo+84WLi2WzmYCpZIgeQW8Q==&traceId=0b08283815378739455297833e
//		https://uland.taobao.com/coupon/edetail?e=weQ8q7/MxtkGQASttHIRqbqnX/95OJ14NI7JJuOoRMWm/PqYSC+Ilhik+WoBmIst1uBmFy6he+Plzy8u8KTvrq7W5J0N5vbnDfqEFBOhTcxhm/CgnRDDPlapWVmPOMbpSGAm1yz1+uS6t37JuI8wEAMFTfGLA/dyI+bwyUGazcjiYslmRTfxHBdOOR5C4gXnQS0Flu/fbSog+eE+jpQFGFLajOROSSHlo+84WLi2WzmYCpZIgeQW8Q==&traceId=0b08283815378739455297833e&pid=mm_0_0_0&af=1&itemId=524136796550

		// https://uland.taobao.com/coupon/edetail?e=9YvvE+MzWw0GQASttHIRqVoRt81VdIr7rcmTHWmWojbB76UlhXoJ97SNxsWz7/jybgx9qt6W0MWwuf/wyv3Der/e0TmYNJjIDfqEFBOhTcxhm/CgnRDDPlapWVmPOMbpSGAm1yz1+uS6t37JuI8wEAMFTfGLA/dyI+bwyUGazcjiYslmRTfxHBdOOR5C4gXnQS0Flu/fbSog+eE+jpQFGFLajOROSSHlo+84WLi2WzmYCpZIgeQW8Q==&traceId=0b08283815378739455297833e

//		adzone_id=33051350227;

		// https://uland.taobao.com/coupon/edetail?e=xzxzXlFVkEIGQASttHIRqbqnX/95OJ14NI7JJuOoRMWm/PqYSC+IlpPYwIW1e5fLX1MTMMnAoUK7A7HXKGnKcCZkuF704OIrDfqEFBOhTcxhm/CgnRDDPlapWVmPOMbpSGAm1yz1+uS6t37JuI8wEAMFTfGLA/dyI+bwyUGazcjiYslmRTfxHBdOOR5C4gXnQS0Flu/fbSog+eE+jpQFGFLajOROSSHlrClC+1FO8B47cKmzsGca7w==&traceId=0b0b9b3715379331574051822e

		// https://uland.taobao.com/coupon/edetail?e=2qJRnVWR8KwGQASttHIRqbqnX/95OJ14NI7JJuOoRMWm/PqYSC+IlpPYwIW1e5fLX1MTMMnAoUK7A7HXKGnKcCZkuF704OIrDfqEFBOhTcxhm/CgnRDDPlapWVmPOMbpSGAm1yz1+uS6t37JuI8wEAMFTfGLA/dyI+bwyUGazcjiYslmRTfxHBdOOR5C4gXnQS0Flu/fbSog+eE+jpQFGFLajOROSSHl1XwLZunzufOB39ptop9zhg==&traceId=0b0837c215379335627031806e
	}
}