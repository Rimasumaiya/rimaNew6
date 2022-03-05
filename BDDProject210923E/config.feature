Feature:login validation

Scenario:As a user should be logged in using valid credantial

Given open browser
And go to url

When user type userid in user text box
And user type password in pass text box
And user click on login button

Then user should be in his profile page(result)

