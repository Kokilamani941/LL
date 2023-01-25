@stack
Feature: The user is in the stack page after launched the DS algo portal

Background: The user laughed ds algo portal
Given user is on Signin page of DS Algo portal
When The user enter the valid "username" and "password"
And the user clicks the login button
Then The user redirected to the home page

@TS_stack_02
Scenario: The user navigate the the "stack" page
Given The user is in the "home" page
When The user select the stack from drop down button after logged in 
Then the user directed to the "stack" page

@TS_stack_03
Scenario: The user navigate to "Operations in Stack" page
Given The user is in the "stack page" after logged in
When The user clicks the Operations in Stack
Then The user redirected into the Operations in Stack page 

@TS_stack_04
Scenario:The user navigate to tryEditor page and test  in stack page
Given The user is on the "Operation in stack page"
When The user clicks the "Try Here" button in the stack page
Then The user directed into the tryEditor page and run button to test the python code 

@TS_stack_05
Scenario: The user is able to run code in tryEditor for Operations in Stack page 
Given The user is in stack page having an tryEditor with a Run button to test
When The user enters the vaild python code 
And The user clicks on Run button after Entering valid python code in stack tryEditor
Then The user should be presented with Run output

@TS_stack_06
Scenario: The user is able to get the error message for invalid syntax for Operations in Stack page
Given The user is in stack page having an tryEditor with a Run button to test
When The user enters the invaild python code 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message

@TS_stack_07
Scenario: The user navigate to "Implementation" page
Given The user is in the "stack page" after logged in 
When The user clicks the implementation button
Then The user re directed into the "implementation page"

@TS_stack_08
Scenario: The user navigate to "Applications" in stack page
Given The user is in the "stack page" after logged in 
When The user clicks the "Applications" button
Then The user redirected into the  "Applications" page

@TS_stack_09
Scenario: The user navigate to "Practice Questions" in stack page
Given The user is in the "stack page" after logged in 
When The user clicks the Practice Questions button
Then The user redirected into the  Practice Questions page

