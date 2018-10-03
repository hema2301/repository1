package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.AcademicNode;
import com.matchzone.node.UserNode;

/*
 * Please note that this class is annotated with @RelationshipEntity annotation
 */

@RelationshipEntity(type="Holds")
public class Holds {
	
	/*
	 * Annotate with @StartNode and EndNode annotations,
	 * to specify/identify the start and end nodes
	 */

	
	//private String name;
	@StartNode
	private UserNode user;
	@EndNode
	private AcademicNode academicNode;
	
	/*
	 * This class should have certain required fields
	 * This class should also contain the getters and setters for the fields along with the no-arg
	 * parameterized constructor and toString method. 
	 */

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	public Holds(UserNode user, AcademicNode academicNode) {
		super();
		this.user = user;
		this.academicNode = academicNode;
	}
	public AcademicNode getAcademicNode() {
		return academicNode;
	}
	public void setAcademicNode(AcademicNode academicNode) {
		this.academicNode = academicNode;
	}
	public Holds() {
		super();
	}
	
	

}
