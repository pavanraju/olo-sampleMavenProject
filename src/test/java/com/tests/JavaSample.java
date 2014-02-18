package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaSample {
	public static final String USERNAME = "pavankumarraju";
	  public static final String AUTOMATE_KEY = "hxykJ3spcrn8y2jypDby";
	  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {
	    
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "8.0");
	   // caps.setCapability("os", "Windows");
	    //caps.setCapability("os_version", "XP");
	    //caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com/ncr");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    System.out.println(((RemoteWebDriver) driver).getCapabilities().getVersion());
	    driver.quit();

	  }
}
