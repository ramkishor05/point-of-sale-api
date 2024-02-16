package com.brijframework.authorization.model.headers;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.brijframework.authorization.model.EOEntityObject;
import com.brijframework.authorization.model.EOUserRole;

@Document("ROLE_HEADER_ITEM")
@CompoundIndexes({
    @CompoundIndex(name = "age_idx", def = "{'USER_ROLE_ID': 1, 'HEADER_ITEM_ID': -1}")
})
public class EORoleHeaderItem extends EOEntityObject {

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
	
	@Field(name = "HEADER_ITEM_ID")
	private EOHeaderItem headerItem;

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

	public EOHeaderItem getHeaderItem() {
		return headerItem;
	}

	public void setHeaderItem(EOHeaderItem headerItem) {
		this.headerItem = headerItem;
	}
}
