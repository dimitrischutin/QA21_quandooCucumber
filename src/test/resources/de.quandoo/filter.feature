Feature: Quandoo Filter Feature
  check filter Top rated
  check African filter in Cuisine filter

  @positiveScenarioFilter
  Scenario: Successful Filter
    Given I am on the Homepage
    When I input Berlin
    And I click  Find button
    Then I see RestBerlin page

    When I click  Top rated filter
    Then rating of the first restaurant is more than 4

    When I click African in Cuisine filter
    Then the first restaurant has African cuisine label
