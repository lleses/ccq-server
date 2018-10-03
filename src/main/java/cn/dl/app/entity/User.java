package cn.dl.app.entity;

/**
 * 用户
 */
public class User {

	/** ID */
	private Integer id;
	/** 电话 */
	private String phone;
	/** 用户自己的邀请码 */
	private String invitationCode;
	/** 邀请人ID */
	private Integer InvitePeopleId;

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

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public Integer getInvitePeopleId() {
		return InvitePeopleId;
	}

	public void setInvitePeopleId(Integer invitePeopleId) {
		InvitePeopleId = invitePeopleId;
	}

}
