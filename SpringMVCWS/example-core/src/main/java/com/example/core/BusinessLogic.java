package com.example.core;

import com.euc.hr.schemas.SubscriptionRequest;
import com.euc.hr.schemas.SubscriptionResponse;

public interface BusinessLogic {
	
	public SubscriptionResponse execute(SubscriptionRequest subscriptionRequest);

}
