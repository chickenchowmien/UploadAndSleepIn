
Feature: TESTING UINAMES API

  USERS SHOULD BE ABLE TO SUBMIT GET AND POST REQUESTS TO THE UINAMES WEB SERVICE
  @UINAMES
    Scenario: Send GET request for 5 name
      When the user sends a request for 5 name
      Then the server should send back 5 name

    Scenario: Send a GET request for a female name
      When the user sends a request for 1 female name
      Then the server should send back 1 female name


