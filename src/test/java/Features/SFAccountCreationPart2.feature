 
Feature: Account creation for Salesforce Part 2

  Scenario Outline: Create account to SF application
    Given Accessing SF application using "https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus"
    When User Enter <firstname>, <lastname>,<title>,<mail>,<Telno>,<companyname>,<country> these details
    Then clcik on signup button
	
	Examples:
	    | firstname| lastname | title     | mail                    | Telno        | companyname |  country  |
			| faris    | kanbur   | Developer | farisdfnbudsfsdfsds | 0174657456 | Botam       |  Germany  |
			

