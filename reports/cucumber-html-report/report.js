$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/DemoOpencart.feature");
formatter.feature({
  "line": 2,
  "name": "Demo.Opencart website",
  "description": "",
  "id": "demo.opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Registering valid details",
  "description": "",
  "id": "demo.opencart-website;registering-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the browser for valid register",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the  user opens opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the valid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user close the register page",
  "keyword": "Then "
});
formatter.match({
  "location": "Registersd.the_user_launch_the_browser_for_valid_register()"
});
formatter.result({
  "duration": 22677287501,
  "status": "passed"
});
formatter.match({
  "location": "Registersd.the_user_opens_opencart_register_page()"
});
formatter.result({
  "duration": 3901979301,
  "status": "passed"
});
formatter.match({
  "location": "Registersd.the_user_enters_the_valid_register_details()"
});
formatter.result({
  "duration": 3536484300,
  "status": "passed"
});
formatter.match({
  "location": "Registersd.the_user_close_the_register_page()"
});
formatter.result({
  "duration": 905016700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Login with Valid details",
  "description": "",
  "id": "demo.opencart-website;login-with-valid-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@tc2_login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "a user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "demo.opencart-website;login-with-valid-details;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "demo.opencart-website;login-with-valid-details;;1"
    },
    {
      "cells": [
        "name1",
        "20"
      ],
      "line": 20,
      "id": "demo.opencart-website;login-with-valid-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Login with Valid details",
  "description": "",
  "id": "demo.opencart-website;login-with-valid-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 11,
      "name": "@tc2_login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "a user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user login using name1 and 20",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsd.a_user_launch_the_browser()"
});
formatter.result({
  "duration": 25083312100,
  "status": "passed"
});
formatter.match({
  "location": "Loginsd.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 2158651800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 21
    },
    {
      "val": "20",
      "offset": 31
    }
  ],
  "location": "Loginsd.the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 7777928100,
  "status": "passed"
});
formatter.match({
  "location": "Loginsd.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 4934467700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Searching products in opencart website",
  "description": "",
  "id": "demo.opencart-website;searching-products-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tc03_search"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user opens the opencart search page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the user close the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "Searchsd.launch_the_browser()"
});
formatter.result({
  "duration": 21066619000,
  "status": "passed"
});
formatter.match({
  "location": "Searchsd.the_user_opens_the_opencart_search_page()"
});
formatter.result({
  "duration": 427229000,
  "status": "passed"
});
formatter.match({
  "location": "Searchsd.the_user_search_the_product()"
});
formatter.result({
  "duration": 1975567699,
  "status": "passed"
});
formatter.match({
  "location": "Searchsd.the_user_close_the_search_page()"
});
formatter.result({
  "duration": 1318714101,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Special offers in opencart website",
  "description": "",
  "id": "demo.opencart-website;special-offers-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tc04_Special"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "the user to open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "the user clicks on the specials",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "the user will see the specials and add to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "the user close the site and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Specialssd.the_user_to_open_browser_chrome()"
});
formatter.result({
  "duration": 20957556401,
  "status": "passed"
});
formatter.match({
  "location": "Specialssd.the_user_clicks_on_the_specials()"
});
formatter.result({
  "duration": 2238726900,
  "status": "passed"
});
formatter.match({
  "location": "Specialssd.the_user_will_see_the_specials_and_add_to_the_cart()"
});
formatter.result({
  "duration": 200781001,
  "status": "passed"
});
formatter.match({
  "location": "Specialssd.the_user_close_the_site_and_browser()"
});
formatter.result({
  "duration": 1279365400,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "To select product",
  "description": "",
  "id": "demo.opencart-website;to-select-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@tc05_selectproduct"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user opens the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user select product",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user add the product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "close the opencart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Selectprodsd.user_opens_the_chrome_browser()"
});
formatter.result({
  "duration": 22859154900,
  "status": "passed"
});
formatter.match({
  "location": "Selectprodsd.user_select_product()"
});
formatter.result({
  "duration": 6647790900,
  "status": "passed"
});
formatter.match({
  "location": "Selectprodsd.user_add_the_product_to_cart()"
});
formatter.result({
  "duration": 129056800,
  "status": "passed"
});
formatter.match({
  "location": "Selectprodsd.close_the_opencart_page()"
});
formatter.result({
  "duration": 1482290000,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "The user forgets password",
  "description": "",
  "id": "demo.opencart-website;the-user-forgets-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@tc06_forgotpass"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the user opens broswer",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "the user clicks on my accounts and login",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the user clicks on forgot button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "the user enters the email and clicks continue",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "the user close the page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgetpassSd.the_user_opens_broswer()"
});
formatter.result({
  "duration": 18306229200,
  "status": "passed"
});
formatter.match({
  "location": "ForgetpassSd.the_user_clicks_on_my_accounts_and_login()"
});
formatter.result({
  "duration": 2149030601,
  "status": "passed"
});
formatter.match({
  "location": "ForgetpassSd.the_user_clicks_on_forgot_button()"
});
formatter.result({
  "duration": 1681128900,
  "status": "passed"
});
formatter.match({
  "location": "ForgetpassSd.the_user_enters_the_email_and_clicks_continue()"
});
formatter.result({
  "duration": 4283889200,
  "status": "passed"
});
formatter.match({
  "location": "ForgetpassSd.the_user_close_the_page()"
});
formatter.result({
  "duration": 694414901,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "to choose the currency",
  "description": "",
  "id": "demo.opencart-website;to-choose-the-currency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@tc07_currency"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "the user launches the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "the user clicks on currency and choose  currency",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "the user choose the product",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "the user close the opencart",
  "keyword": "Then "
});
formatter.match({
  "location": "CurrencySd.the_user_launches_the_chrome_browser()"
});
formatter.result({
  "duration": 18400372400,
  "status": "passed"
});
formatter.match({
  "location": "CurrencySd.the_user_clicks_on_currency_and_choose_currency()"
});
formatter.result({
  "duration": 3418235800,
  "status": "passed"
});
formatter.match({
  "location": "CurrencySd.the_user_choose_the_product()"
});
formatter.result({
  "duration": 5850125600,
  "status": "passed"
});
formatter.match({
  "location": "CurrencySd.the_user_close_the_opencart()"
});
formatter.result({
  "duration": 1148427900,
  "status": "passed"
});
});