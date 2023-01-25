@Array
Feature: User launch dsalgo application and test Array test

Background: User Launching the url and clicks the get started button
Given  The user is on sign in page of dsalgo portal
When The user enter the valid "username" and "password"	
And The click on login button
Then The user redirected into home page

@TS_array_02
Scenario: The user navigate into "ARRAY" data structure page
Given The user is on the "home page" after logged in
When The user clicks the "get started" buttton from the Array 
Then The user directed into "array" data structure page

@TS_array_03
Scenario: The user navigate into Arrays in python page
Given The user is on the "Array page" after logged in
When The user clicks Python link in Array page
Then The user redirected into "Arrays in Python" page

@TS_array_04
Scenario: The user is able run code in tryEditor for Arrays in Python page
Given The user is in the "Array in python" page after logged in 
When The user clicks "Try now " button on "Array in python"
Then  The user redirected into tryeditor on run button to test

@TS_array_05
Scenario: The user try to run the python code on tryEditor button in Arrays in Python page
Given The user landed into tryeditor on run button to test
When The user enters the valid python code in tryEditor
And The user clicks the run button
Then The user presented with run result

@TS_array_06
Scenario: The user try to run the invalid python code on tryEditor button in Arrays in Python page
Given The user landed into tryeditor on run button to test
When The user enters the incvalid python code in tryEditor
And The user clicks the run button
Then The user presented with error message as "The valuse is undefined"

@TS_array_07
Scenario: The user navigate into Arrays Using List page
Given The user is on the "Arrays Using List" after logged in
When The user clicks Arrays Using List link in Array page
Then The user redirected into "Arrays Using List" page

@TS_array_08
Scenario: The user navigate into  Basic Operations in Lists page
Given The user is on the " Basic Operations in Lists" after logged in
When The user clicks Basic Operations in Lists link in Array page
Then The user redirected into " Basic Operations in Lists" page

@TS_array_09
Scenario: The user navigate into  Applications of Array page
Given The user is on the " Applications of Array" after logged in
When The user clicks Applications of Array link in Array page
Then The user redirected into " Applications of Array" page

@TS_array_10
Scenario: The user navigate into  Practice page
Given The user is on the " Practice" page after logged in
When The user clicks Practice link in Array page
Then The user redirected into " Practice" page

@TS_array_11
Scenario: The user is able to navigate to Question page from Search the array link
Given The user is on the "Practice page" after logged in
When The user clicks the Search the array link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

@TS_array_12
Scenario: The user is able to run code in tryEditor for Search the array link
Given The user is on "Question" page of "Search the array" after logged in
When The user enter valid python code in tryEditor
And The user clicks on run button
Then The user should be presented with Run result

@TS_array_13
Scenario: The user is able to navigate to Question page from Max Consecutive Ones
Given The user is on the "Practice page" after logged in
When The user clicks the Max Consecutive Ones link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

@TS_array_14
Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
Given The user is on the "Practice page" after logged in
When The user clicks the Squares of a Sorted Array link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

@TS_array_15
Scenario:The user is presented the error message from the code with invalid syntaxin tryEditor of  Squares of a Sorted Array 
Given The user in the "Question" page of "Squares of a Sorted Array" after logged in
When The user enters the invalid syntax in the tryEditor
And The user clicks the run button
Then The user should be presented the error message "Invalid sytanx error"
