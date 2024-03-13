Feature: Verify Item

  #Author: Gnnanavel S
  Scenario: Login validation
    Given Enter a URL
    When Click on login button
    And Enter valid username and password <"gnnanavel@gmail.com"> and <"26Nov@2001">
    Then Login Successful

  Scenario: Book page validation
    When Click on Book page
    And Click on sort option
    And Click on Price low to high
    Then Click on the item

  Scenario: Item page validation
    When Enter Quantity number <"2">
    Then Click on add to cart
    And Click on Shopping Cart
    And logout the website
