package com.matchzone.node;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class CityNode {
	
	
//	   private Long id;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	
	/*
	 * This class should have certain required fields
	 * The field name should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	 @Id 
	 //@GeneratedValue
	private String name;
	//private String level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getLevel() {
//		return level;
//	}
//	public void setLevel(String level) {
//		this.level = level;
//	}
	public CityNode( String name) {
		super();
		//this.id = id;
		this.name = name;
	//	this.level = level;
	}
	
}
