package com.example.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.core.BusinessLogic;
import com.example.model.Test;
import com.euc.hr.schemas.SubscriptionRequest;
import com.euc.hr.schemas.SubscriptionResponse;


/**
 * Handles subscription requests. 
 * <p>
 *<pre>
 * @Controller: similar to Spring WS @Endpoint. 
 * @RequestMapping: similar to Spring WS @PayloadRoot</pre>
 */
@Controller
@RequestMapping(value="/exampleService")
public class SubscriptionController {
		
	
		@Autowired
		private BusinessLogic businessLogic;
		
		
		protected static Logger logger = Logger.getLogger("SubscriptionController");
		
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
		
		
		@RequestMapping(value="/postSubscription", method = RequestMethod.POST)
		public @ResponseBody SubscriptionResponse postSubscription(@RequestBody SubscriptionRequest request){	
			return businessLogic.execute(request);
		}
		
		@RequestMapping(value="/postTest", method = RequestMethod.POST)
		public @ResponseBody SubscriptionRequest postTest(@RequestBody SubscriptionRequest request){
			request.setName("fdsfdsffd");
			return request;
			//return businessLogic.execute(request);
		}
		
		@RequestMapping(value="/getSubscription", method = RequestMethod.GET,headers="Accept=application/json,application/xml")
		public @ResponseBody SubscriptionResponse getSubscription(@RequestParam("id") String id, @RequestParam("name") String name,@RequestParam("email") String email)   {
			SubscriptionRequest request = new SubscriptionRequest();
			request.setId(id);
			request.setName(name);
			request.setEmail(email);	
			return businessLogic.execute(request);
		}
}
