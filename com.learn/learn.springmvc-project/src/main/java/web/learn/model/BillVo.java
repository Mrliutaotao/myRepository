package web.learn.model;

import java.util.Date;


public class BillVo {

	/**
	 * 字段：id
	 *
	 * @haoxz11MyBatis
	 */
	private Long id;

	/**
	 * 字段：账户编号
	 *
	 * @haoxz11MyBatis
	 */
	private Long accountNo;

	/**
	 * 字段：用户id
	 *
	 * @haoxz11MyBatis
	 */
	private Long userId;

	private String billStat;

	private String billSettleType;

	/**
	 * 字段：账单标题
	 *
	 * @haoxz11MyBatis
	 */
	private String title;

	/**
	 * 字段：账单类型
	 *
	 * @haoxz11MyBatis
	 */
	private String billType;

	/**
	 * 字段：当前期数
	 *
	 * @haoxz11MyBatis
	 */
	private Integer period;

	/**
	 * 字段：总期数
	 *
	 * @haoxz11MyBatis
	 */
	private Integer periodNum;

	/**
	 * 字段：账单总金额
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtBill;

	/**
	 * 字段：账单本金
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtCapital;

	/**
	 * 字段：总利息
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtFee;

	/**
	 * 字段：可分期金额
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtInstalment;

	/**
	 * 字段：分期表id
	 *
	 * @haoxz11MyBatis
	 */
	private Long instalmentId;

	/**
	 * 字段：账单支付组id
	 *
	 * @haoxz11MyBatis
	 */
	private String groupId;

	/**
	 * 字段：插入人
	 *
	 * @haoxz11MyBatis
	 */
	private Long createby;

	/**
	 * 字段：更新人
	 *
	 * @haoxz11MyBatis
	 */
	private Long updateby;

	/**
	 * 字段：备注
	 *
	 * @haoxz11MyBatis
	 */
	private String desc;

	/**
	 * 字段：删除标记 y,n
	 *
	 * @haoxz11MyBatis
	 */
	private String del;

	/**
	 * 字段：还款日
	 *
	 * @haoxz11MyBatis
	 */
	private Date payDate;

	/**
	 * 字段：账单开始日期
	 *
	 * @haoxz11MyBatis
	 */
	private Date beginDate;

	/**
	 * 字段：账单结束日期
	 *
	 * @haoxz11MyBatis
	 */
	private Date endDate;

	/**
	 * 字段：还款时间
	 *
	 * @haoxz11MyBatis
	 */
	private Date payTime;

	/**
	 * 字段：创建时间
	 *
	 * @haoxz11MyBatis
	 */
	private Date createTime;

	/**
	 * 字段：更新时间
	 *
	 * @haoxz11MyBatis
	 */
	private Date modifyTime;

	/**
	 * 字段：是否催收n,y
	 *
	 * @haoxz11MyBatis
	 */
	private String isCollection;

	/**
	 * 字段：抽象业务类型\\ncredit_biz 信用业务(取点花,信用支付,订单,毕业金2.0)\\ngradu_loan_biz 毕业金业务(毕业金3.0)
	 *
	 * @haoxz11MyBatis
	 */
	private String virtualBiz;

	/**
	 * 字段：管理费
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtManager;

	/**
	 * 字段：手续费
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtFactorage;

	/**
	 * 字段：服务费
	 *
	 * @haoxz11MyBatis
	 */
	private Long amtService;

	/**
	 * 读取：id
	 *
	 * @return bill.id
	 *
	 * @haoxz11MyBatis
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置：id
	 *
	 * @param id bill.id
	 *
	 * @haoxz11MyBatis
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 读取：账户编号
	 *
	 * @return bill.account_no
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAccountNo() {
		return accountNo;
	}

	/**
	 * 设置：账户编号
	 *
	 * @param accountNo bill.account_no
	 *
	 * @haoxz11MyBatis
	 */
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * 读取：用户id
	 *
	 * @return bill.user_id
	 *
	 * @haoxz11MyBatis
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 设置：用户id
	 *
	 * @param userId bill.user_id
	 *
	 * @haoxz11MyBatis
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 读取：账单状态
WAIT_PAY	等待支付
PAYING 		支付中
DELAY		逾期
SETTLE		完成支付
CLOSE		关闭
REFUND		退款
	 *
	 * @return bill.bill_stat
	 *
	 * @haoxz11MyBatis
	 */
	public String getBillStat() {
		return billStat;
	}

	/**
	 * 设置：账单状态
WAIT_PAY	等待支付
PAYING 		支付中
DELAY		逾期
SETTLE		完成支付
CLOSE		关闭
REFUND		退款
	 *
	 * @param billStat bill.bill_stat
	 *
	 * @haoxz11MyBatis
	 */
	public void setBillStat(String billStat) {
		this.billStat = billStat;
	}

	/**
	 * 读取：结算类型
repay 正常还款
refund 退款
collection 催收
	 *
	 * @return bill.bill_settle_type
	 *
	 * @haoxz11MyBatis
	 */
	public String getBillSettleType() {
		return billSettleType;
	}

	/**
	 * 设置：结算类型
repay 正常还款
refund 退款
collection 催收
	 *
	 * @param billSettleType bill.bill_settle_type
	 *
	 * @haoxz11MyBatis
	 */
	public void setBillSettleType(String billSettleType) {
		this.billSettleType = billSettleType;
	}

	/**
	 * 读取：账单标题
	 *
	 * @return bill.title
	 *
	 * @haoxz11MyBatis
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置：账单标题
	 *
	 * @param title bill.title
	 *
	 * @haoxz11MyBatis
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 读取：账单类型
	 *
	 * @return bill.bill_type
	 *
	 * @haoxz11MyBatis
	 */
	public String getBillType() {
		return billType;
	}

	/**
	 * 设置：账单类型
	 *
	 * @param billType bill.bill_type
	 *
	 * @haoxz11MyBatis
	 */
	public void setBillType(String billType) {
		this.billType = billType;
	}

	/**
	 * 读取：当前期数
	 *
	 * @return bill.period
	 *
	 * @haoxz11MyBatis
	 */
	public Integer getPeriod() {
		return period;
	}

	/**
	 * 设置：当前期数
	 *
	 * @param period bill.period
	 *
	 * @haoxz11MyBatis
	 */
	public void setPeriod(Integer period) {
		this.period = period;
	}

	/**
	 * 读取：总期数
	 *
	 * @return bill.period_num
	 *
	 * @haoxz11MyBatis
	 */
	public Integer getPeriodNum() {
		return periodNum;
	}

	/**
	 * 设置：总期数
	 *
	 * @param periodNum bill.period_num
	 *
	 * @haoxz11MyBatis
	 */
	public void setPeriodNum(Integer periodNum) {
		this.periodNum = periodNum;
	}

	/**
	 * 读取：账单总金额
	 *
	 * @return bill.amt_bill
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtBill() {
		return amtBill;
	}

	/**
	 * 设置：账单总金额
	 *
	 * @param amtBill bill.amt_bill
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtBill(Long amtBill) {
		this.amtBill = amtBill;
	}

	/**
	 * 读取：账单本金
	 *
	 * @return bill.amt_capital
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtCapital() {
		return amtCapital;
	}

	/**
	 * 设置：账单本金
	 *
	 * @param amtCapital bill.amt_capital
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtCapital(Long amtCapital) {
		this.amtCapital = amtCapital;
	}

	/**
	 * 读取：总利息
	 *
	 * @return bill.amt_fee
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtFee() {
		return amtFee;
	}

	/**
	 * 设置：总利息
	 *
	 * @param amtFee bill.amt_fee
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtFee(Long amtFee) {
		this.amtFee = amtFee;
	}

	/**
	 * 读取：可分期金额
	 *
	 * @return bill.amt_instalment
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtInstalment() {
		return amtInstalment;
	}

	/**
	 * 设置：可分期金额
	 *
	 * @param amtInstalment bill.amt_instalment
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtInstalment(Long amtInstalment) {
		this.amtInstalment = amtInstalment;
	}

	/**
	 * 读取：分期表id
	 *
	 * @return bill.instalment_id
	 *
	 * @haoxz11MyBatis
	 */
	public Long getInstalmentId() {
		return instalmentId;
	}

	/**
	 * 设置：分期表id
	 *
	 * @param instalmentId bill.instalment_id
	 *
	 * @haoxz11MyBatis
	 */
	public void setInstalmentId(Long instalmentId) {
		this.instalmentId = instalmentId;
	}

	/**
	 * 读取：账单支付组id
	 *
	 * @return bill.group_id
	 *
	 * @haoxz11MyBatis
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * 设置：账单支付组id
	 *
	 * @param groupId bill.group_id
	 *
	 * @haoxz11MyBatis
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * 读取：插入人
	 *
	 * @return bill.createby
	 *
	 * @haoxz11MyBatis
	 */
	public Long getCreateby() {
		return createby;
	}

	/**
	 * 设置：插入人
	 *
	 * @param createby bill.createby
	 *
	 * @haoxz11MyBatis
	 */
	public void setCreateby(Long createby) {
		this.createby = createby;
	}

	/**
	 * 读取：更新人
	 *
	 * @return bill.updateby
	 *
	 * @haoxz11MyBatis
	 */
	public Long getUpdateby() {
		return updateby;
	}

	/**
	 * 设置：更新人
	 *
	 * @param updateby bill.updateby
	 *
	 * @haoxz11MyBatis
	 */
	public void setUpdateby(Long updateby) {
		this.updateby = updateby;
	}

	/**
	 * 读取：备注
	 *
	 * @return bill.desc
	 *
	 * @haoxz11MyBatis
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * 设置：备注
	 *
	 * @param desc bill.desc
	 *
	 * @haoxz11MyBatis
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * 读取：删除标记 y,n
	 *
	 * @return bill.del
	 *
	 * @haoxz11MyBatis
	 */
	public String getDel() {
		return del;
	}

	/**
	 * 设置：删除标记 y,n
	 *
	 * @param del bill.del
	 *
	 * @haoxz11MyBatis
	 */
	public void setDel(String del) {
		this.del = del;
	}

	/**
	 * 读取：还款日
	 *
	 * @return bill.pay_date
	 *
	 * @haoxz11MyBatis
	 */
	public Date getPayDate() {
		return payDate;
	}

	/**
	 * 设置：还款日
	 *
	 * @param payDate bill.pay_date
	 *
	 * @haoxz11MyBatis
	 */
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	/**
	 * 读取：账单开始日期
	 *
	 * @return bill.begin_date
	 *
	 * @haoxz11MyBatis
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * 设置：账单开始日期
	 *
	 * @param beginDate bill.begin_date
	 *
	 * @haoxz11MyBatis
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * 读取：账单结束日期
	 *
	 * @return bill.end_date
	 *
	 * @haoxz11MyBatis
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * 设置：账单结束日期
	 *
	 * @param endDate bill.end_date
	 *
	 * @haoxz11MyBatis
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * 读取：还款时间
	 *
	 * @return bill.pay_time
	 *
	 * @haoxz11MyBatis
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * 设置：还款时间
	 *
	 * @param payTime bill.pay_time
	 *
	 * @haoxz11MyBatis
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	/**
	 * 读取：创建时间
	 *
	 * @return bill.create_time
	 *
	 * @haoxz11MyBatis
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置：创建时间
	 *
	 * @param createTime bill.create_time
	 *
	 * @haoxz11MyBatis
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 读取：更新时间
	 *
	 * @return bill.modify_time
	 *
	 * @haoxz11MyBatis
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * 设置：更新时间
	 *
	 * @param modifyTime bill.modify_time
	 *
	 * @haoxz11MyBatis
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * 读取：是否催收n,y
	 *
	 * @return bill.is_collection
	 *
	 * @haoxz11MyBatis
	 */
	public String getIsCollection() {
		return isCollection;
	}

	/**
	 * 设置：是否催收n,y
	 *
	 * @param isCollection bill.is_collection
	 *
	 * @haoxz11MyBatis
	 */
	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}

	/**
	 * 读取：抽象业务类型\\ncredit_biz 信用业务(取点花,信用支付,订单,毕业金2.0)\\ngradu_loan_biz 毕业金业务(毕业金3.0)
	 *
	 * @return bill.virtual_biz
	 *
	 * @haoxz11MyBatis
	 */
	public String getVirtualBiz() {
		return virtualBiz;
	}

	/**
	 * 设置：抽象业务类型\\ncredit_biz 信用业务(取点花,信用支付,订单,毕业金2.0)\\ngradu_loan_biz 毕业金业务(毕业金3.0)
	 *
	 * @param virtualBiz bill.virtual_biz
	 *
	 * @haoxz11MyBatis
	 */
	public void setVirtualBiz(String virtualBiz) {
		this.virtualBiz = virtualBiz;
	}

	/**
	 * 读取：管理费
	 *
	 * @return bill.amt_manager
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtManager() {
		return amtManager;
	}

	/**
	 * 设置：管理费
	 *
	 * @param amtManager bill.amt_manager
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtManager(Long amtManager) {
		this.amtManager = amtManager;
	}

	/**
	 * 读取：手续费
	 *
	 * @return bill.amt_factorage
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtFactorage() {
		return amtFactorage;
	}

	/**
	 * 设置：手续费
	 *
	 * @param amtFactorage bill.amt_factorage
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtFactorage(Long amtFactorage) {
		this.amtFactorage = amtFactorage;
	}

	/**
	 * 读取：服务费
	 *
	 * @return bill.amt_service
	 *
	 * @haoxz11MyBatis
	 */
	public Long getAmtService() {
		return amtService;
	}

	/**
	 * 设置：服务费
	 *
	 * @param amtService bill.amt_service
	 *
	 * @haoxz11MyBatis
	 */
	public void setAmtService(Long amtService) {
		this.amtService = amtService;
	}

	/**
	 * @return the ordercreatetime
	 */
	public Date getOrdercreatetime() {
		return ordercreatetime;
	}

	/**
	 * @param ordercreatetime
	 *            the ordercreatetime to set
	 */
	public void setOrdercreatetime(Date ordercreatetime) {
		this.ordercreatetime = ordercreatetime;
	}

	/**
	 * @return the orderamount
	 */
	public Long getOrderamount() {
		return orderamount;
	}

	/**
	 * @param orderamount
	 *            the orderamount to set
	 */
	public void setOrderamount(Long orderamount) {
		this.orderamount = orderamount;
	}

	/**
	 * @return the ordertitle
	 */
	public String getOrdertitle() {
		return ordertitle;
	}

	/**
	 * @param ordertitle
	 *            the ordertitle to set
	 */
	public void setOrdertitle(String ordertitle) {
		this.ordertitle = ordertitle;
	}

	/**
	 * @return the lastdelayDate
	 */
	public Date getLastdelayDate() {
		return lastdelayDate;
	}

	/**
	 * @param lastdelayDate
	 *            the lastdelayDate to set
	 */
	public void setLastdelayDate(Date lastdelayDate) {
		this.lastdelayDate = lastdelayDate;
	}


	/**
	 * @return the orderid
	 */
	public String getOrderid() {
		return orderid;
	}

	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	
	public String getOrderitem() {
		return orderitem;
	}

	public void setOrderitem(String orderitem) {
		this.orderitem = orderitem;
	}

	public static enum BILLSTAT {
		WAITPAY("WAIT_PAY", "等待还款"), SETTLE("SETTLE", "已还款"), DELAY("DELAY", "逾期")
		,CLOSE("CLOSE","已关闭"),REFUND("REFUND","已退款"),DELAYSETTLE("DELAYSETTLE","逾期已还")
		,NOACCOUNT("NOACCOUNT","未出账"),NOPAY("NOPAY","未消费"),PAYING("PAYING","还款中");

		private String value;
		private String text;

		private BILLSTAT(String value, String text) {
			this.value = value;
			this.text = text;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static enum BILLTYPE {
		ORDER("order", "商品账单"), LOAN("loan", "借你花账单"), CREDIT("credit", "信用账单"), 
		GRADU_LOAN("gradu_loan", "毕业金账单"), 
		GRADU_LOAN_FEE("gradu_loan_fee", "毕业金砍头费账单");

		private String value;
		private String text;

		private BILLTYPE(String value, String text) {
			this.value = value;
			this.text = text;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}
	// 订单信息
	private String orderid;// 订单id
	private Date ordercreatetime;// 下单时间
	private Long orderamount;// 商品价格
	private String ordertitle;// 商品名称
	private String orderitem;// 订单号

	// 分期信息
	private Long downPayment;// 首付
	private String isdelayed="0";// 是否已延期(1是,0否)
	private String iscandelay="0";//是否可延期(1可以,0不可以)
	private Date lastdelayDate;// 最后延期日期
	private String hasdelay="0";//往期是否有逾期
	
	private String nextIsAccount = "0";//后一期是否出账（0：未出账，1：已出账）
	
	private String oidBiz;//支付业务类型

	private Long postphoneAmount;//逾期费用
	private Long amtCoupon;//优惠券
	private Long amtReduce;//减免金额
	private Long amtDelay;//兼容2.0系统（专用）
	
	private Integer billOverDays;			//延期天数
	private Long billOverFee; //延期费用

	private Long postponeFee; //本期逾期费
	
	private int nodify_flag; //还款完成通知状态。0：通知成功。1：重复还款，需要人工处理
	private String nodify_code;
	private String nodify_msg; //通知失败原因. nodify_flag 为0时，该值为空
	

	private String billRepayType;
	
	public String getBillRepayType() {
		return billRepayType;
	}

	public void setBillRepayType(String billRepayType) {
		this.billRepayType = billRepayType;
	}
	/**
	 * @return the postponeFee
	 */
	public Long getPostponeFee() {
		return postponeFee;
	}

	/**
	 * @return the nodify_code
	 */
	public String getNodify_code() {
		return nodify_code;
	}

	/**
	 * @param nodify_code the nodify_code to set
	 */
	public void setNodify_code(String nodify_code) {
		this.nodify_code = nodify_code;
	}

	/**
	 * @param postponeFee the postponeFee to set
	 */
	public void setPostponeFee(Long postponeFee) {
		this.postponeFee = postponeFee;
	}
	
	public Long getPostphoneAmount() {
		return postphoneAmount;
	}

	/**
	 * @return the amtCoupon
	 */
	public Long getAmtCoupon() {
		return amtCoupon;
	}

	/**
	 * @param amtCoupon the amtCoupon to set
	 */
	public void setAmtCoupon(Long amtCoupon) {
		this.amtCoupon = amtCoupon;
	}

	/**
	 * @return the amtReduce
	 */
	public Long getAmtReduce() {
		return amtReduce;
	}

	/**
	 * @param amtReduce the amtReduce to set
	 */
	public void setAmtReduce(Long amtReduce) {
		this.amtReduce = amtReduce;
	}

	/**
	 * @return the amtDelay
	 */
	public Long getAmtDelay() {
		return amtDelay;
	}

	/**
	 * @param amtDelay the amtDelay to set
	 */
	public void setAmtDelay(Long amtDelay) {
		this.amtDelay = amtDelay;
	}

	/**
	 * @return the hasdelay
	 */
	public String getHasdelay() {
		return hasdelay;
	}

	/**
	 * @param hasdelay the hasdelay to set
	 */
	public void setHasdelay(String hasdelay) {
		this.hasdelay = hasdelay;
	}

	public void setPostphoneAmount(Long postphoneAmount) {
		this.postphoneAmount = postphoneAmount;
	}

	/**
	 * @return the iscandelay
	 */
	public String getIscandelay() {
		return iscandelay;
	}

	/**
	 * @return the oidBiz
	 */
	public String getOidBiz() {
		return oidBiz;
	}

	/**
	 * @param oidBiz the oidBiz to set
	 */
	public void setOidBiz(String oidBiz) {
		this.oidBiz = oidBiz;
	}

	/**
	 * @param iscandelay the iscandelay to set
	 */
	public void setIscandelay(String iscandelay) {
		this.iscandelay = iscandelay;
	}

	/**
	 * @return the downPayment
	 */
	public Long getDownPayment() {
		return downPayment;
	}

	/**
	 * @param downPayment
	 *            the downPayment to set
	 */
	public void setDownPayment(Long downPayment) {
		this.downPayment = downPayment;
	}

	/**
	 * @return the isdelayed
	 */
	public String getIsdelayed() {
		return isdelayed;
	}

	/**
	 * @param isdelayed
	 *            the isdelayed to set
	 */
	public void setIsdelayed(String isdelayed) {
		this.isdelayed = isdelayed;
	}

	
	public Date getSysDate() {
		return new Date();
	}

	public String getNextIsAccount() {
		return nextIsAccount;
	}

	public void setNextIsAccount(String nextIsAccount) {
		this.nextIsAccount = nextIsAccount;
	}
	

	

	/**
	 * @return the billOverDays
	 */
	public Integer getBillOverDays() {
		return billOverDays;
	}

	/**
	 * @param billOverDays the billOverDays to set
	 */
	public void setBillOverDays(Integer billOverDays) {
		this.billOverDays = billOverDays;
	}
	

	/**
	 * @return the billOverFee
	 */
	public Long getBillOverFee() {
		return billOverFee;
	}

	/**
	 * @param billOverFee the billOverFee to set
	 */
	public void setBillOverFee(Long billOverFee) {
		this.billOverFee = billOverFee;
	}

	
	
	public int getNodify_flag() {
		return nodify_flag;
	}

	public void setNodify_flag(int nodify_flag) {
		this.nodify_flag = nodify_flag;
	}

	public String getNodify_msg() {
		return nodify_msg;
	}

	public void setNodify_msg(String nodify_msg) {
		this.nodify_msg = nodify_msg;
	}

	public static enum BillSettleType {
        REPAY("repay","还款"),
        REFUND("refund","退款"),
        COLLECTION("collection","催款");

        private String value;
        private String text;

        private BillSettleType(String value,String text) {
            this.value = value;
            this.text = text;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

	public static enum VIRTUAL_BIZ {
		CREDIT_BIZ("credit_biz","信用账单"),
    	GRADU_LOAN_BIZ("gradu_loan_biz","毕业金账单"),
		GRADU_CREDIT_BIZ("gradu_credit_biz","毕业金和信用账单"),
		DAILY_LOAN_BIZ("daily_loan_biz","天天花"),
		GRAD_LOAN_MINI_BIZ("grad_loan_mini_biz","毕业金短期借贷");
        private String value;
        private String text;

        private VIRTUAL_BIZ(String value,String text) {
            this.value = value;
            this.text = text;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}