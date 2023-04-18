package org.nic.port.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import com.sun.xml.internal.txw2.annotation.XmlElement;

public class ReceivingPartyDetails {
	 private List<String> receivingParty = new ArrayList<String>();
	    public List<String> getReceivingParty() {
	        return receivingParty;
	    }
	   @javax.xml.bind.annotation.XmlElement(name="ReceivingParty")
	    public void setReceivingParty(List<String> receivingParty) {
	        this.receivingParty = receivingParty;
	    }

}
