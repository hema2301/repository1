package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.ProjectNode;
import com.matchzone.node.UserNode;

/*
 * Please note that this class is annotated with @RelationshipEntity annotation
 */

@RelationshipEntity(type="WorkedOn")
public class WorkedOn {
	
	/*
	 * Annotate with @StartNode and EndNode annotations,
	 * to specify/identify the start and end nodes
	 */

//	private String name;
	@StartNode
	private UserNode user;
	@EndNode
	private ProjectNode projectNode;
	
	/*
	 * This class should have certain required fields
	 * This class should also contain the getters and setters for the fields along with the no-arg
	 * parameterized constructor and toString method. 
	 */
	
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	public ProjectNode getProjectNode() {
		return projectNode;
	}
	public void setProjectNode(ProjectNode projectNode) {
		this.projectNode = projectNode;
	}
	public WorkedOn() {
		super();
	}
	public WorkedOn(UserNode user, ProjectNode projectNode) {
		super();
		this.user = user;
		this.projectNode = projectNode;
	}
	

}
