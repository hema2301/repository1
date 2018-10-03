package com.matchzone.repository;

//import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.relationship.WorkedOn;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */

@Repository
public interface WorkedOnRepository extends Neo4jRepository<WorkedOn,Long>{
//	@Query("jkdsjkbds,")
//	public String save();

}
