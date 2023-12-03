@Feature2
Feature: Verify that the user is able to filter the items

  @test1
  Scenario: To verify product filtering Functionality
    Given user must be on Amazon Webpage
    When user search a product in search bar by entering "Iphone"
    And upon clicking search icon, user should see list of products
    And user filters the items with Memory Storage Capacity
    
    

