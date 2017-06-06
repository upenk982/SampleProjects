package com.example.spring.jms;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.euc.hr.schemas.SubscriptionRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-jms-sender.xml")
public class JMSMessageSenderTest {
	
	@Autowired
	private JMSMessageSender jmsMessageSender;

	//@Test
	public void testSendText() {
		jmsMessageSender.send("Hello World");
	}
	
	@Test
	public void testSendSubscriptionRequestText() throws JAXBException {
		SubscriptionRequest request = new SubscriptionRequest();
		request.setEmail("upenk981@gmail.com");
		request.setId("3432434");
		request.setName("Upen Kumar");
		jmsMessageSender.send(request);
	}
}
