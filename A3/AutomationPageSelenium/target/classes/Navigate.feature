Feature: Images in arrival should navigate
Scenario: Checking the arrivals navigation
Given User opens the browser and go to webpage
When User click shop menu
When user click on Home menu
And test home page has three arrivals only
When check its only have three arrivals
When user clicks image in the arrival
And check whether it is navigating to next page
And add that book into basket
Then check the user can add to basket