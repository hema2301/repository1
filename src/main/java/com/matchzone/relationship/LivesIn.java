package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.CityNode;
import com.matchzone.node.UserNode;

/*
 * Please note that this class is annotated with @RelationshipEntity annotation
 */

@RelationshipEntity(type="LivesIn")
public class LivesIn {
	
	/*
	 * Annotate with @StartNode and EndNode annotations,
	 * to specify/identify the start and end nodes
	 */
	
	//private String name;
	@StartNode
	UserNode user;
	
	@EndNode
	CityNode city;
	
	/*
	 * This class should have certain required fields
	 * This class should also contain the getters and setters for the fields along with the no-arg
	 * parameterized constructor and toString method. 
	 */

//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public UserNode getUser() {
		return user;
	}

	public void setUser(UserNode user) {
		this.user = user;
	}

	public CityNode getCity() {
		return city;
	}

	public void setCity(CityNode city) {
		this.city = city;
	}

	public LivesIn(UserNode user, CityNode city) {
		super();
		this.user = user;
		this.city = city;
	}

	

	
	
}
