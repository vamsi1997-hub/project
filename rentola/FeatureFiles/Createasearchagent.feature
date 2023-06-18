Feature: search functionality

@CreateSearch
Scenario: Validate the user is create a search agent 
Given user is launch the rentrola application
When user navigate to home page
And user click the create a search agent button
And user give the valid email id
And user give the valid first name
And user give the city
And user select the number of rooms
And user give the rent amount
And user select property type
And user give the radius
Then user click the Create a search agent button





