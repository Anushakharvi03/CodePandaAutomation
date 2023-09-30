Feature: payment functionality

@Reg @Smoke
Scenario: payment with card

#Given user launch site url
When user enter username and password
#When user login with valid details
#And user click on button
Then validate successfull login
#When user enter card number
#And click on pay button
#Then validate successfull order

@Reg
Scenario: payment with UPI

When user enter username and password
Then validate successfull login

@Reg
Scenario: payment with COD

When user enter username and password
Then validate successfull login


#@Buffer
#Scenario: verify video is loading or not
#
##Given user launch site url
#When cursor hover on the play button
#Then click on play button