Feature: Cookies part 2
  Scenario:  If I have no cookies
    Given I have 0 cookies in my belly
    When I wait 0 hour
    Then my belly should growl