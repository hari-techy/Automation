Feature: User Signup and Account Deletion

  Scenario: User signs up and deletes account successfully
    Given the browser is launched
    And I navigate to the url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on the Signup or Login button
    Then New User Signup should be visible
    And I enter the name name and email address email
    And I click the Signup button
    Then ENTER ACCOUNT INFORMATION should be visible
    And I fill in the details:
      | Title                       | Name     | Email     | Password | Date of Birth |
      | <title>                     | <name>   | <email>   | <password>| <dob>         |
    And I select the checkbox Sign up for our newsletter
    And I select the checkbox Receive special offers from our partners
    And I fill in the additional details:
      | First Name | Last Name | Company | Address  | Address2 | Country | State | City  | Zipcode | Mobile Number |
      | <first_name>| <last_name>| <company>| <address>| <address2>| <country>| <state>| <city> | <zipcode>| <mobile_number>|
    And I click the Create Account button
    Then ACCOUNT CREATED should be visible
    When I click the Cont button
    Then Logged in as username should be visible
    When I click the Delete Account button
    Then ACCOUNT DELETED should be visible
    And I click the Continue button

