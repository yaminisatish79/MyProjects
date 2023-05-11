Feature: Amazon login page features with scenario outline
Scenario Outline: Succesfull login action with  username and password in multiple combinations  


Given an existing user enters amazon url and hits enter 
When existing user clicks on sign in button 
When existing user enters this "<Username>" and hits the sign in button 
When existing user enters this "<Password>" hits the sign in button
Then user is signed in succesfully and enters into amazon home page 
Examples: 
	|Username|Password|
	|4707311109|Allizwell79|
	|incorrectUserName|Allizwell79|
	|4707311109|incorrectPassword|