Feature: login functionality

@Login
Scenario: verify login functionality with valid details

#Given user launch site url
When user enter username and password
And user click on button
Then validate successfull login
#Then validate success message

@Smoke
Scenario: verify login functionality with invalid details

#Given user launch site url
When user enter username and password
And user click on button
Then validate error login







