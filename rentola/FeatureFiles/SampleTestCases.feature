Feature: web login

  @Login
  Scenario Outline: Validate the user is able to login rentrola application
    Given user is launch the rentrola application "<TestCase ID>"
    When enter the user name and password
    Then user is able to login successfully

    Examples: 
      | TestCase ID |
      | TC001       |
    
      
