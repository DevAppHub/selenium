Feature: Application login

  Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with username and password
     Then Home page is populated
      And Cards are displayed
  
  Scenario: Home page default login
  	Given User is on NetBanking landing page
  		When User login into application with "pushp" and password "12345"
  			Then Home page is populated
  				And Cards displayed are "true"
  				
   Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with "Lata" and password "4321"
     Then Home page is populated
      And Cards displayed are "false"

#data table example
   Scenario: Home page default login
    Given User is on NetBanking landing page
     When User sign up with following details
     | Jenny | abcd | jenny@abcd.com |Australia | 32343432 |
     
     Then Home page is populated
      And Cards displayed are "false"
      
#Parameterization
Scenario Outline: Home page default login
    Given User is on NetBanking landing page
     When User login in to application with <USERNAME> and password <PASSWORD>
     Then Home page is populated
      And Cards display are <STATUS>
      
   Examples: 
   | USERNAME | PASSWORD | STATUS |
   | pushp | abcd123 | true |
   | dimps | 123453  | false|
   | lata  | 234565  | true |