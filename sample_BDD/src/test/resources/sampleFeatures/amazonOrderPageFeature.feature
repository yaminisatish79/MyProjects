Feature: Order feature testing 


Background: 
	Given User enters username and password and hits enters login button 
	When User clicks on the Returns and Orders button 
	Then user is taken to Your orders page 
	
	
Scenario: User is able to see "Your Orders" page 

	Then the default page is Your Orders page 
	
Scenario: User is able to see purchase history 

	Then user clicks on the "Buy Again" tab 
	Then User sees his purchase history 
	
