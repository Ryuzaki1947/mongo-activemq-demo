package com.example.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Component
public class JMSmsg {
	@Autowired
	private ApplicationContext context;
	
	private static final String MESSAGE_QUEUE = "User_queue";
	
	void sender(User user)
	{
		JmsTemplate jmsTemplate=context.getBean(JmsTemplate.class);
		
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, user);
	}
	
}
