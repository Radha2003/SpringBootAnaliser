package com.example.demo.service;

import java.util.StringTokenizer;
@Component message;
public class TradeService {
	public String[] processTrade(String message)
	
	{  String[] str1=new String[3];
	int i=0;
		StringTokenizer token=new StringTokenizer(str,",");
		while (token.hasMoreTokens())
		{
			
			str1[i++]=token.nextToken();
		}
	}	
		
		public Trade   getTrade()
		{
			return CanonicalTrade(str[0],str[1],str[2]);
			}
		
	}
	
	
	

}
