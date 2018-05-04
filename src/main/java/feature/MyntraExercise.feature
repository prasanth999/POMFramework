Feature: Purchase the sunglasses in myntra ecommerce application

@smoke
Scenario Outline: Add the sunglass in to cart
And Enter the sunglass from the search textbox as <value>
When Print all unique brand names of sunglasses
When get the count of the sunglasses with 40% discount and product should be unisex product
When click on green color filter icon
When click on second listed search result of the sunglasses
When verify the name of product
When verify the product price
When click on add to bag
When click on go to bag
When verify the product name
When verify the price is correct


Examples:
|value|
|sunglasses|