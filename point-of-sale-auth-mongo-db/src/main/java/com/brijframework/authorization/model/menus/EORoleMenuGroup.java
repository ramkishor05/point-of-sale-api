
package com.brijframework.authorization.model.menus;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;
import com.brijframework.authorization.model.EOUserRole;

@Document("ROLE_MENU_GROUP")
public class EORoleMenuGroup extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Field(name = "IDEN_NO")
	private String idenNo;

	@Field(name = "USER_ROLE_ID")
	private EOUserRole userRole;

	@Field(name = "MENU_GROUP_ID")
	private EOMenuGroup menuGroup;

	@DBRef
	private List<EORoleMenuItem> roleMenuItems;
		
	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public EOUserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(EOUserRole userRole) {
		this.userRole = userRole;
	}

	public EOMenuGroup getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(EOMenuGroup menuGroup) {
		this.menuGroup = menuGroup;
	}

	public List<EORoleMenuItem> getRoleMenuItems() {
		return roleMenuItems;
	}

	public void setRoleMenuItems(List<EORoleMenuItem> roleMenuItems) {
		this.roleMenuItems = roleMenuItems;
	}

	@Override
	public String toString() {
		return "EORoleMenuGroup [id=" + getId() + ", userRole=" + userRole + ", menuGroup=" + menuGroup + "";
	}

	
}
