Feature: Landing Page Tests are written here

Scenario: Landing Page Tittle
Given user is on landing Page
When user gets the tittle of the page
Then landing page tittle should be "Rahul Shetty Academy"

Scenario: Landing Page Header
Given user is on landing Page
When user gets the header of the page
Then page header should be "Home"

Scenario: Join button verification
Given user is on landing Page
Then user verify Join button is clickable

Scenario: Login button verification and landing on login Page
Given user is on landing Page
Then user verify login button is clickable
And user clicks on the login button and lands on login page
And user gets the tittle of the Login page
And login page tittle should be "Rahul Shetty Academy123"



