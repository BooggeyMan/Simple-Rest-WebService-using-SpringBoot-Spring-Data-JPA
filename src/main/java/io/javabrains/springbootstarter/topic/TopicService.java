package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {


	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Spring Boot","Spring BootFramework","Spring Boot Framework Description")));


	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}

	
	public Topic  getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get(); //Streams And Lambda Expression
		 
		}


	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
		
	}
	

	
}
