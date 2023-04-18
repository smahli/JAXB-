package org.nic.port.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"receivingPartyDetails","notifyPartyDetails"})
public class DocumentExchangeDetails {
 private NotifyPartyDetails notifyPartyDetails;
    private ReceivingPartyDetails receivingPartyDetails;
    public NotifyPartyDetails getNotifyPartyDetails() {
        return notifyPartyDetails;
    }
    
    
    public DocumentExchangeDetails(NotifyPartyDetails notifyPartyDetails,ReceivingPartyDetails receivingPartyDetails) {
        
        this.notifyPartyDetails = notifyPartyDetails;
        this.receivingPartyDetails = receivingPartyDetails;
    }
    
    
    
    @XmlElement(name="NotifyPartyDetails")
    public void setNotifyPartyDetails(NotifyPartyDetails notifyPartyDetails) {
        this.notifyPartyDetails = notifyPartyDetails;
    }
    public ReceivingPartyDetails getReceivingPartyDetails() {
        return receivingPartyDetails;
    }
    @XmlElement(name="ReceivingPartyDetails")
    public void setReceivingPartyDetails(ReceivingPartyDetails receivingPartyDetails) {
        this.receivingPartyDetails = receivingPartyDetails;
    }
    
 // empty constructor for JAXB
    public DocumentExchangeDetails() {}

}
