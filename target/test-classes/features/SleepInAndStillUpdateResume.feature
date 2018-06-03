Feature: Sleep in and resume still updates
@dice
  Scenario: As a human being, I should be able to sleep in, and receive the same opportunities as those "morning people"
    Given the user is on Dice.com
    And they log in
    And go to the profile page
    Then the resume should be updated while I'm sound asleep

