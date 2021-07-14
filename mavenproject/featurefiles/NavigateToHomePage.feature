Feature: NavigateToHomePage

Scenario: Select Careers on Home Page
  
Given I navigate to home page
When I click on Careers link
And Select South Africa
And I click on the first job hyperlink
Then Populate the form once displayed
