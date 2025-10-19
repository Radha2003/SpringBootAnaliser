package com.example.demo.service;
import org.springframework.stereotype.Service;
import org.springframework,kafka.core.kafkatemplate;
import org.springframework.beans.factory.annotation.Autowired;
@service 
public class KafkaPublisher {
private final kafkaTemplate<string,string> kafkatemplate;
@Autowired 
public kafkapublisher(kafkatemplate<string,string>kafkatemplate) {
	this.kafkatemplate=kafkatemplate;
	
}



public void publish(String topic,String message) {
	this.kafkatemplate.send(topic,message);
	System.out.println("published message" +message +"to topic"+topic);
}
}

