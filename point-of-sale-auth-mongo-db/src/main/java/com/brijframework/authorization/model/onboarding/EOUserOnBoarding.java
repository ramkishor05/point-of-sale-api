package com.brijframework.authorization.model.onboarding;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;
import com.brijframework.authorization.model.EOUserAccount;
import com.brijframework.authorization.model.menus.EORoleMenuItem;

@Document("USER_ONBOARDING")
public class EOUserOnBoarding  extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Field(name = "USER_ACCOUNT_ID")
	private EOUserAccount userAccount;

	@Field(name = "ROLE_MENU_ITEM_ID")
	private EORoleMenuItem roleMenuItem;
		
	@Field(name = "ON_BOARDING_STATUS")
	private Boolean onBoardingStatus;
	
	@Field(name = "ON_BOARDING_LEVEL")
	private Integer onBoardingLevel;
	
	public void init() {
		onBoardingStatus=false;
	}

	public EOUserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(EOUserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public EORoleMenuItem getRoleMenuItem() {
		return roleMenuItem;
	}

	public void setRoleMenuItem(EORoleMenuItem roleMenuItem) {
		this.roleMenuItem = roleMenuItem;
	}

	public Boolean getOnBoardingStatus() {
		if(onBoardingStatus==null) {
			return false;
		}
		return onBoardingStatus;
	}

	public void setOnBoardingStatus(Boolean onBoardingStatus) {
		this.onBoardingStatus = onBoardingStatus;
	}

	public Integer getOnBoardingLevel() {
		return onBoardingLevel;
	}

	public void setOnBoardingLevel(Integer onBoardingLevel) {
		this.onBoardingLevel = onBoardingLevel;
	}
}
