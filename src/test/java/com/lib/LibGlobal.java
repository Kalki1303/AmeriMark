package com.lib;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LibGlobal  {
	public	static WebDriver driver;
	public	static String dLocation;
	public	static String uRL;

	public void maxWindow() {
		driver.manage().window().maximize();
	}

	public void launchUrl(String uRL) {
		driver.get(uRL);
	}

	public String cUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	public void loadPage() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}

	/*public void explicitWait(By locator) {
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.presenceOfElementLocated(locator));
	}*/

	public void clk(WebElement element) {
		element.click();
		}

	public String getTxt(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void jsclk(WebElement element) {

		JavascriptExecutor jss=(JavascriptExecutor)driver;

		jss.executeScript("arguments[0].click()", element);
	}


}