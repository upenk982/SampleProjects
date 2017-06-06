package com.example.spring.jms.impel;

import javax.jms.BytesMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.stereotype.Service;

@Service
public class JMSMessageListenerImpel implements MessageListener{

	public void onMessage(Message arg0) {
		
		try{
			if(arg0 instanceof TextMessage){
				TextMessage message = (TextMessage)arg0;
				System.out.println(message.getText());
			}
			else if(arg0 instanceof ObjectMessage){
				System.out.println((ObjectMessage)arg0);
			}
			else if(arg0 instanceof BytesMessage){
				System.out.println(((BytesMessage)arg0));
			}
			else{
				System.out.println("not TextMessage, ObjectMessage, or BytesMessage");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
