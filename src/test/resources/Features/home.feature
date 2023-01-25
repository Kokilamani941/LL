@home
Feature: To launching dsalgo application and test Home page

  @TestSuit_home_01
  Scenario: Launching Home page of the dsalgo project
  Given User open the dsalgo portal link
  When User clicks the "Get started" button
  Then User will be redirected to home page
  
  
  @TestSuit_home_02
  Scenario: From home page users tries to click the dropdown "<option>" without create login 
  Given User in the home page
  When User clicks on dropdown "<option>"
  Then User to get Warning message "You are not logged in"
  
  @TestSuit_home_03
  Scenario: From the home page user tries to click the dropdown "<option>" without creating login
  Given User in the home page
  When User clicks the "Get started" button
  Then User get a warning message "You are not logged in"
  
  
  @TestSuit_home_04
  Scenario: From the home page user tries to click the "sign in" link 
  Given User in the home page 
  When User clicks the sign in link
  Then User goes to the Login page
  
  @TestSuit_home_05
  Scenario: From the home page user click the Register link
  Given User in the home page
  When User clicks the register link
  Then The user redirected to Registration page
  
  