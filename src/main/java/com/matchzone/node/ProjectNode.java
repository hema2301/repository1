package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class ProjectNode {
	
	/*
	 * This class should have certain required fields
	 * The field projectName should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	@Id
	
	private String projectName;
	//private String projectDuration;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public ProjectNode( String projectName) {
		super();
		//this.id = id;
		this.projectName = projectName;
		//this.projectDuration = projectDuration;
	}
	
	

}
