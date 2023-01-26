 
Feature: Salesforce Login

  Scenario: Verify login funtionality
    Given Accessing SF application using "https://login.salesforce.com/"
    When User Enter username as "faris35katzrtzrtze.com", password as "Fartzrtzrt16??" and click on login button
    Then verify the logout button
	

	Scenario: Verify login with invalid username and valid password
    Given Accessing SF application
    When User Enter username as "faris35kanrtzrtfrtzrtzrtz.om", password as "Farirtzrtzr6??" and click on login button
    Then verify login page
	
	
	Scenario: Verify login with valid username and invalid password
    Given Accessing SF application
    When User Enter username as "faris35kanrtzrtze.com", password as "Faris5srtzrtzr" and click on login button
    Then verify login page
    
 	Scenario: Verify login with no username and no password
    Given Accessing SF application
    When User Enter username as "", password as "" and click on login button
    Then verify login page   
