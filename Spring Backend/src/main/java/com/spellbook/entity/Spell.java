package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spell")
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
	public int getSpellId() {
		return spellId;
	}
	public void setSpellId(int spellId) {
		this.spellId = spellId;
	}
	public String getSpellName() {
		return spellName;
	}
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHigherLevel() {
		return higherLevel;
	}
	public void setHigherLevel(String higherLevel) {
		this.higherLevel = higherLevel;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getSpellRange() {
		return spellRange;
	}
	public void setSpellRange(String spellRange) {
		this.spellRange = spellRange;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isRitual() {
		return ritual;
	}
	public void setRitual(boolean ritual) {
		this.ritual = ritual;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public boolean isConcentration() {
		return concentration;
	}
	public void setConcentration(boolean concentration) {
		this.concentration = concentration;
	}
	public String getCastingTime() {
		return castingTime;
	}
	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
