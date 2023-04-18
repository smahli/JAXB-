package org.nic.port.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshall {
	 public static void marshal(VesselCallNumber vesselCallNumber,File selectedFile)
	            throws IOException, JAXBException {
	        JAXBContext context;
	        BufferedWriter writer = null;
	        writer = new BufferedWriter(new FileWriter(selectedFile));
	        context = JAXBContext.newInstance(VesselCallNumber.class );
	        Marshaller m = context.createMarshaller();
	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        m.marshal(vesselCallNumber, writer);
	        writer.close();
	    }

}
