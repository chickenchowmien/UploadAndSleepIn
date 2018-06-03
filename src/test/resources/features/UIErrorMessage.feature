Feature: Verifying number of customers returned
  Scenario: Verifying number of customers returned in API
    When the user sends a request for a female name
    Then we should get back a good status code
    And the gender should be female