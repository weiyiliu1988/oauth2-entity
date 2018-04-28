package cn.com.studyshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 
 * @author LIU
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = 5086743462417174273L;
	private Integer userid;
	private String username;
	private String email;
	private String phone;
	private String imagesrc;
	private String userpass;
	private String reserve;
	private Date updatedate;
	private Date createdate;
	private Integer updatecnt;
	private String updateuser;
	private String createuser;
	private Boolean status;
	private Integer logincount;
	private String remak;

	public User() {
		super();
	}

	public User(String username, String imagesrc) {
		super();
		this.username = username;
		this.imagesrc = imagesrc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImagesrc() {
		return imagesrc;
	}

	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getUpdatecnt() {
		return updatecnt;
	}

	public void setUpdatecnt(Integer updatecnt) {
		this.updatecnt = updatecnt;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public String getCreateuser() {
		return createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getLogincount() {
		return logincount;
	}

	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}

	public String getRemak() {
		return remak;
	}

	public void setRemak(String remak) {
		this.remak = remak;
	}
}
