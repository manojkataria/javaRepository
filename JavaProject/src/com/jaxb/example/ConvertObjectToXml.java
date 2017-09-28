package com.jaxb.example;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ConvertObjectToXml {
	/*public static String convertObjectToXML(Student object) {
	        try {
	        	System.out.println("Inside first method...");
	            StringWriter stringWriter = new StringWriter();
	            JAXBContext context = JAXBContext.newInstance(object.getClass());
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.marshal(object, stringWriter);
	            return stringWriter.toString();
	        } catch (JAXBException e) {
	            System.err.println(String.format("Exception while marshalling: %s", e.getMessage()));
	        }
	        return null;
	    }*/
	
	
	public static <T> String convertObjectToXML(T object) {
        try {
        	System.out.println("Inside Genric method...");
            StringWriter stringWriter = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(object, stringWriter);
            return stringWriter.toString();
        } catch (JAXBException e) {
            System.err.println(String.format("Exception while marshalling: %s", e.getMessage()));
        }
        return null;
    }
	 public static void main(String args[]){
	    	   	
	
	        Student student = new Student();
	        student.setMarks(123);
	        student.setName("CODESUGGESTIONS");
	        student.setRank(2);
	        student.setRollNo(123);
	        String studentXML = convertObjectToXML(student);
	        System.out.println(studentXML);
	
	    }
}

