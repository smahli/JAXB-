package org.nic.port.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement

//@XmlType(propOrder={"recordType","vCN","iMONumber" ,"callSign", "voyageNumber","vesselType","sACode","lineCode","dockORTOCode","portcode","eDTA","eDTD", "serviceName","allotmentDate"})
 	public class VoyageDetails  {
	private String recordType;
	private String vCN;
    private String vesselType;
    private String portcode;
    private Integer allotmentDate;
    private String eDTA;
    private String sACode;
    private String lineCode;
    private String voyageNumber;
    private Integer eDTD;
    private String callSign;
    private String serviceName;
    private String dockORTOCode;
    private String iMONumber;
    
    // 
    public VoyageDetails(String RecordType, String VCN,String IMONumber ,String CallSign ,String VoyageNumber,String VesselType,String SACode, String LineCode, String DockORTOCode,String Portcode,String EDTA, Integer EDTD, String ServiceName ,Integer AllotmentDate ) {
    	this.vCN =VCN;
    	this.vesselType =VesselType;
    	this.portcode =Portcode;
    	this.allotmentDate =AllotmentDate;
    	this.eDTA =EDTA;
    	this.sACode =SACode;
    	this.lineCode =LineCode;
    	this.voyageNumber =VoyageNumber;
    	this.eDTD =EDTD;
    	this.recordType =RecordType;
    	this.callSign =CallSign;
    	this.serviceName =ServiceName;
    	this.dockORTOCode =DockORTOCode;
    	this.iMONumber = IMONumber;
        
    }
    

    
    public String getVCN() {
		return vCN;
	}


    @XmlElement(name="VCN")
	public void setVCN(String VCN) {
		this.vCN = VCN;
	}



	public String getVesselType() {
		return vesselType;
	}


	@XmlElement(name="VesselType")
	public void setVesselType(String VesselType) {
		this.vesselType = VesselType;
	}



	public String getPortcode() {
		return portcode;
	}


	@XmlElement(name="Portcode")
	public void setPortcode(String Portcode) {
		this.portcode = Portcode;
	}



	public Integer getAllotmentDate() {
		return allotmentDate;
	}


	@XmlElement(name="AllotmentDate")
	public void setAllotmentDate(Integer AllotmentDate) {
		this.allotmentDate = AllotmentDate;
	}



	public String getEDTA() {
		return eDTA;
	}


	@XmlElement(name="EDTA")
	public void setEDTA(String EDTA) {
		this.eDTA = EDTA;
	}



	public String getSACode() {
		return sACode;
	}

	@XmlElement(name="SACode")

	public void setSACode(String SACode) {
		this.sACode = SACode;
	}



	public String getLineCode() {
		return lineCode;
	}


	@XmlElement(name="LineCode")
	public void setLineCode(String LineCode) {
		this.lineCode = LineCode;
	}



	public String getVoyageNumber() {
		return voyageNumber;
	}


	@XmlElement(name="VoyageNumber")
	public void setVoyageNumber(String VoyageNumber) {
		this.voyageNumber = VoyageNumber;
	}



	public Integer getEDTD() {
		return eDTD;
	}


	@XmlElement(name="EDTD")
	public void setEDTD(Integer EDTD) {
		this.eDTD = EDTD;
	}



	public String getRecordType() {
		return recordType;
	}

	@XmlElement(name="RecordType")

	public void setRecordType(String RecordType) {
		this.recordType = RecordType;
	}



	public String getCallSign() {
		return callSign;
	}


	@XmlElement(name="CallSign")
	public void setCallSign(String CallSign) {
		this.callSign = CallSign;
	}



	public String getServiceName() {
		return serviceName;
	}

	@XmlElement(name="ServiceName")

	public void setServiceName(String ServiceName) {
		this.serviceName = ServiceName;
	}



	public String getDockORTOCode() {
		return dockORTOCode;
	}


	@XmlElement(name="DockORTOCode")
	public void setDockORTOCode(String DockORTOCode) {
		this.dockORTOCode = DockORTOCode;
	}



	public String getIMONumber() {
		return iMONumber;
	}

	@XmlElement(name="IMONumber")

	public void setIMONumber(String IMONumber) {
		this.iMONumber = IMONumber;
	}



	//// empty constructor for JAXB
    public VoyageDetails() {}
}



