Feature: Login Page Tests are written

Scenario: Login Page header
Given user is on the login page
When user gets the login page header
Then login page header should be "Log in"

Scenario: verify presence of Remember me link
Given user is on the login page
Then verify if Remember me link is presence

Scenario: verify presence of Sign up link
Given user is on the login page
Then verify if Sign up is presence

Scenario: verify presence of forgot password
Given user is on the login page
Then verify if forgot password is presence

Scenario: Login with correct credentials
Given user is on login page
When user enters username "harshbhut123@gmail.com"
And user enters password "Harsh@12111994"
And user clicks on the login button
Then user gets the username on home page
And username on home page should be "Harsh Bhut"


