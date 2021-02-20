Feature: Clicking the Review of book

  Scenario: Adding and Checking book review
    Given User opens the browser and go to webpage
    When User click shop menu
    When user click on Home menu
    And test home page has three arrivals only
    When check its only have three arrivals
    When user clicks image in the arrival
    And check whether it is navigating to next page
    And add that book into basket
    When user clicks book Review
    And adds review for book
      | reviews | Good Book about java script for beginner helps to make for Academics|
      | name   | Ajay         |
      | email  | mjajay@gmail.com |
    And user clicks Submit
    Then check the user can see review