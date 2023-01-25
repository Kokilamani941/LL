@register
Feature: Validating Register page

@TS_register_01
Scenario: User launching into the home page
Given The user opens the ds algo portal link
When The user clicks the "get started" link
Then The user landed into the home page 

@TS_register_02
Scenario: The user shows the error message for empty username textbox 
Given The user opens the Register page
When The user clicks "Register" button with all fields empty
Then It display  an error message "please fill out this field" .below user name text box

@TS_register_03
Scenario: The user shows the error message for empty password textbox 
Given The user opens the Register page
When The user clicks "Register" button with all fields empty
Then It display an error message "please fill out this field" .below password text box


@TS_register_04
Scenario: The user shows the error message for empty confirm password textbox 
Given The user opens the Register page
When The user clicks "Register" button with all fields empty
Then It display an error message "please fill out this field" .below confirm password text box

@TS_register_05
Scenario: The user shows the error message invalid user name 
Given The user opens the Register page
When  The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
Then It display an error message "please enter a valid user name"

@TS_register_06
Scenario: The user printer error message for password mismatch
Given The user opens the Register page
When  Ths user clicks the "register" link to enter the "username" and in different "password" for password field and "confirm password" field 
Then It should display an error message "password mismath:tow password fields are mismatch"

@TS_register_07
Scenario: The user presented the error message the password is less than 8 characters
Given The user opens the Register page
When The user enters the valid "username" and  "password" with less than 8
Then It should display an error message "password should contain at leat 8 characters"

@TS_register_08
Scenario: The user is presented error message with password with only numbers
Given The user opens the Register page
When The user enters the valid "username" and  "password" with only numbers
Then It should display an error message "password is entirely not numeric"

@TS_register_09
Scenario: The user is presented with error message for password too similar to your other personal information
Given The user opens Register Page
When The user enters a valid "username" and "password" similar to username  
Then It should display an error message "password can’t be too similar to your other personal information."

@TS_register_10
Scenario: The user is presented with error message for commonly used password
Given The user opens Register Page
When The user enters a valid "username" and commonly used password "password"
Then It should display an error message "Password can’t be commonly used password"

@TS_register_11
Scenario: The user redirected to the home page with valid credentials
Given The user opens Register Page
When The enters the vaild "username" and "password" and "password confirmation"
Then The user should redirected into the home page with the message "new account created.you  are logged in as <koki>"	

@TS_register_12
Scenario: The user presented with error message for existing username
Given The user opens Register Page
When The user enters a valid existing "username" with "password" and "password confirmation"
Then It should display on error message "Username already exists"

@TS_register_13
Scenario Outline: User on signin page and login with valid credentials
Given The user is on signin page
When The user enter valid "<username>" and "<password>"
Then click login button to verify

