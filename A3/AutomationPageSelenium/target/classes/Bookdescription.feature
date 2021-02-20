Feature: Clicking the description of book

  Scenario: Checking book description
    Given User opens the browser and go to webpage
    When User click shop menu
    When user click on Home menu
    And test home page has three arrivals only
    When check its only have three arrivals
    When user clicks image in the arrival
    And check whether it is navigating to next page
    And add that book into basket
    When user clicks book description
    Then check the user can see description