package com.example.whiteboardfall2018serverjava.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.whiteboardfall2018serverjava.models.Topic;

public interface TopicRepository
	extends CrudRepository<Topic, Integer>{

}

/*
	INSERT INTO topic (title) VALUES ('Topic AAA');
	INSERT INTO topic (title) VALUES ('Topic BBB');
	INSERT INTO widget (title, topic_id) VALUES ('Widget 111', 1);
	INSERT INTO widget (title, topic_id) VALUES ('Widget 222', 1);
*/