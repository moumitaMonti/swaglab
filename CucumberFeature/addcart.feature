Feature: shopping cart funtionality test
Scenario: checkout item sucessfully
Given I am on homepage
When I enter username and password
And I click on login button
And I add lowest price item
And I add another item
And I click on cart
Then  selected item should be added on cart
When I remove one item
And I click continue shopping
And I add again other item
And I click again on cart
And I click on checkout
And I enter first name
And I enter last name
And I enter zipcode
And I click proceed
Then items added with exact total price
When I click finish
Then  I get THANK YOU FOR YOUR ORDER message sucessfully