package com.helper;

public class Adactin_File_Reader_Manager {

	//private constructor
	public Adactin_File_Reader_Manager(){
		
		
	}
	
	
	
	//static method
	public static Adactin_File_Reader_Manager getInstanceFRM() {
		
		Adactin_File_Reader_Manager frm=new Adactin_File_Reader_Manager();
		return frm;
				
				
	}
	
	
	
	//non static method
	public Adactin_Cofiguration_Reader getInstanceCR() throws Throwable {
		Adactin_Cofiguration_Reader cr=new Adactin_Cofiguration_Reader();
		return cr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
