package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

	
	

	
	//getAllTopic
	//getTopic(String Id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
}
