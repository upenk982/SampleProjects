package com.example.service.soap.endpoint;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.core.BusinessLogic;
import com.euc.hr.schemas.SubscriptionRequest;
import com.euc.hr.schemas.SubscriptionResponse;

/**
 * Handles subscription requests. 
 * <p>
 *<pre>
 * @Endpoint: similar to Spring MVC's @Controller. 
 * @PayloadRoot: similar to Spring MVC's @RequestMapping</pre>
 */
@Endpoint
public class SubscriptionEndpoint {
	
	@Autowired
	private BusinessLogic businessLogic;
	
	protected static Logger logger = Logger.getLogger("SubscriptionEndpoint");

	
	// The namespace of both request and response as declared in the XSD file
	public static final String NAMESPACE_URI = "http://euc.com/hr/schemas";

	// The local name of the expected request.
	public static final String REQUEST_LOCAL_NAME = "subscriptionRequest";

	/**
	 * Processes subscriptions. Actual processing is delegated to a business logic service
	 * <p>
	 * In order for this method to be triggered, the localPart and namespace must
	 * match from the incoming XML request. This is exactly similar to Spring MVC.
	 * <p>
	 * In Spring MVC, we declare:
	 * <pre>@RequestMapping(value = "/admin", method = RequestMethod.GET)</pre>
	 * <p>
	 * In Spring WS, we declare:
	 * <pre>@PayloadRoot(localPart = "myRequest", namespace = "http://my.domain.com...")</pre>
	 */
	@PayloadRoot(localPart = REQUEST_LOCAL_NAME, namespace = NAMESPACE_URI)
	@ResponsePayload
	public SubscriptionResponse processSubscription( @RequestPayload SubscriptionRequest subscriptionRequest) {
		System.out.println(subscriptionRequest.getEmail());
		return businessLogic.execute(subscriptionRequest);
	}
}