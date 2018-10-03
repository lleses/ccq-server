package cn.dl.app.entity;

import java.util.Date;

/**
 * 淘宝客订单
 */
public class TbkOrder {

	/** ID */
	private Integer id;
	/**
	 * 淘宝父订单号<br>
	 * (把订单号后六位取出，最后两位和倒数3-4位顺序对调一下，它就是该用户在淘宝的userid的后六位)
	 */
	private Integer trade_parent_id;
	/** 淘宝订单号 */
	private Integer trade_id;
	/** 商品ID */
	private Integer num_iid;
	/** 商品标题 */
	private String item_title;
	/** 商品数量 */
	private Integer item_num;
	/** 单价 */
	private String price;
	/** 实际支付金额 */
	private String pay_price;
	/** 卖家昵称 */
	private String seller_nick;
	/** 卖家店铺名称 */
	private String seller_shop_title;
	/** 推广者获得的收入金额，对应联盟后台报表“预估收入” */
	private String commission;
	/** 推广者获得的分成比率，对应联盟后台报表“分成比率” */
	private String commission_rate;
	/** 推广者unid（已废弃） */
	private String unid;
	/** 淘客订单创建时间 */
	private Date create_time;
	/** 淘客订单结算时间 */
	private Date earning_time;
	/** 淘客订单状态，3：订单结算，12：订单付款， 13：订单失效，14：订单成功 */
	private Integer tk_status;
	/** 第三方服务来源，没有第三方服务，取值为“--” */
	private String tk3rd_type;
	/** 第三方推广者ID */
	private Integer tk3rd_pub_id;
	/** 订单类型，如天猫，淘宝 */
	private String order_type;
	/** 收入比率，卖家设置佣金比率+平台补贴比率 */
	private String income_rate;
	/** 效果预估，付款金额*(佣金比率+补贴比率)*分成比率 */
	private String pub_share_pre_fee;
	/** 补贴比率 */
	private String subsidy_rate;
	/** 补贴类型，天猫:1，聚划算:2，航旅:3，阿里云:4 */
	private String subsidy_type;
	/** 成交平台，PC:1，无线:2 */
	private String terminal_type;
	/** 类目名称 */
	private String auction_category;
	/** 来源媒体ID */
	private String site_id;
	/** 来源媒体名称 */
	private String site_name;
	/** 广告位ID */
	private String adzone_id;
	/** 广告位名称 */
	private String adzone_name;
	/** 付款金额 */
	private String alipay_total_price;
	/** 佣金比率 */
	private String total_commission_rate;
	/** 佣金金额 */
	private String total_commission_fee;
	/** 补贴金额 */
	private String subsidy_fee;
	/** 渠道关系ID */
	private Integer relation_id;
	/** 会员运营ID */
	private Integer special_id;

	/**
	 * ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 淘宝父订单号<br>
	 * (把订单号后六位取出，最后两位和倒数3-4位顺序对调一下，它就是该用户在淘宝的userid的后六位)
	 */
	public Integer getTrade_parent_id() {
		return trade_parent_id;
	}

	/**
	 * 淘宝父订单号<br>
	 * (把订单号后六位取出，最后两位和倒数3-4位顺序对调一下，它就是该用户在淘宝的userid的后六位)
	 */
	public void setTrade_parent_id(Integer trade_parent_id) {
		this.trade_parent_id = trade_parent_id;
	}

	/**
	 * 淘宝订单号
	 */
	public Integer getTrade_id() {
		return trade_id;
	}

	/**
	 * 淘宝订单号
	 */
	public void setTrade_id(Integer trade_id) {
		this.trade_id = trade_id;
	}

	/**
	 * 商品ID
	 */
	public Integer getNum_iid() {
		return num_iid;
	}

	/**
	 * 商品ID
	 */
	public void setNum_iid(Integer num_iid) {
		this.num_iid = num_iid;
	}

	/**
	 * 商品标题
	 */
	public String getItem_title() {
		return item_title;
	}

	/**
	 * 商品标题
	 */
	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}

	/**
	 * 商品数量
	 */
	public Integer getItem_num() {
		return item_num;
	}

	/**
	 * 商品数量
	 */
	public void setItem_num(Integer item_num) {
		this.item_num = item_num;
	}

	/**
	 * 单价
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * 单价
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * 实际支付金额
	 */
	public String getPay_price() {
		return pay_price;
	}

	/**
	 * 实际支付金额
	 */
	public void setPay_price(String pay_price) {
		this.pay_price = pay_price;
	}

	/**
	 * 卖家昵称
	 */
	public String getSeller_nick() {
		return seller_nick;
	}

	/**
	 * 卖家昵称
	 */
	public void setSeller_nick(String seller_nick) {
		this.seller_nick = seller_nick;
	}

	/**
	 * 卖家店铺名称
	 */
	public String getSeller_shop_title() {
		return seller_shop_title;
	}

	/**
	 * 卖家店铺名称
	 */
	public void setSeller_shop_title(String seller_shop_title) {
		this.seller_shop_title = seller_shop_title;
	}

	/**
	 * 推广者获得的收入金额，对应联盟后台报表“预估收入”
	 */
	public String getCommission() {
		return commission;
	}

	/**
	 * 推广者获得的收入金额，对应联盟后台报表“预估收入”
	 */
	public void setCommission(String commission) {
		this.commission = commission;
	}

	/**
	 * 推广者获得的分成比率，对应联盟后台报表“分成比率”
	 */
	public String getCommission_rate() {
		return commission_rate;
	}

	/**
	 * 推广者获得的分成比率，对应联盟后台报表“分成比率”
	 */
	public void setCommission_rate(String commission_rate) {
		this.commission_rate = commission_rate;
	}

	/**
	 * 推广者unid（已废弃）
	 */
	public String getUnid() {
		return unid;
	}

	/**
	 * 推广者unid（已废弃）
	 */
	public void setUnid(String unid) {
		this.unid = unid;
	}

	/**
	 * 淘客订单创建时间
	 */
	public Date getCreate_time() {
		return create_time;
	}

	/**
	 * 淘客订单创建时间
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	/**
	 * 淘客订单结算时间
	 */
	public Date getEarning_time() {
		return earning_time;
	}

	/**
	 * 淘客订单结算时间
	 */
	public void setEarning_time(Date earning_time) {
		this.earning_time = earning_time;
	}

	/**
	 * 淘客订单状态，3：订单结算，12：订单付款， 13：订单失效，14：订单成功
	 */
	public Integer getTk_status() {
		return tk_status;
	}

	/**
	 * 淘客订单状态，3：订单结算，12：订单付款， 13：订单失效，14：订单成功
	 */
	public void setTk_status(Integer tk_status) {
		this.tk_status = tk_status;
	}

	/**
	 * 第三方服务来源，没有第三方服务，取值为“--”
	 */
	public String getTk3rd_type() {
		return tk3rd_type;
	}

	/**
	 * 第三方服务来源，没有第三方服务，取值为“--”
	 */
	public void setTk3rd_type(String tk3rd_type) {
		this.tk3rd_type = tk3rd_type;
	}

	/**
	 * 第三方推广者ID
	 */
	public Integer getTk3rd_pub_id() {
		return tk3rd_pub_id;
	}

	/**
	 * 第三方推广者ID
	 */
	public void setTk3rd_pub_id(Integer tk3rd_pub_id) {
		this.tk3rd_pub_id = tk3rd_pub_id;
	}

	/**
	 * 订单类型，如天猫，淘宝
	 */
	public String getOrder_type() {
		return order_type;
	}

	/**
	 * 订单类型，如天猫，淘宝
	 */
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	/**
	 * 收入比率，卖家设置佣金比率+平台补贴比率
	 */
	public String getIncome_rate() {
		return income_rate;
	}

	/**
	 * 收入比率，卖家设置佣金比率+平台补贴比率
	 */
	public void setIncome_rate(String income_rate) {
		this.income_rate = income_rate;
	}

	/**
	 * 效果预估，付款金额*(佣金比率+补贴比率)*分成比率
	 */
	public String getPub_share_pre_fee() {
		return pub_share_pre_fee;
	}

	/**
	 * 效果预估，付款金额*(佣金比率+补贴比率)*分成比率
	 */
	public void setPub_share_pre_fee(String pub_share_pre_fee) {
		this.pub_share_pre_fee = pub_share_pre_fee;
	}

	/**
	 * 补贴比率
	 */
	public String getSubsidy_rate() {
		return subsidy_rate;
	}

	/**
	 * 补贴比率
	 */
	public void setSubsidy_rate(String subsidy_rate) {
		this.subsidy_rate = subsidy_rate;
	}

	/**
	 * 补贴类型，天猫:1，聚划算:2，航旅:3，阿里云:4
	 */
	public String getSubsidy_type() {
		return subsidy_type;
	}

	/**
	 * 补贴类型，天猫:1，聚划算:2，航旅:3，阿里云:4
	 */
	public void setSubsidy_type(String subsidy_type) {
		this.subsidy_type = subsidy_type;
	}

	/**
	 * 成交平台，PC:1，无线:2
	 */
	public String getTerminal_type() {
		return terminal_type;
	}

	/**
	 * 成交平台，PC:1，无线:2
	 */
	public void setTerminal_type(String terminal_type) {
		this.terminal_type = terminal_type;
	}

	/**
	 * 类目名称
	 */
	public String getAuction_category() {
		return auction_category;
	}

	/**
	 * 类目名称
	 */
	public void setAuction_category(String auction_category) {
		this.auction_category = auction_category;
	}

	/**
	 * 来源媒体ID
	 */
	public String getSite_id() {
		return site_id;
	}

	/**
	 * 来源媒体ID
	 */
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	/**
	 * 来源媒体名称
	 */
	public String getSite_name() {
		return site_name;
	}

	/**
	 * 来源媒体名称
	 */
	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	/**
	 * 广告位ID
	 */
	public String getAdzone_id() {
		return adzone_id;
	}

	/**
	 * 广告位ID
	 */
	public void setAdzone_id(String adzone_id) {
		this.adzone_id = adzone_id;
	}

	/**
	 * 广告位名称
	 */
	public String getAdzone_name() {
		return adzone_name;
	}

	/**
	 * 广告位名称
	 */
	public void setAdzone_name(String adzone_name) {
		this.adzone_name = adzone_name;
	}

	/**
	 * 付款金额
	 */
	public String getAlipay_total_price() {
		return alipay_total_price;
	}

	/**
	 * 付款金额
	 */
	public void setAlipay_total_price(String alipay_total_price) {
		this.alipay_total_price = alipay_total_price;
	}

	/**
	 * 佣金比率
	 */
	public String getTotal_commission_rate() {
		return total_commission_rate;
	}

	/**
	 * 佣金比率
	 */
	public void setTotal_commission_rate(String total_commission_rate) {
		this.total_commission_rate = total_commission_rate;
	}

	/**
	 * 佣金金额
	 */
	public String getTotal_commission_fee() {
		return total_commission_fee;
	}

	/**
	 * 佣金金额
	 */
	public void setTotal_commission_fee(String total_commission_fee) {
		this.total_commission_fee = total_commission_fee;
	}

	/**
	 * 补贴金额
	 */
	public String getSubsidy_fee() {
		return subsidy_fee;
	}

	/**
	 * 补贴金额
	 */
	public void setSubsidy_fee(String subsidy_fee) {
		this.subsidy_fee = subsidy_fee;
	}

	/**
	 * 渠道关系ID
	 */
	public Integer getRelation_id() {
		return relation_id;
	}

	/**
	 * 渠道关系ID
	 */
	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}

	/**
	 * 会员运营ID
	 */
	public Integer getSpecial_id() {
		return special_id;
	}

	/**
	 * 会员运营ID
	 */
	public void setSpecial_id(Integer special_id) {
		this.special_id = special_id;
	}

}
