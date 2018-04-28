package cn.com.studyshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 单点登录用户管理货主权限 货主实体类
 * 
 * @author LIU
 *
 */
public class Owner implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String owner;
	private String cnname;
	private String enname;
	private String ownerinfo;
	private String ownerlevel;
	private String createuser;
	private String updateuser;
	private Date updatedate;
	private Date createdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCnname() {
		return cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	public String getEnname() {
		return enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getOwnerinfo() {
		return ownerinfo;
	}

	public void setOwnerinfo(String ownerinfo) {
		this.ownerinfo = ownerinfo;
	}

	public String getOwnerlevel() {
		return ownerlevel;
	}

	public void setOwnerlevel(String ownerlevel) {
		this.ownerlevel = ownerlevel;
	}

	public String getCreateuser() {
		return createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
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

}
