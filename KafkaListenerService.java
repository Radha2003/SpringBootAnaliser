package com.example.demo.service;
import org.springframework,stereotype.Component;
   

@service

public class KafkaListenerService {
	@kafkaListener(topics="mytopic" groupid="mygroup")
	public void listen(String message)
	{System.out.println("received message:"+message);

}
