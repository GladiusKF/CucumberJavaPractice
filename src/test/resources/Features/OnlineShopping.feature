#Author: karlofrancobitao@gmail.com
#Keywords Summary : Online Shopping using cucumber
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## This is for Test Practice only
#Sample Feature Definition Template

#@tag
Feature: Online Shopping on Swag Labs

  @First
  Scenario: Login to Swag Labs
    Given user is on login page
    When user enter valid "<username>" and "<password>"
    And click login button
    Then home page should be loaded

    Examples: 
      |username|password|
      |standard_user|secret_sauce|


	@Second
  Scenario: Added Item should be displayed in the cart
	Given user is in the Home page
	When user click Add to Cart on an item
	And click the cart button
	Then added item should be displayed in the cart 
	
	
	@Second
  Scenario: "ADD TO CART" button should change to "REMOVE" when item was added to cart
	Given user is in the Home page
	When user click Add to Cart on an item
	Then button label should be changed to removed 
	

	@Second
  Scenario: Add Item to cart and verify if continue shopping button leads back to Home page
	Given user add an item to cart and click the cart button
	When user hit continue shopping button
	Then home page should be loaded
	
	
	@Second
  Scenario: Verify if Item was successfully checkout
	Given user add an item to cart and click the cart button
	When user hit continue shopping button
	Then home page should be loaded
	

