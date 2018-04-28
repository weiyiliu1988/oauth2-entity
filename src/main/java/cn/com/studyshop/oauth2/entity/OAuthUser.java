package cn.com.studyshop.oauth2.entity;

import java.io.Serializable;
import java.util.List;

import cn.com.studyshop.entity.Owner;
import cn.com.studyshop.entity.Role;
import cn.com.studyshop.entity.SystemInfo;
import cn.com.studyshop.entity.User;

/**
 * 用户信息保护资源
 * 
 * 
 * @author LIU
 *
 */
public class OAuthUser implements Serializable {

	private static final long serialVersionUID = 1L;
	private User user;
	// 系统管理
	private List<SystemInfo> systeminfolist;
	// 用户角色
	private List<Role> rolelist;
	// 货主管理
	private List<Owner> ownerlist;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<SystemInfo> getSysteminfolist() {
		return systeminfolist;
	}

	public void setSysteminfolist(List<SystemInfo> systeminfolist) {
		this.systeminfolist = systeminfolist;
	}

	public List<Role> getRolelist() {
		return rolelist;
	}

	public void setRolelist(List<Role> rolelist) {
		this.rolelist = rolelist;
	}

	public List<Owner> getOwnerlist() {
		return ownerlist;
	}

	public void setOwnerlist(List<Owner> ownerlist) {
		this.ownerlist = ownerlist;
	}

}
