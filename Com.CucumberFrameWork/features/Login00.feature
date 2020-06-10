Feature: application Login 


Scenario: successfull login with valid credentials 
Given user launch Chrome driver
When user open url "https://www.ups.com/us/en/Home.page"
And click on login button 
And user enters Email as "nahid1243" and Password As "kingkong1234@"
And click on submit button 
Then page title should be "Home | UPS - United States"
And close browser

