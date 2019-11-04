package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subclass")
public class Subclass {

	@Id
	@Column(name = "subclassId")
	private int subclassId;
	@Column(name = "subclassName")
	private String subclassName;
	@Column(name = "url")
	private String url;
	public int getSubclassId() {
		return subclassId;
	}
	public void setSubclassId(int subclassId) {
		this.subclassId = subclassId;
	}
	public String getSubclassName() {
		return subclassName;
	}
	public void setSubclassName(String subclassName) {
		this.subclassName = subclassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
