package com.cg.arrivalsstepdef;


import com.cg.page.ThreeArrivals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrivalsStepDef {
	
		ThreeArrivals arrival;
	
		@Given("User opens the browser and go to webpage")
		public void user_opens_the_browser_and_go_to_webpage() {
			arrival = new ThreeArrivals();
		}
	
		@When("User click shop menu")
		public void user_click_shop_menu() {
			arrival.clickShop();
		}
		
		@When("user click on Home menu")
		public void user_click_on_Home_menu() {
			arrival.clickHome();
		}
		
		@When("test home page has three arrivals only")
		public void test_home_page_has_three_arrivals_only() {
		    arrival.checkArrival();
		}
		
		@Then("check its only have three arrivals")
		public void check_its_only_have_three_arrivals() {
		   arrival.confirm();
		}




}
