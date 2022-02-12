package com.helper;

public class File_Reader_Manager {
	
	//private Constructor
	private File_Reader_Manager() {

	}

	//Static Method
	public static File_Reader_Manager getInstanceFRM() {

		File_Reader_Manager frm = new File_Reader_Manager();

		return frm;

	}
	
	//Non Static Method
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader cr = new Configuration_Reader();

		return cr;

	}

}
