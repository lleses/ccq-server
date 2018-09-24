package cn.dl.app.entity;

/**
 * 用户
 */
public class User {

	/** ID */
	private Integer id;
	/** 电话 */
	private String phone;
	/** 邀请码 */
	private Integer invitationCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(Integer invitationCode) {
		this.invitationCode = invitationCode;
	}

}
