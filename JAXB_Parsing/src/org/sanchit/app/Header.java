package org.sanchit.app;

import org.sanchit.modals.HeaderType;
import org.sanchit.modals.HeaderType.From;
import org.sanchit.modals.HeaderType.To;
import org.sanchit.modals.SecurityType;

public class Header {
	
	To to;
	From from;
	String messageID;
	String relatesToMessageID;
	String sentTime;
	SecurityType security;
	String mailbox;
	String testMessage;
	String rxReferenceNumber;
	String tertiaryIdentifier;
	String prescriberOrderNumber;
	
	public void headerData(HeaderType header){
		
		to = header.getTo();
		from = header.getFrom();
		messageID = header.getMessageID();
		relatesToMessageID = header.getRelatesToMessageID();
		security = header.getSecurity();
		rxReferenceNumber = header.getRxReferenceNumber();
		tertiaryIdentifier = header.getTertiaryIdentifier();
		prescriberOrderNumber = header.getPrescriberOrderNumber();
		
		System.out.println("Message to NABP: "+to.getValue());
		System.out.println("MessageID: "+messageID);
		System.out.println("prescriberOrderNumber: "+prescriberOrderNumber);
		
	}

}
