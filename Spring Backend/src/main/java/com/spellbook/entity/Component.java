package com.spellbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "component")
public class Component {

	@Id
	@Column(name = "component")
	private int componentId;
	@Column(name = "componentSymbol")
	private char componentSymbol;
	@Column(name = "componentName")
	private String componentName;
	public int getComponentId() {
		return componentId;
	}
	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	public char getComponentSymbol() {
		return componentSymbol;
	}
	public void setComponentSymbol(char componentSymbol) {
		this.componentSymbol = componentSymbol;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
}
