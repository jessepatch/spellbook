package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Spell")
public class Spell {

	@Id
	@Column(name = "spellId")
	private int spellId;
	@Column(name = "spellName")
	private String spellName;
	@Column(name = "description")
	private String description;
	@Column(name = "higherLevel")
	private String higherLevel;
	@Column(name = "page")
	private String page;
	@Column(name = "spellRange")
	private String spellRange;
	@Column(name = "material")
	private String material;
	@Column(name = "ritual")
	private boolean ritual;
	@Column(name = "duration")
	private String duration;
	@Column(name = "concentration")
	private boolean concentration;
	@Column(name = "castingTime")
	private String castingTime;
	@Column(name = "level")
	private int level;
	@Column(name = "url")
	private String url;
}
