package org.swamhtetaung.messenger.services;

import java.util.ArrayList;
import java.util.List;

import org.swamhtetaung.messenger.models.Message;

public class MessageService {
	public List<Message> getAllMessages() {
		List<Message> messageList = new ArrayList<Message>();
		Message m1 = new Message(1L,"Jersey is good","Swam Htet Aung");
		Message m2 = new Message(1L,"JavaScript is good","Shinji");
	
		messageList.add(m1);
		messageList.add(m2);
		
		return messageList;
		
	}
}
