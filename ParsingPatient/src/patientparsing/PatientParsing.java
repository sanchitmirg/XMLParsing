package patientparsing;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PatientParsing {
	
	PatientParsing(){
		
			try{
				
				//inputting the file that we need to parse
				File inputFile = new File("patient.txt");
				
				//creating one instance of document builder factory
				DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
				
				//creating document builder
				DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
				
				//parsing the file into a document
				Document doc = dbBuilder.parse(inputFile);
				
				//this will return the root element but it will not return the name of the root element
				doc.getDocumentElement();
				
				//printing the root node of the file ie class. Getnodename will return the name of the root element
				System.out.println("Root Element is: "+doc.getDocumentElement().getNodeName());
				
				NodeList nList = doc.getChildNodes();
				
				for (int temp = 1; temp < nList.getLength(); temp++){
					
					Node nNode = nList.item(temp);
					
					System.out.println("\nCurrent Element is: "+nNode.getNodeName());
					
					Element eElement = (Element)nNode;
					
					System.out.println(eElement.getTagName());
				}
				
			}catch(Exception e){
			
				e.printStackTrace();
			}
	}

	
	public static void main(String[] args) {
		
		//creating an instance of Dbwork which will create a DB connectio with Database
		//Dbwork Dbconnectin = new Dbwork();
		
		//creating an instance of PatientParsing, in constructor patient file is passed.
		PatientParsing p = new PatientParsing();

	}

}
