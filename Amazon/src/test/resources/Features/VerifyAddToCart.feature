@Feature1
Feature: Verify that the user is able to add item in cart

	@test1
  Scenario: To verify Add to Cart Functionality
    Given user must be on Amazon Webpage
    When user search a product in search bar by entering "Iphone"
    And upon clicking search icon, user should see list of products
    And user select an item and click add to cart
    Then user should see confirmation message that the product is added to the cart
    And user should be prompted to log in or create account
    
#		Then select and store the price of the iphone in a variable
		