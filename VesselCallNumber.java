package org.nic.port.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

 

@XmlRootElement(name="VesselCallNumber")
@XmlType(propOrder={"documentHeader","documentDetails","documentSummary"})
public class VesselCallNumber {
private DocumentHeader documentHeader;
    private DocumentSummary documentSummary;
    private DocumentDetails documentDetails;
    
    //
   // @XmlType( propOrder = {"VCN", "VesselType", "Portcode","AllotmentDate","EDTA","SACode","LineCode","VoyageNumber","EDTD","RecordType","CallSign","ServiceName","DockORTOCode","IMONumber"})

    public VesselCallNumber(DocumentHeader documentHeader,DocumentSummary documentSummary,DocumentDetails documentDetails) {
        
        this.documentHeader = documentHeader;
        this.documentSummary = documentSummary;
        this.documentDetails = documentDetails;
    }
    
    
   
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }
@XmlElement(name="DocumentHeader")
    public void setDocumentHeader(DocumentHeader documentHeader) {
        this.documentHeader = documentHeader;
    }
    
    public DocumentSummary getDocumentSummary() {
        return documentSummary;
    }
    @XmlElement(name="DocumentSummary")
    public void setDocumentSummary(DocumentSummary documentSummary) {
        this.documentSummary = documentSummary;
    }
    
    public DocumentDetails getDocumentDetails() {
        return documentDetails;
    }
    @XmlElement(name="DocumentDetails")
    public void setDocumentDetails(DocumentDetails documentDetails) {
        this.documentDetails = documentDetails;
    }
    
    // empty constructor for JAXB
    public VesselCallNumber() {}

}


