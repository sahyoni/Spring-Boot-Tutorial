package de.spring.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("id1", "name1", "description1"),new Topic("id2", "name2", "description2"),new Topic("id3", "name3", "description3")));
	
	public Iterable<Topic> getAllTopic(){
		topicRepository.save(topics.get(0));
		return topicRepository.findAll();
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
