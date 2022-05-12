Feature: As an User,I want to check a selected product is added to add to bag section

Scenario: TC_01 Product is added to bag by selectina product

Given I launch the browser and AmeriMark Site
When I give a product in searchbar
Then I verify list of product  is displayed
When I select a product 
Then verify the product detail page is listed 
When I select color,size, and quantity the product and click on add to bag button
Then I verify a pop comes with selected items details
And I click on CheckOut button
Then verify I land on to shopping bag cart