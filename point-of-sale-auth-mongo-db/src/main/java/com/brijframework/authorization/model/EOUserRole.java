package com.brijframework.authorization.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.headers.EORoleHeaderItem;
import com.brijframework.authorization.model.menus.EORoleMenuGroup;
import com.brijframework.authorization.model.menus.EORoleMenuItem;

@Document("USER_ROLE")
public class EOUserRole extends EOEntityObject{

	private static final long serialVersionUID = 1L;

	@Field(name = "POSITION")
	private int position;

	@Field(name = "ROLE_NAME")
	private String roleName;

	@Field(name = "ROLE_ID")
	private String roleId;
	
	@Field(name = "ROLE_TYPE")
	private String roleType;

	@DBRef
	private List<EOUserAccount> userAccounts;
	
	@DBRef
	private List<EORoleMenuGroup> roleMenuGroups;

	@DBRef
	private List<EORoleMenuItem> roleMenuItems;
	
	@DBRef
	private List<EORoleHeaderItem> roleHeaderItems;
	
	public EOUserRole() {
	}

	public EOUserRole(int position, String roleName, String roleId) {
		super();
		this.position = position;
		this.roleName = roleName;
		this.roleId = roleId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleID) {
		this.roleId = roleID;
	}
	
	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public List<EOUserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(List<EOUserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	public List<EORoleMenuGroup> getRoleMenuGroups() {
		return roleMenuGroups;
	}

	public void setRoleMenuGroups(List<EORoleMenuGroup> roleMenuGroups) {
		this.roleMenuGroups = roleMenuGroups;
	}

	public List<EORoleMenuItem> getRoleMenuItems() {
		return roleMenuItems;
	}

	public void setRoleMenuItems(List<EORoleMenuItem> roleMenuItems) {
		this.roleMenuItems = roleMenuItems;
	}

	public List<EORoleHeaderItem> getRoleHeaderItems() {
		return roleHeaderItems;
	}

	public void setRoleHeaderItems(List<EORoleHeaderItem> roleHeaderItems) {
		this.roleHeaderItems = roleHeaderItems;
	}

	@Override
	public String toString() {
		return "EOUserRole [id=" + getId() + ", position=" + position + ", roleName=" + roleName + ", roleID=" + roleId;
	}
	
}
