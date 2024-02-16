
package com.brijframework.authorization.model.menus;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;
import com.brijframework.authorization.model.EOUserRole;
import com.brijframework.authorization.model.onboarding.EOUserOnBoarding;

@Document("ROLE_MENU_ITEM")
public class EORoleMenuItem extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Field(name = "IDEN_NO")
	private String idenNo;
	
	@Field(name = "OWNER_ID")
	private Long ownerId;

	@Field(name = "USER_ROLE_ID")
	private EOUserRole userRole;

	@Field(name = "MENU_ITEM_ID")
	private EOMenuItem menuItem;
	
	@Field(name = "MENU_GROUP_ID")
	private EORoleMenuGroup  roleMenuGroup;
	
	@Field(name = "IS_HOME_PAGE")
	private boolean homePage=false;

	@Field(name = "ON_BOARDING")
	private Boolean onBoarding;
	
	@Field(name = "ON_BOARDING_LEVEL")
	private Integer onBoardingLevel;
	
	@DBRef
	private List<EOUserOnBoarding> userOnBoardingList;
	
	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public EOUserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(EOUserRole userRole) {
		this.userRole = userRole;
	}

	public EOMenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(EOMenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public EORoleMenuGroup getRoleMenuGroup() {
		return roleMenuGroup;
	}

	public void setRoleMenuGroup(EORoleMenuGroup roleMenuGroup) {
		this.roleMenuGroup = roleMenuGroup;
	}

	public boolean isHomePage() {
		return homePage;
	}

	public void setHomePage(boolean homePage) {
		this.homePage = homePage;
	}

	public Boolean getOnBoarding() {
		if(onBoarding==null) {
			return false;
		}
		return onBoarding;
	}

	public void setOnBoarding(Boolean onBoarding) {
		this.onBoarding = onBoarding;
	}

	public Integer getOnBoardingLevel() {
		return onBoardingLevel;
	}

	public void setOnBoardingLevel(Integer onBoardingLevel) {
		this.onBoardingLevel = onBoardingLevel;
	}

	public List<EOUserOnBoarding> getUserOnBoardingList() {
		return userOnBoardingList;
	}

	public void setUserOnBoardingList(List<EOUserOnBoarding> userOnBoardingList) {
		this.userOnBoardingList = userOnBoardingList;
	}

	@Override
	public String toString() {
		return "EOUserRoleMenuItem [id=" + getId() + ", ownerId=" + ownerId + ", userRole=" + userRole + ", menuItem="
				+ menuItem + ", roleMenuGroup=" + roleMenuGroup + "]";
	}
	
	
}
