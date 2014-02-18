package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public void test1(){
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/drivers/win/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/win/chromedriver.exe");
		
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("version", "30");
		WebDriver wd = new ChromeDriver(caps);
		System.out.println(((RemoteWebDriver) wd).getCapabilities().getVersion());
	}
	
}
