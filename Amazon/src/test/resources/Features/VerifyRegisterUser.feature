@Feature3
Feature: Amazon New User Registration

	@test1 @Negative
  Scenario: User registration required fields
    Given the user is already on Amazon registration page
    #When user clicks on Hello, Sign in option
    When user clicks on continue button
    Then user should see error message on username, email and password fields
	
#	@Test1 @Positive
  #Scenario: Registration New User
    #Given user must be on Amazon Webpage
    #When hover on Hello, Sign in option and clicks on StartHere to register
    #And user entered account details as below
      #| Name          | Testing                |
      #| Email         | testing@gmail.com |
      #| Password      | testing                |
      #| PasswordAgain | testing                |
      #
