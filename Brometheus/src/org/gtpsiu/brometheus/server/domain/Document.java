package org.gtpsiu.brometheus.server.domain;

import java.util.List;

public class Document {
	private Course course;
	private Integer documentId;
	private String title;
	private List<Tag> tags;
	
	public Document() {
		
	}
	
	public Document(Integer id) {
		this.documentId = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
