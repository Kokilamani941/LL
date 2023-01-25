@queue
Feature: The user is in ds algo project after logged in to test the queue page 


Background: The user is logged in ds algo portal
Given The user is on Signin page of DS Algo portal
When The user is enter the vaild user nad password
And The user clicks the login button
Then User redirectrd into home page

@TS_queue_02
Scenario: The user is navigate to the Queue Data Structure Page
Given The user is in the home page after logged in 
When The user clicks the queue item from the drop down menu
Then The user is redirected into the "Queue Data Structure" page

@TS_queue_03
Scenario: The user is navigate to the  Implementation of Queue in Python link  Page
Given The user is in the queue  page after logged in 
When The user clicks the Implementation of Queue page 
Then The user is redirected into the Implementation of Queue in Python  page

@TS_queue_04
Scenario: The user is navigate to the  Implementation of Queue in Python link  Page
Given The user is in  Implementation of Queue in Python   page after logged in 
When The user clicks the "Try now" link
Then The user is redirected into the tryEditor link with run button


@TS_queue_05
Scenario: The user is able run code in Editor for Implementation of queue page
Given The user is in a page having an Editor with a Run button to test
When The user enters the valid python code in the tryEditor page
Then The user is presented with the result after run button is clicked

@TS_queue_06
Scenario: The user is presented with error message for invalid code in Editor for Implementation of queue page
Given The user is in a page having an Editor with a Run button to test
When The user enters the invalid python code in the tryEditor page
And The user clicks teh run button
Then The user is presented with  error message

@TS_queue_07
Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
Given The user is in the queue page after logged in 
When The user clicks on Implementation using collections deque link
Then The user should be redirected to Implementation using collections deque page

@TS_queue_08
Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
Given The user is in the Implementation using collections  page after logged in 
When The user clicks the Tryhere link
Then The user navigates to Editor page with Run button

@TS_queue_09
Scenario: The user is able to navigate to queue page and click on Implementation using array link
Given The user in editor page and navigates to the queue page
When The user clicks on Implementation using array link
Then The user should be redirected to Implementation using array page

@TS_queue_10
Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
Given The user in implementation using array page
When The user clicks on Tryhere link
Then The user navigates to Editor page with Run button

@TS_queue_11
Scenario: The user is able to navigate to queue page and click on Queue Operations link
Given The user in editor page and navigates to the queue page
When The user clicks on Queue Operations link
Then The user should be redirected to Queue Operations page

@TS_queue_12
Scenario: The user is able to navigate to queue page and click on Queue Operations link
Given The user in editor page and navigates to the queue page
When The user clicks on Queue Operations link
Then The user should be redirected to Queue Operations page

@TS_queue_13
Scenario: The user should be directed to editor page with run button to test python code from Queue Operations page
Given The user in Queue Operations page
When The user clicks on Tryhere link
Then The user navigates to Editor page with Run button

@TS_queue_14
Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
Given The user is in Editor page and navigates to QueueOp page
When the user clicks on Practice Questions
Then The user is directed to Practice page