package org.nic.port.test;

import javax.xml.bind.annotation.XmlElement;



public class DocumentDetails {
    private VoyageDetails voyageDetails;
    //
    public DocumentDetails(VoyageDetails voyageDetails){
    	this.voyageDetails = voyageDetails;
    	
    }
    // getter and setter
    public VoyageDetails getVoyageDetails() {
        return voyageDetails;
    }
    @XmlElement(name="VoyageDetails")
    public void setVoyageDetails(VoyageDetails voyageDetails) {
        this.voyageDetails = voyageDetails;
    }
    //empty constructor for JAXB
    public DocumentDetails(){}
}
