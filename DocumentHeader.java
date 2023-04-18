package org.nic.port.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlType(propOrder={"documentReference","documentExchangeDetails"})
public class DocumentHeader {
	private DocumentExchangeDetails documentExchangeDetails;
    private DocumentReference documentReference;
    public DocumentExchangeDetails getDocumentExchangeDetails() {
        return documentExchangeDetails;
    }
    //
    public DocumentHeader(DocumentReference documentReference,DocumentExchangeDetails documentExchangeDetails) {
        
        this.documentExchangeDetails = documentExchangeDetails;
        this.documentReference = documentReference;
    }
    
    
    @XmlElement(name="DocumentExchangeDetails")
    public void setDocumentExchangeDetails(DocumentExchangeDetails documentExchangeDetails) {
        this.documentExchangeDetails = documentExchangeDetails;
    }
    public DocumentReference getDocumentReference() {
        return documentReference;
    }
    @XmlElement(name="DocumentReference")
    public void setDocumentReference(DocumentReference documentReference) {
        this.documentReference = documentReference;
    }
 // empty constructor for JAXB
    public DocumentHeader() {}
}
