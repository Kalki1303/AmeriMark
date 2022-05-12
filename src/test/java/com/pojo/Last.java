package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class Last extends LibGlobal {
	public Last() {
		PageFactory.initElements(driver, this);	}
	@FindBy(xpath="//span[text()='Shopping Bag']")
	private WebElement bag;
	public WebElement getBag() {
		return bag;
	}
	
}
