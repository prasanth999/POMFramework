Feature: Login for myntra ecommerce application

@smoke
Scenario Outline: Print the shoes is less than 2000
When Login to myntra application
And Enter the shoes from the search textbox as <value>
When Print the list of shoes which is less than 2000

Examples:
|value|
|shoes|

@smoke
Scenario Outline: Print the shoes brand as Nike
When Login to myntra application
And Enter the shoes from the search textbox as <value>
When Print the list of shoes as Nike

Examples:
|value|
|shoes|

Scenario Outline: Print the shoes categories is white
When Login to myntra application
And Enter the shoes from the search textbox as <value>
When Print the list of shoes categories is white

Examples:
|value|
|shoes|

