Feature: Cookies
  Scenario: If I have few cookies
    Given I have 42 cookies in my belly
    When I wait 1 hour
    Then my belly should growl