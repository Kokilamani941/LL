@signin
Feature: Validating login page


@TS_siginin_01
Scenario: verifying Register link
Given: The User is on signin page
When: The user clicks on register link on signin page
Then: The user redirected to Registration page from signin page

@TS_signin_02
Scenario: User on login page and login with invalid inputs "<username>" and "<password>"
Given The User is on signin page
When The user enters invalid "username" and "password"
Then Click login button to verify


@TS_signin_03
Scenario: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
Given The User is on signin page
When The user enters invalid "username" and "Row number"
Then Click login button to verify

@TS_signin_04
Scenario: Verify signout link
Given User on login page and login with valid "user name" and "password"
When The user clicks signout button
Then The user redirected to home page