Feature: Verify login

  #Author: Gnnanavel S
  Scenario: Login validation
    Given Enter a URL
    When Click on login button
    And Enter valid username and password <"gnnanavel@gmail.com"> and <"26Nov@2001">
    Then Login Successful
    And logout the website