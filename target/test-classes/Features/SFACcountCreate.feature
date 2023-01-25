 
Feature: Account creation fo Salesforce

  Scenario: Create account to SF application
    Given Accessing SF application using "https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus"
    When User Enter all the details
    |firstname|lastname|title|faris38kanbur@gmail.com|017641078716|companyname|Germany|
    Then clcik on signup button
	