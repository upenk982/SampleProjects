package com.example.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.core.BusinessLogic;
import com.euc.hr.schemas.SubscriptionRequest;
import com.euc.hr.schemas.SubscriptionResponse;

@Service
public class BusinessLogicImpl implements BusinessLogic{
	
	protected static Logger logger = Logger.getLogger("BusinessLogicImpl");

	@Override
	public SubscriptionResponse execute(SubscriptionRequest subscriptionRequest) {
		try {
			logger.debug("Received subscription request");
			
			SubscriptionResponse response = new SubscriptionResponse();
			response.setCode("SUCCESS");
			response.setDescription("User has been subscribed");
			
			logger.debug("Success in subscribing");
			// Return response
			return response;

		} catch (Exception e) {
			logger.error("Problem with subscription request");

			// Return response
			SubscriptionResponse response = new SubscriptionResponse();
			response.setCode("FAILURE");
			response.setDescription("Problem with subscription request");
			
			return response;
		}
	}

}
