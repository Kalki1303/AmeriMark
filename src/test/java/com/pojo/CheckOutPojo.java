package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class CheckOutPojo extends LibGlobal {

	public CheckOutPojo(){
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="//div[@class='modal-dialog']/parent::div[@id='cartPopoverModal']")
	private WebElement popup;*/
	@FindBy(xpath="//span[text()='Checkout']")
	private WebElement check;
	
	
/*	public WebElement getPopup() {
		return popup;
	}
*/	public WebElement getCheck() {
		return check;
	}
	
	
	
	
}
