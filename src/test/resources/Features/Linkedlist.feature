@linkedlist
Feature: Testing Linkedlist page

Background: User logged in to the DS Algo portal
Given The User is on signin page
When  The user enter valid user name and password
And The user clicks on the login button
Then The user redirected into home page 

@TS_ll_02
Scenario: User navigate to "linked list" page
Given The user is on the "home page" after logged in
When  The user is selecting the linked list item from the drop down
Then The user is redirected into "Linked list" page


@TS_ll_03
Scenario: User navigate to "introduction" page
Given The user is on the "linked list" page after logged in
When The user clicks the introduction link
Then The user redirected to "Introduction" of linked list page

@TS_ll_04
Scenario: User navigated to tryEditor page with Run button from Introduction page
Given The user is on the "introduction" page after logged in 
When The user clicks the "Try here" button on the "introduction" page
Then The user redirected into tryEditor page with run button to test

@TS_ll_05
Scenario: The user run the code in tryEditor with valid input for Introduction page
Given The user is in the try here page to run the python code in tryEditor 
When The user is enter the valid python code in tryEditor 
And user clicks the run button 	
Then The should be presented with run output

@Ts_ll_06
Scenario: The user is getting error messgae with invalid python code for introduction page
Given The user is in the try here page having tryEditor and run button
When The user is enter the invalid python code in the tryEditor 
And The user clicks the Run button
Then The user get the error message 

@Ts_ll_07
Scenario:  The User navigate to "creating linked list" page
Given The user is on the "linked list page" after logged in
When The user clicks creating linked list link
Then  The user redirected into creating linked list page


@TS_ll_08
Scenario: User navigate to "types of linked list" page
Given The user is on the "linked list page" after logged in
When  The user clicks "Try Here" button in the "types of linked list" page
Then The user redirected into tryEditor page with run button to test


@TS_ll_09
Scenario: user navigated to "Implementation linked list in python" page
Given The user is on the "Linked List page" after logged in
When The user clicks the Implement Linked List in Python button
Then The user should be directed to "Implement Linked List in Python" of Linked List Page


@TS_ll_10
Scenario: user navigated to "Traversal" page
Given The user is on the "Linked List page" after logged in
When The user clicks the Traversal button
Then The user should be directed to "Traversal" of Linked List Page


@TS_ll_11
Scenario: user navigated to "Insertion" page
Given The user is on the "Linked List page" after logged in
When The user clicks the Insertion button
Then The user should be directed to "Insertion" of Linked List Page


@TS_ll_12
Scenario: user navigated to "Deletion" page
Given The user is on the "Linked List page" after logged in
When The user clicks the Deletion button
Then The user should be directed to "Deletion" of Linked List Page


@TS_ll_13
Scenario: The user validating "Practice Questions" page
Given The user is on the "Linked List page" after logged in
When The user clicks Introduction link
And The user clicks on the Practice Questions
Then The user should be directed to Practice Questions of Linked List Page



