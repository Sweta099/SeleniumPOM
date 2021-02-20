package com.cg.bookreviewstepdef;

import java.util.Map;

import com.cg.page.BookReview;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookReviewStepDef {
	BookReview review;

	@Given("User opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		review = new BookReview();
	}

	@When("User click shop menu")
	public void user_click_shop_menu() {
		review.clickShop();
	}

	@When("user click on Home menu")
	public void user_click_on_Home_menu() {
		review.clickHome();
	}

	@When("test home page has three arrivals only")
	public void test_home_page_has_three_arrivals_only() {
		review.checkArrival();
	}

	@When("check its only have three arrivals")
	public void check_its_only_have_three_arrivals() {
		review.confirm();
	}

	@When("user clicks image in the arrival")
	public void user_clicks_image_in_the_arrival() {
		review.clickOnImage();
	}

	@When("check whether it is navigating to next page")
	public void check_whether_it_is_navigating_to_next_page() {
		review.checkingNavigation();
	}

	@When("add that book into basket")
	public void add_that_book_into_basket() {
		review.addToBasket();
	}

	@When("user clicks book Review")
	public void user_clicks_book_Review() {
		review.clickingReview();
	}

	@When("adds review for book")
	public void adds_review_for_book(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		review.addReview(map.get("reviews"), map.get("name"), map.get("email"));
	}

	@When("user clicks Submit")
	public void user_clicks_Submit() {
		review.submitReview();
	}

	@Then("check the user can see review")
	public void check_the_user_can_see_review() {
		review.viewReview();
	}

}
