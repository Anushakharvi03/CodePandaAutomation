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

#
#@Buffer
#Scenario: verify video is loading or not
#
##Given user launch site url
#When cursor hover on the play button
#Then click on play button







