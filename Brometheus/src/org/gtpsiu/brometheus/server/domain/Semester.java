package org.gtpsiu.brometheus.server.domain;

public enum Semester {
	SPRING("Spring"),
	SUMMER("Summer"),
	FALL("Fall");
	
	private String name;
	
	private Semester(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static Semester getByName(String name) {
		for (Semester sem : values()) {
			if (sem.getName().equalsIgnoreCase(name)) {
				return sem;
			}
		}
		return null;
	}

}
