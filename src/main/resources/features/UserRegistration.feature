Feature: User Registration
   I want to check that the user can register in our e-commerce website.
   
	Scenario Outline: User Registration
	Given the user in the home page
	When I click on register link
	And I entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
	Then The registration page displayed successfully
 
 	Examples:
 	 | firstname | lastname | email | password |
 	 | Muhamad | Atef | mohammedatef60@gmail.com | test@1233 |
 	 | Amr | ahmed | tester@test233.com | P@ssw0rd |
 	  