
package com.brijframework.authorization.model;
import java.util.List;

import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.onboarding.EOUserOnBoarding;

@Document("USER_ACCOUNT")
public class EOUserAccount extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Field(name = "USERNAME")
	@Indexed(unique = true)
	private String username;

	@Field(name = "PASSWORD")
	private String password;

	@Field(name = "ACCOUNT_NAME")
	private String accountName;
	
	@Field(name = "ACCOUNT_MOBILE")
	private String registeredMobile;
	
	@Field(name = "ACCOUNT_EMAIL")
	private String registeredEmail;

	@Field(name = "TYPE")
	private String type;
	
	@Field(name = "OWNER_ID")
	private Long ownerId;

	@Field(name = "ROLE_ID")
	@Reference
	private EOUserRole userRole;

	@Field(name = "PROFILE_ID")
	@DBRef
	private EOUserProfile userProfile;
	
	@Field(name = "ON_BOARDING")
	private Boolean onBoarding;
	
	@DBRef
	private List<EOUserOnBoarding> onBoardingList;
	
	public void init() {
		onBoarding=true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegisteredMobile() {
		return registeredMobile;
	}

	public void setRegisteredMobile(String registeredMobile) {
		this.registeredMobile = registeredMobile;
	}

	public String getRegisteredEmail() {
		return registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public EOUserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(EOUserRole userRole) {
		this.userRole = userRole;
	}

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getOnBoarding() {
		return onBoarding;
	}

	public void setOnBoarding(Boolean onBoarding) {
		this.onBoarding = onBoarding;
	}
	
	public List<EOUserOnBoarding> getOnBoardingList() {
		return onBoardingList;
	}

	public void setOnBoardingList(List<EOUserOnBoarding> onBoardingList) {
		this.onBoardingList = onBoardingList;
	}

	@Override
	public String toString() {
		return "EOUserLogin [id=" + getId() + ", username=" + username + ", password=" + password + ", accountName="
				+ accountName + ", type=" + type + ", userRole=" + userRole + ", userProfile=" + userProfile + "]";
	}
	
	

}
