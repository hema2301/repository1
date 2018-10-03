package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.SkillNode;
import com.matchzone.node.UserNode;

/*
 * Please note that this class is annotated with @RelationshipEntity annotation
 */

@RelationshipEntity(type="Knows")

public class Knows {
	
	/*
	 * Annotate with @StartNode and EndNode annotations,
	 * to specify/identify the start and end nodes
	 */

	//private String name;
	@StartNode
	UserNode user;
	@EndNode
	SkillNode skill;
	
	/*
	 * This class should have certain required fields
	 * This class should also contain the getters and setters for the fields along with the no-arg
	 * parameterized constructor and toString method. 
	 */

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public Knows() {
		super();
	}

	public UserNode getUser() {
		return user;
	}

	public void setUser(UserNode user) {
		this.user = user;
	}

	public SkillNode getSkill() {
		return skill;
	}

	public void setSkill(SkillNode skill) {
		this.skill = skill;
	}

	public Knows( UserNode user, SkillNode skill) {
		super();
		//this.name = name;
		this.user = user;
		this.skill = skill;
	}

	

}
