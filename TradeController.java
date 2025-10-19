package com.example.demo.Controller;

import com.example.demo.model.kafkaListenerService;
import com.example.demo.service.TradeService;

@controller  
public class TradeController {
	private TradeService tradeservice
	
	public void processTrade() {
		String tradeData=kafkaListenerService.listen();
		tradeservice.processTrade(tradeData);
	
	
	}
	
	
}	
	
	
