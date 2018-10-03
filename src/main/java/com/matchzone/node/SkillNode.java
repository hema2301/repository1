package com.matchzone.node;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class SkillNode {
	

	// @GeneratedValue
	  // private Long id;
	
	/*
	 * This class should have certain required fields
	 * The field name should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	 @Id 
	 private String name;

//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public SkillNode( String name) {
		super();
		//this.id = id;
		this.name = name;
		
	}
	
	

}
