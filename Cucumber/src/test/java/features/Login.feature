Feature: Application Login

Scenario: Homepage default login

Given User is on net banking landing page
When User login with username as "jin" and password as "1234"
Then Homepage need to be displayed
And Make sure all the cards are displayed "true"

Scenario: Homepage default login

Given User is on net banking landing page
When User login with username as "john" and password as "4321"
Then Homepage need to be displayed
And Make sure all the cards are displayed "false"