#This feature Covers all the login and registration related scenarios within ParaBank Link
  Feature: Verify all the login and registration related scenarios

   Background:
   Given Parabank Application is Launched
     And Login Page is displayed to the user

    Scenario: Login to ParaBank application
      Given I provide correct credentials
      When I click on Login button
      Then I am able to view the Parabank Home page
      And The expected links on home page are visible


   ## Scenario: User