package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "castingClass")
public class CastingClass {
	
	@Id
	@Column(name = "classId")
	private int castingClassId;
	@Column(name = "className")
	private String castingClassName;
	@Column(name = "url")
	private String url;
	public int getCastingClassId() {
		return castingClassId;
	}
	public void setCastingClassId(int castingClassId) {
		this.castingClassId = castingClassId;
	}
	public String getCastingClassName() {
		return castingClassName;
	}
	public void setCastingClassName(String castingClassName) {
		this.castingClassName = castingClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
