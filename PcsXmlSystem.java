package org.nic.port.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;

public class PcsXmlSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  //         
	        VoyageDetails voyageDetails = new VoyageDetails("A","VCNNUMBER00101", "IMONUM0005", "VESCODE005", "VOYNUM0005", "TYP0FVES", "SACODE00005", "MAINLINEOCODE05", "TERMINALOCODE05", "PCODE5", "25052007", 28062007, "SERVNAME05", 04052007);

	        
	        //
	        ReceivingPartyDetails receivingPartyDetails = new ReceivingPartyDetails();
	        
	        List<String> receivingParty = new ArrayList<String>();
	        receivingParty.add("RECP001");
	        receivingParty.add("RECP002");
	        receivingPartyDetails.setReceivingParty(receivingParty);
	       
	        //
	        NotifyPartyDetails notifyPartyDetails = new NotifyPartyDetails();
	        List<String> notifyParty = new ArrayList<String>();
	       notifyParty.add("NOTIFR001");
	       notifyParty.add("NOTIFR002");
	       notifyPartyDetails.setNotifyParty(notifyParty);
	        
	        //
	       
	      
	        DocumentExchangeDetails documentExchangeDetails = new DocumentExchangeDetails(notifyPartyDetails,receivingPartyDetails);
	        //
	        
	        DocumentReference documentReference = new DocumentReference();
	        documentReference.setDocumentType("CALINV");
	        documentReference.setCommonRefNumber("PCS30060515000001");
	        documentReference.setDocumentNumber(300600);
	        documentReference.setSenderID("SENDER003");
	        documentReference.setMessageType(9);
	        documentReference.setDocumentName("ALLOTMENTOFVCN");
	        
	        //
	        DocumentSummary documentSummary = new DocumentSummary();
	        documentSummary.setIssuedDateTime(31032023);
	    DocumentHeader documentHeader = new DocumentHeader(documentReference, documentExchangeDetails);
		
		DocumentDetails documentDetails  = new DocumentDetails(voyageDetails);
		VesselCallNumber vesselCallNumber = new VesselCallNumber(documentHeader,documentSummary,documentDetails); // Parameter field may be required in case of any changes  
		// getter and setter method 
		
	
		// calling required classes and methods 
		
		
		
		//writing xml file 
		try{
			Marshall.marshal(vesselCallNumber, new File("E:/Admin/CALINV.xml"));
			System.out.println("Xml File Created Successfully");
		} catch(IOException ioe){
			System.out.println("File Cannot be created :"+ioe);
		} catch(JAXBException je){
			System.out.println("Message cannot be converted to xml :"+je);
			
		}
		

	}

}
