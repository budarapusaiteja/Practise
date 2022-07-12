package com.sample.sampledata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tab {
	@Id
	private Integer id;
	private String name;
	public Tab(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Table [id=" + id + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
