package com.example.spring.jms.impel;
import java.io.StringWriter;
import java.io.Writer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.euc.hr.schemas.SubscriptionRequest;
import com.example.spring.jms.JMSMessageSender;
  
@Service
public class JMSMessageSenderImpel implements JMSMessageSender{
  
  @Autowired
  private JmsTemplate jmsTemplate;
  
  private JAXBContext jaxbContext; 
    
    
  /**
   * send text to default destination
   * @param text
   */
  public void send(final String text) {
      
    this.jmsTemplate.send(new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createTextMessage(text);     
        //set ReplyTo header of Message, pretty much like the concept of email.
        message.setJMSReplyTo(new ActiveMQQueue("Recv2Send"));
        return message;
      }
    });
  }
  /**
   * send String with the SubscriptionRequest object xml
   */
  public void send(SubscriptionRequest request) throws JAXBException{
	  jaxbContext = JAXBContext.newInstance("com.euc.hr.schemas");
	  Marshaller m = jaxbContext.createMarshaller();
	  Writer writer = new StringWriter();
	  m.marshal(request, writer);
	  jmsTemplate.convertAndSend(writer.toString());
  }
    
  /**
   * Simplify the send by using convertAndSend
   * @param text
   */
  public void sendText(final String text) {
    this.jmsTemplate.convertAndSend(text);
  }
    
  /**
   * Send text message to a specified destination
   * @param text
   */
  public void send(final Destination dest,final String text) {
      
    this.jmsTemplate.send(dest,new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createTextMessage(text);
        return message;
      }
    });
  }
}