package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class AcademicNode {
	
	/*
	 * This class should have certain required fields
	 * The field courseName should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	@Id
	//private Long id;
	private String courseName;
	//private String criteria;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
//	public String getCriteria() {
//		return criteria;
//	}
//	public void setCriteria(String criteria) {
//		this.criteria = criteria;
//	}
	public AcademicNode(String courseName) {
		super();
		//this.id = id;
		this.courseName = courseName;
	//	this.criteria = criteria;
	}
	
	

}
