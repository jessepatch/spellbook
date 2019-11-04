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
}
