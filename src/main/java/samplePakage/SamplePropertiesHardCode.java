package samplePakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SamplePropertiesHardCode {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\seliniumfolder\\commonData.properties");
	Properties popj=new Properties();
	popj.load(fis);
	String URL=popj.getProperty("url"); 
	String USERNAME=popj.getProperty("username");
	String PASSWORD=popj.getProperty("password");
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}
}
