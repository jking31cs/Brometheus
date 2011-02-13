package org.gtpsiu.brometheus.server.domain;

public class Tag {
	private Integer tagId;
	private String string;
	
	public Tag() {

	}
	
	public Tag(Integer id) {
		this.tagId = id;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
	

}
