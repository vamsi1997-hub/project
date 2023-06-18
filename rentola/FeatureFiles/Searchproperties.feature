Feature: search functionality

  @search
  Scenario: Validate the user is able to Search button rentrola application
    Given user is launch the rentrola application
    When user is click the search button
    And user is search the hyderabad location rentals
    Then user click the hyderabad location rentals
