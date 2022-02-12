package com.helper;

public class Facebook_File_Reader_Manager {

	//private constructor
	private Facebook_File_Reader_Manager() {
		
	}
	
	
	//Non static method
	public Facebook_ConfigurationReader getInstanceCR() throws Throwable {

	Facebook_ConfigurationReader cr=new Facebook_ConfigurationReader();
	return cr;
	}
	//Static Method
	
	public static Facebook_File_Reader_Manager getInstanceFRM() {
		
		Facebook_File_Reader_Manager frm=new Facebook_File_Reader_Manager();
		return frm;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
