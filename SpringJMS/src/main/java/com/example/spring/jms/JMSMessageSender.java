package com.example.spring.jms;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.xml.bind.JAXBException;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.euc.hr.schemas.SubscriptionRequest;
  
public interface JMSMessageSender {
  

  /**
   * send text to default destination
   * @param text
   */
  public void send(final String text);
    
  /**
   * Simplify the send by using convertAndSend
   * @param text
   */
  public void sendText(final String text);
    
  /**
   * Send text message to a specified destination
   * @param text
   */
  public void send(final Destination dest,final String text);
  
  public void send(SubscriptionRequest request) throws JAXBException;
  
}