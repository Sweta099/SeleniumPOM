package com.cg.navigatestepdef;

import com.cg.page.NavigateArrivals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateStepDef {
	
	NavigateArrivals navigateArrivals;

	@Given("User opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		navigateArrivals=new NavigateArrivals();
	}

	@When("User click shop menu")
	public void user_click_shop_menu() {
		navigateArrivals.clickShop();
	}

	@When("user click on Home menu")
	public void user_click_on_Home_menu() {
		navigateArrivals.clickHome();
	}

	@When("test home page has three arrivals only")
	public void test_home_page_has_three_arrivals_only() {
		navigateArrivals.checkArrival();
	}

	@When("check its only have three arrivals")
	public void check_its_only_have_three_arrivals() {
		navigateArrivals.confirm();
	}

	@When("user clicks image in the arrival")
	public void user_clicks_image_in_the_arrival() {
		navigateArrivals.clickOnImage();
	}

	@When("check whether it is navigating to next page")
	public void check_whether_it_is_navigating_to_next_page() {
		navigateArrivals.checkNavigation();
	}

	@When("add that book into basket")
	public void add_that_book_into_basket() {
		navigateArrivals.addToBasket();
	}

	@Then("check the user can add to basket")
	public void check_the_user_can_add_to_basket() {
		navigateArrivals.checkBasket();
	}

}
