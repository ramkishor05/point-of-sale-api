package com.brijframework.authorization.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

public abstract class EOEntityObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Field(name = "ID")
	private Long id;
	
	@Field(name = "CREATED_UID")
	private String createdUid;
	
	@Field(name = "CREATED_AT")
	@CreatedDate
	private Date createdAt;
	
	@Field(name = "UPDATED_UID")
	private String updatedUid;

	@Field(name = "UPDATED_AT")
	@LastModifiedDate
	private Date updatedAt;
	
	@Field(name = "RECORD_STATUS")
	private Boolean recordState;
	
	@Field(name = "ORDER_SEQUENCE")
	private Float orderSequence;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedUid() {
		return createdUid;
	}

	public void setCreatedUid(String createdUid) {
		this.createdUid = createdUid;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedUid() {
		return updatedUid;
	}

	public void setUpdatedUid(String updatedUid) {
		this.updatedUid = updatedUid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getRecordState() {
		if(recordState==null) {
			recordState=false;
		}
		return recordState;
	}

	public void setRecordState(Boolean recordState) {
		this.recordState = recordState;
	}

	public Float getOrderSequence() {
		return orderSequence;
	}

	public void setOrderSequence(Float orderSequence) {
		this.orderSequence = orderSequence;
	}
	
}
