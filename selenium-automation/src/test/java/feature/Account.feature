Feature: Account login

#prerequisite check to perform other test
Background:
	Given validate the browser
		When Browser is triggered
			Then check if browser is started

@RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with username and password
     Then Home page is populated
      And Cards are displayed
@SmokeTest 
  Scenario: Home page default login
  	Given User is on NetBanking landing page
  		When User login into application with "pushp" and password "12345"
  			Then Home page is populated
  				And Cards displayed are "true"
@SanityTest				
   Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with "Lata" and password "4321"
     Then Home page is populated
      And Cards displayed are "false"

#data table example
@RegTest
   Scenario: Home page default login
    Given User is on NetBanking landing page
     When User sign up with following details
     | Jenny | abcd | jenny@abcd.com |Australia | 32343432 |
     
     Then Home page is populated
      And Cards displayed are "false"
      
#Parameterization
@MobileTest
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