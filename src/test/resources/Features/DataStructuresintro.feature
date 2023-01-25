@data_structure
Feature: User get in to the Data Structure page 

Background: The user login into the ds algo project
Given th user is on sign in page after launching ds algo portal
When The user enters the vaild "username" and "password"
And The user clicks the login button
Then User redirectrd into home page

@TS_DS_02
Scenario: The user navigate to data structure introduction page
Given The user is on the home page after log in
When The usere clicks the "get started" button in data structure 
Then The user redirected in to "Data Structure-Intoduction page

@TS_DS_03
Scenario: The user navigate to  Time Complexity  page
Given The usere clicks the "get started" button in data structure 
When The user is on the data structure intoduction page and the user clicks time complexity page
Then The user directed into the  "Time Complexity" page