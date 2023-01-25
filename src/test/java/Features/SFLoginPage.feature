 
Feature: Salesforce Login

  Scenario: Verify login funtionality
    Given Accessing SF application using "https://login.salesforce.com/"
    When User Enter username as "faris35kanbur-a7be@force.com", password as "Faris5016??" and click on login button
    Then verify the logout button
	

	Scenario: Verify login with invalid username and valid password
    Given Accessing SF application
    When User Enter username as "faris35kansse@force.com", password as "Faris5016??" and click on login button
    Then verify login page
	
	
	Scenario: Verify login with valid username and invalid password
    Given Accessing SF application
    When User Enter username as "faris35kanbur-a7be@force.com", password as "Faris5s" and click on login button
    Then verify login page
    
 	Scenario: Verify login with no username and no password
    Given Accessing SF application
    When User Enter username as "", password as "" and click on login button
    Then verify login page   