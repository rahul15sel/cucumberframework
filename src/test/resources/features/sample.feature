Feature: Basic Dummy Tests


Scenario: Test 1 - Verify addition
Given a number 5
When added with 5
Then result should be 10


Scenario: Test 2 - Verify subtraction
Given a number 20
When subtracted by 5
Then result should be 15


Scenario: Test 3 - Check string equality
Given text "Hello"
When compared with "Hello"
Then result should be equal


Scenario: Test 4 - Validate non-empty string
Given text "Automation"
Then it should not be empty


Scenario: Test 5 - Simple boolean test
Given condition true
Then framework should work