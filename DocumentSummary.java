package org.nic.port.test;


public class DocumentSummary {

    private Integer issuedDateTime;
    //
    public DocumentSummary(Integer issuedDateTime){
    	this.issuedDateTime =issuedDateTime;
    	
    }
    // getter and setter
    public Integer getIssuedDateTime() {
        return issuedDateTime;
    }
    @javax.xml.bind.annotation.XmlElement(name="IssuedDateTime")
    public void setIssuedDateTime(Integer issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }
    //
 // no arg constructor or empty constructor for JAXB
    public DocumentSummary() {}

}
