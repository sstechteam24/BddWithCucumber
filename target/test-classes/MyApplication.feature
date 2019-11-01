
Feature: Test Facebook smoke scenario
  #------------------------------------------------------

  
  Scenario: Test login with valid credentials
 
   Given Open firefox and start application
   
    When Enter valid username and valid password
   
    Then User should be able to login successfully
  
 