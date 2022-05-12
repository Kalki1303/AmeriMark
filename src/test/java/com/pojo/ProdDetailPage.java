package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class ProdDetailPage extends LibGlobal {
	public ProdDetailPage() {
PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="//label[@data-color='Turquoise']")
	private WebElement color;
	@FindBy(xpath="//span[contains(text(),'Wide Width')]")
	private WebElement shoeWidth;
	@FindBy(xpath="//label[@id='size_label_09W']")
	private WebElement size;
	
	@FindBy(id="quantity")
	private WebElement quantity;
	@FindBy(xpath="//input[@class='button red_submit_btn']")
	private WebElement addToBag;
	public WebElement getColor() {
		return color;
	}
	public WebElement getShoeWidth() {
		return shoeWidth;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getAddToBag() {
		return addToBag;
	}
	
	
	
}
