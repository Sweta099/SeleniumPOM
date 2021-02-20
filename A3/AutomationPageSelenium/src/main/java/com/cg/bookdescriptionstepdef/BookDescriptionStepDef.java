package com.cg.bookdescriptionstepdef;

import com.cg.page.BookDescription;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookDescriptionStepDef {
	BookDescription description;

	@Given("User opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		description = new BookDescription();
	}

	@When("User click shop menu")
	public void user_click_shop_menu() {
		description.clickShop();
	}

	@When("user click on Home menu")
	public void user_click_on_Home_menu() {
		description.clickHome();
	}

	@When("test home page has three arrivals only")
	public void test_home_page_has_three_arrivals_only() {
		description.checkArrival();
	}

	@When("check its only have three arrivals")
	public void check_its_only_have_three_arrivals() {
		description.confirm();
	}

	@When("user clicks image in the arrival")
	public void user_clicks_image_in_the_arrival() {
		description.clickOnImage();
	}

	@When("user clicks book description")
	public void user_clicks_book_description() {
		description.clickingDescription();
	}

	@When("check whether it is navigating to next page")
	public void check_whether_it_is_navigating_to_next_page() {
		description.checkingNavigation();
	}

	@When("add that book into basket")
	public void add_that_book_into_basket() {
		description.addToBasket();
	}

	@Then("check the user can see description")
	public void check_the_user_can_see_description() {
		description.checkingDescription();
	}
}
