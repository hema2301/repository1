package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class UserNode {

	/*
	 * This class should have certain required fields
	 * The field profileId should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	@Id
	private String profileId;

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public UserNode(String profileId) {
		super();
		this.profileId = profileId;

	}

}
