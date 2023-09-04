package org.swamhtetaung.messenger.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.swamhtetaung.messenger.database.DatabaseClass;
import org.swamhtetaung.messenger.models.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessage();
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(Long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		message.setCreated_at(new Date());
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() < 0) {
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message deleteMessage(Long id) {
		return messages.remove(id);
	}
}
