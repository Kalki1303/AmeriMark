package com.hooks;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lib.LibGlobal;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends LibGlobal  {
	
	
	@Before
	public void beforeExecution() throws IOException {
		launchBrowser();
		maxWindow();
	}
	
	public void launchBrowser() throws IOException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		FileReader fIn=new FileReader("config.properties");
		Properties p=new Properties();
		p.load(fIn);
		
		String b = p.getProperty("browser");

		dLocation=p.getProperty("driverLocation");

		uRL = p.getProperty("url");

		try {
			if(b.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver","D:\\deepa\\chromedriver.exe");
				driver=new ChromeDriver();

			}else if(b.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver",dLocation);
				driver=new FirefoxDriver();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}



/*	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","D:\\deepa\\chromedriver.exe");
		driver=new ChromeDriver();

	}*/

}
