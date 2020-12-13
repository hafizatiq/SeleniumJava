package com.TestConfig;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readTestConfig {
	
	Properties pro;
	
	public readTestConfig() {
		
		File src =  new File("./src\\main\\java\\com\\TestConfig\\config.properties");
		try {
			FileInputStream fis  = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e){
			System.out.println("Exception:"+ e.getMessage());
		}
	}
	
	public String getURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username = pro.getProperty("userName");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromeDriver() {
		String chromeDriver = pro.getProperty("chromeDriver");
		return chromeDriver;
	}

}
