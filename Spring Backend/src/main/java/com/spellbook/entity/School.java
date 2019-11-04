package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {
	
	@Id
	@Column(name = "schoolId")
	private int schoolId;
	@Column(name = "schoolName")
	private String schoolName;
	@Column(name = "url")
	private String url;
}
