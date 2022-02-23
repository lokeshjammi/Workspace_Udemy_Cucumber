Feature: Login into application

Scenario Outline: Positive test validating login

Given Initialize drive with chrome browser
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in homepage to land on secure sign in page
When User enters <Username> and <Password> and login
Then Verify the user is successfully login
And Close the browser

Examples:
|Username 				|Password |
|test99@gmail.com	|123456		|
|test12@gmail.com	|12345		|  