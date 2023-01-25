package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	private final static String propertyFilePath="/DSalgoxpathers/src/test/resources/config/config.properties";
	
	private static String browserType=null;
	
	public static void loadConfig() throws Throwable
	{
		try {
			FileInputStream ins=new FileInputStream(propertyFilePath);
			prop=new Properties();
			try {
				prop.load(ins);
				ins.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
			catch(FileNotFoundException e) 
			{
				e.printStackTrace(); 
				
				throw new RuntimeException("config.properties not found at"+propertyFilePath);
			}
		    }

public static void setBrowserType(String browser) {
	browserType=browser;
}
public static String getBrowserType() throws Throwable{
	if(browserType !=null)
	return browserType;
	
	else
	throw new RuntimeException("browser not specified in the testng.xml");
}
public static String getApllicationUrl() {
	String url=prop.getProperty("url");
 if(url !=null)
	 return url;
 else
		throw new RuntimeException("url not specified in the config.properties file");

	
}
//homepage
public static String getHomePage() {
	String homeurl=prop.getProperty("homepage");
 if(homeurl !=null)
	 return homeurl;	
 else
		throw new RuntimeException("homeurl not specified in the config.properties file");

	
}
//signin
public static String getLoginPage() {
	String loginurl=prop.getProperty("loginpage");
 if(loginurl !=null)
	 return loginurl;	
 else
		throw new RuntimeException("loginurl not specified in the config.properties file");

	
}
//register
public static String registerPageURL() {
	String url = prop.getProperty("registerurl");
	if (url != null)
		return url;
	else
		throw new RuntimeException("url not specified in the Configuration.properties file.");
}

public static String tryEditorURL() {
	String tryeditorurl = prop.getProperty("tryeditorurl");
	if (tryeditorurl != null)
		return tryeditorurl;
	else
		throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
}
public static String getLinkedlistUrl() {
	String linkedlisturl=prop.getProperty("linkedlisturl");
 if(linkedlisturl !=null)
	 return linkedlisturl;	
 else
		throw new RuntimeException("linkedlisturl not specified in the config.properties file");

	
}
public static String getexcelfilepath() {
	String getexcelurl=prop.getProperty("getexcelurl");
 if( getexcelurl !=null)
	 return getexcelurl;	
 else
		throw new RuntimeException(" getexcelurl not specified in the config.properties file");

	
}
}