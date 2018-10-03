package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.CertificationNode;
import com.matchzone.node.UserNode;

/*
 * Please note that this class is annotated with @RelationshipEntity annotation
 */

@RelationshipEntity(type="CertifiedIn")
public class CertifiedIn {
	
	/*
	 * Annotate with @StartNode and EndNode annotations,
	 * to specify/identify the start and end nodes
	 */

	//private String name;
	@StartNode
	UserNode user;
	@EndNode
	CertificationNode certi;
	
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
	
	public CertifiedIn() {
		super();
	}
	public CertificationNode getCerti() {
		return certi;
	}
	public void setCerti(CertificationNode certi) {
		this.certi = certi;
	}
	public CertifiedIn(UserNode user, CertificationNode certi) {
		super();
		this.user = user;
		this.certi = certi;
	}
	
	

}
