Feature: Login features
This feature includes sceanrio that would be validate the following feature
1) Register new user name

# Background: 
# Given I should be able to enter all details for the Login page

Scenario: Register new user name 
Given I should be able to enter all details for the Login page
When I click on the sign up button
When I enter the firstname as "Sowmya"
And I enter the lastname as "Prasad"
And I enter the e-mail as "sowmyap190@gmail.com"
And I enter the username as "sowmyap190"
And I enter the password as "sowmyap190"
And I enter the confirmpassword as "sowmyap190"
And I click on the registration button
And I click on the picture button
And I click on the inbox button
And I click on the compose button
And I click on sendto as "sowmyap1234@gmail.com"
And I enter the subject as "Hi For Testing"
# And I enter the body as "Hello Ms Sowmya This is for Testing From, Sowmya"
And I click on the Send Message button
Then I should see the acknowledgement window as "The message has been sent to Sowmya Prasad (sowmyap1234)"