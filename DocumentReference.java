package org.nic.port.test;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;




/*@XmlType( propOrder = { "DocumentType", "DocumentName",   "DocumentNumber", "CommonRefNumber", "SenderID",  "MessageType"
})*/
@XmlType(propOrder={"documentType","documentName","documentNumber","commonRefNumber","messageType","senderID"})
public class DocumentReference {
    private String documentType;
    private String commonRefNumber;
    private Integer documentNumber;
    private String senderID;
    private Integer messageType;
    private String documentName;
    public String getDocumentType() {
        return documentType;
    }
    @XmlElement(name="DocumentType")
    public void setDocumentType(String DocumentType) {
        this.documentType = DocumentType;
    }
    public String getCommonRefNumber() {
        return commonRefNumber;
    }
    @XmlElement(name="CommonRefNumber")
    public void setCommonRefNumber(String CommonRefNumber) {
        this.commonRefNumber = CommonRefNumber;
    }
   
    public Integer getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(Integer documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getSenderID() {
        return senderID;
    }
    @XmlElement(name="SenderID")
    public void setSenderID(String SenderID) {
        this.senderID = SenderID;
    }
    public Integer getMessageType() {
        return messageType;
    }
    @XmlElement(name="MessageType")
    public void setMessageType(Integer MessageType) {
        this.messageType = MessageType;
    }
    public String getDocumentName() {
        return documentName;
    }
    @XmlElement(name="DocumentName")
    public void setDocumentName(String DocumentName) {
        this.documentName = DocumentName;
    }
	
}
