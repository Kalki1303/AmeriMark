package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class HomePojo extends LibGlobal {

	public HomePojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_terms")
	private WebElement searchBar;
	
	@FindBy(id="search_button")
	private WebElement searchButton;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}		
}