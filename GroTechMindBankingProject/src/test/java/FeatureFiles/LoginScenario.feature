Feature: Validate SignUp Functionallity of GroTechMinds Banking Application

Scenario Outline: Validate SignUp Functionallity of GroTechMinds Banking Application

#https://grotechmindsbanking.tilda.ws/registration

Given user launch the url for banking application
And user enter firstname as "<firstname>"
And user enter lastname as "<lastname>"
And user enter phone as "<phonenumber>"
And user enter DOB as "<dateofbirth>"
And user selects gender as "<firstname>"
And user enter city name as "<cityname>"
And user enter userid as "<uid>"
And user enter password as "<password>"

Examples:

