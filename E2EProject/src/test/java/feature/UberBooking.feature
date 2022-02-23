@All
Feature: Booking different type of cars in uber application

	@Smoke
  Scenario: Booking Sedan car type
    Given Open uber application and land on booking page
    When Booknow button is clicked cartype pop-up need to be displayed
    Then Select cartype as "Sedan" and click on book now button

	@Reg
  Scenario: Booking SUV car type
    Given Open uber application and land on booking page
    When Booknow button is clicked cartype pop-up need to be displayed
    Then Select cartype as "SUV" and click on book now button

	@Sanity
  Scenario: Booking Mini car type
    Given Open uber application and land on booking page
    When Booknow button is clicked cartype pop-up need to be displayed
    Then Select cartype as "Mini" and click on book now button
