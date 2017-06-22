package org.sanchit.unmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.sanchit.modals.MessageType;

public class Util {
	
	public MessageType getRootElement(String xmlPath){
		
		MessageType message = null;
		
		try{
		
			File file = new File(xmlPath);
			JAXBContext jaxbContext = JAXBContext.newInstance(MessageType.class);
			
			Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
			message = (MessageType) jaxbunmarshaller.unmarshal(file);
			
		}catch(JAXBException e){
			e.printStackTrace();
		}
		
		return message;
	}

}
