#Author: dharmendray2k@gmail.com
#Date: 31-Oct-2021
#This feature file will try to test the below scenario using the given url
#Website used: https://testscriptdemo.com
#It will add four items to wishlist, find the lowest item from my wishlist, add it to cart and verify the cart. 
#Background: List of steps run before each of the scenarios

@TagSuite
Feature: Codility test scenarios to automate

Background: User opens the Test Script Demo url and verify the home page
Given user opens "https://testscriptdemo.com" url on "Chrome" browser
When If user sees Accept All element then clicks
And user sees Home page element
Then user verifies that its a correct Home page
  
  @TagScenario
  Scenario: Test Scenario to add items to wishlist, find lowest cost item and add it to cart and verify.
    Given I add four different products to my wish list
    When I view my wishlist table
    Then I find total four selected items in my Wishlist
    When I search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart
    And Browser is closed
