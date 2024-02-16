package com.brijframework.authorization.model.menus;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;
import com.mongodb.lang.NonNull;

@Document("MENU_ITEM")
public class EOMenuItem extends EOEntityObject {

	private static final long serialVersionUID = 1L;

	@Field(name = "IDEN_NO")
	@Indexed(unique = true)
	private String idenNo;
	
	@Field(name = "TITLE")
	private String title;

	@Field(name = "URL")
	private String url;
	
	@Field(name = "TYPE")
	private String type;
	
	@Field(name = "ICON")
	private String icon;
	
	@Field(name = "ORDER_SQN")
	private Integer order;
	
	@Field(name = "ON_BOARDING")
	@NonNull
	private Boolean onBoarding;
	
	@Field(name = "MENU_GROUP_ID")
	private EOMenuGroup  menuGroup;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
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

	public EOMenuGroup getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(EOMenuGroup menuGroup) {
		this.menuGroup = menuGroup;
	}

	@Override
	public String toString() {
		return "EOMenuItem [id=" + getId() + ", idenNo=" + idenNo + ", title=" + title + ", url=" + url + ", type=" + type
				+ ", icon=" + icon + ", order=" + order + ", menuGroup=" + menuGroup + "]";
	}
}
