package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class ProductList extends LibGlobal {
	public ProductList() {
		PageFactory.initElements(driver, this);	}

	@FindBy(xpath="//h2[text()='Petals Sandal']")
	private WebElement sandal;

	public WebElement getSandal() {
		return sandal;
	}
	
	
	
}
