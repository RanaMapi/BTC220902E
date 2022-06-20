package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.Helper;

public class BaseTest {

	Properties prop;
	WebDriver dr;
	@Before
	public void openBrowser() throws IOException {
		prop=Helper.readPropFile("/Users/bittechconsulting/eclipse-workspace/com.bit.ui.test/src/test/resources/config.properties");
		
		String b=prop.getProperty("browser");
		if(b.equals("chrome"))
		{
		
		 dr=new ChromeDriver();
		}else if(b.equals("safari"))
		{
		 dr=new SafariDriver();
		}else if(b.equals("firefox"))
		{
		 dr=new FirefoxDriver();
		}
		dr.get(prop.getProperty("url"));
	}
}