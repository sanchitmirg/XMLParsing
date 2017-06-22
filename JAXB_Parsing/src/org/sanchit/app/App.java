package org.sanchit.app;

import org.sanchit.modals.HeaderType;
import org.sanchit.modals.MessageType;
import org.sanchit.unmarshalling.Util;

public class App {

	
	public static void main(String[] args) {
		
		System.out.println("################Reading from XML##############");
		
		Util util = new Util();
		
		MessageType msg= util.getRootElement("msg173001.xml");
		
		HeaderType header = msg.getHeader();
		
		Header headOfMessage = new Header();
		headOfMessage.headerData(header);
		
	}

}
