package com.brijframework.authorization.model.menus;

import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;

@Document("MENU_GROUP")
public class EOMenuGroup extends EOEntityObject{

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
	
	@DBRef
	private List<EOMenuItem>  menuItemList;

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

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

	public List<EOMenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(List<EOMenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public String toString() {
		return "EOMenuGroup [id=" + getId() + ", idenNo=" + idenNo + ", title=" + title + ", url=" + url + ", type=" + type
				+ ", icon=" + icon + ", order=" + order + "]";
	}
	
	
}
