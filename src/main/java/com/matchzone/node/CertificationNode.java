package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/*
 * Please note that this class is annotated with @NodeEntity annotation
 */

@NodeEntity
public class CertificationNode {
	
	/*
	 * This class should have certain required fields
	 * The field certificateName should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. 
	 */

	@Id
	//private Long id;
	private String certificateName;
	//private String certificateLicense;
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public CertificationNode(String certificateName) {
		super();
	
		this.certificateName = certificateName;
		
	}
	

}
