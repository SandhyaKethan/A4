package genericUtilityOrLib;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * this is class is the properties class with generic method
 * @author sandhya
 * @version 1.8.24
 */

public class PropertiesUtil {
	/**
	 * this is the generic method to read data from properties
	 * 
	 * @param data
	 * @return
	 * @throws Exception 
	 * @throws Exception 
	 */
public String getDataFromProperties(String data) throws Exception {
	FileInputStream fis=new FileInputStream(IconstantUtility.propertiesPath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(data);
	return value;
}
}
