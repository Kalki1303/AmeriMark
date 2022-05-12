package com.stepdefinition;

import com.hooks.Hooks;
import com.lib.LibGlobal;
import com.pojo.CheckOutPojo;
import com.pojo.HomePojo;
import com.pojo.Last;
import com.pojo.ProdDetailPage;
import com.pojo.ProductList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends LibGlobal {
	HomePojo hp;
	ProductList pl;
	ProdDetailPage pdp;
	CheckOutPojo cp;
	Last lp;


	@Given("I launch the browser and AmeriMark Site")
	public void i_launch_the_browser_and_AmeriMark_Site() {

		launchUrl(Hooks.uRL);

	}

	@When("I give a product in searchbar")
	public void i_give_a_product_in_searchbar() {
		loadPage();
		hp=new HomePojo();
		type(hp.getSearchBar(), "Sandals");
		clk(hp.getSearchButton());


	}

	@Then("I verify list of product  is displayed")
	public void i_verify_list_of_product_is_displayed() {
		loadPage();
		//	Assert.assertEquals(driver.getCurrentUrl().contains("keywords"), cUrl());
		System.out.println("Product list page : "+ cUrl());
	}

	@When("I select a product")
	public void i_select_a_product() {
		pl=new ProductList();
		clk(pl.getSandal());

	}

	@Then("verify the product detail page is listed")
	public <SoftAssert> void verify_the_product_detail_page_is_listed() {

		System.out.println("Prodct Detail page :"+cUrl());
	}

	@When("I select color,size, and quantity the product and click on add to bag button")
	public void i_select_color_size_and_quantity_the_product_and_click_on_add_to_bag_button() {
		pdp=new ProdDetailPage();
		jsclk(pdp.getColor());
		jsclk(pdp.getSize());
		jsclk(pdp.getShoeWidth());
		jsclk(pdp.getQuantity());
		jsclk(pdp.getAddToBag());
	}

	@Then("I verify a pop comes with selected items details")
	public void i_verify_a_pop_comes_with_selected_items_details() {
		cp=new CheckOutPojo();
		//clk(cp.getPopup());
	}

	@Then("I click on CheckOut button")
	public void i_click_on_CheckOut_button() {
		cp=new CheckOutPojo();
		jsclk(cp.getCheck());

	}

	@Then("verify I land on to shopping bag cart")
	public void verify_I_land_on_to_shopping_bag_cart() {
		lp=new Last();
		System.out.println(		getTxt(lp.getBag()));
		System.out.println("Shopping Bag :"+cUrl());

		//getTxt(lp.getBag())	;

	}



}
