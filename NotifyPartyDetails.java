package org.nic.port.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;



public class NotifyPartyDetails {
	
	private List<String> notifyParty = new ArrayList<String>();
	
    public List<String> getNotifyParty() {
        return notifyParty;
    }
  
@XmlElement(name="NotifyParty")
    public void setNotifyParty(List<String> notifyParty) {
        this.notifyParty = notifyParty;
    }
    
    //

    public NotifyPartyDetails(List<String> notifyParty) {
        this.notifyParty = notifyParty;
    }

    // empty constructor for JAXB
    public NotifyPartyDetails() {}
	
}
