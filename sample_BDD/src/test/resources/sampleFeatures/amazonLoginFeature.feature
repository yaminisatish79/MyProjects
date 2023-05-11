Feature: Amazon login page features 
@Smoke
Scenario: Succesfull login action with correct username and password  


Given an existing user enters amazon url "http://www.amazon.com" and hits enter 
When existing user clicks on the sign in button 
When existing user enters correct username as 4707311109 and hits the sign in button 
When existing user enters correct password as "Allizwell79." hits the sign in button
Then user is signed in succesfully and able to see amazon home page 


Scenario: Failure login action with incorrect username  

Given an existing user enters amazon url "http://www.amazon.com" and hits enter 
When existing user clicks on the sign in button 
When existing user enters incorrect username as 07311109 and hits the sign in button 
Then user gets a error message "Incorrect Phone number"

Scenario: Failure login action with correct username and incorrect password 

Given an existing user enters amazon url "http://www.amazon.com" and hits enter 
When existing user clicks on the sign in button 
When existing user enters correct username as 4707311109 and hits the sign in button 
When existing user enters incorrect password as "Allizwell7." hits the sign in button
Then user gets a error message "Incorrect Phone number" 

Scenario: sign up done by a new user 
Given an new user enters amazon url "http://www.amazon.com" and hits enter 
When a new user hits the create your amazon account button
Then new user sees the create account page 
Then new user enters the following details to create a new account 
		|yamini|4707311109|Allizwell79.|
		|test123|4700311109|Allizwell79.|
		|@test123|4707211109|Allizwell79.|
Then new user enters the following details with headers 
 
		|name|phone number|password|
		|yamini|4707311109|Allizwell79.|
		|test123|4700311109|Allizwell79.|
		|@test123|4707211109|Allizwell79.|
Then user clicks on the craete account button
Then user sees success message 