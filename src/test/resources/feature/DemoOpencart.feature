@Testcase_Feature
Feature: Demo.Opencart website

  @tc01_register
  Scenario: Registering valid details
    Given the user launch the browser for valid register
    When the  user opens opencart register page
    Then the user enters the valid register details
    Then the user close the register page

  @tc2_login
  Scenario Outline: Login with Valid details
    Given a user launch the browser
    When the user opens opencart login page
    Then the user login using <username> and <password>
    Then the user close the login page

    Examples: 
      | username | password |
      | name1    |       20 |

  @tc03_search
  Scenario: Searching products in opencart website
    Given launch the browser
    When the user opens the opencart search page
    Then the user search the product
    Then the user close the search page

  @tc04_Special
  Scenario: Special offers in opencart website
    Given the user to open browser chrome
    When the user clicks on the specials
    Then the user will see the specials and add to the cart
    Then the user close the site and browser

  @tc05_selectproduct
  Scenario: To select product
    Given user opens the chrome browser
    Then user select product
    And user add the product to cart
    Then close the opencart page

  @tc06_forgotpass
  Scenario: The user forgets password
    Given the user opens broswer
    When the user clicks on my accounts and login
    And the user clicks on forgot button
    Then the user enters the email and clicks continue
    Then the user close the page

  @tc07_currency
  Scenario: to choose the currency
    Given the user launches the chrome browser
    Then the user clicks on currency and choose  currency
    Then the user choose the product
    Then the user close the opencart
