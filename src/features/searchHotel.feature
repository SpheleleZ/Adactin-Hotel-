Feature: Adactin Hotel Searching Hotels

  Background:
    Given browser is launched
    And Adactin Hotel build two "https://adactinhotelapp.com/HotelAppBuild2/index.php" is open
    Then verify login page is open and it is build two

  @SmokeTest
  Scenario Outline: Testing if user can search for Hotels
    When user enters <username> and <password>
    And chick on login button
    Then verify user logged in successfully
    And select the <location> and <hotel>
    And select room <type> and number of <rooms>
    When enters check in <inDate> and check out <outDate>
    And select how many Adults per room <adultPerRoom> and Children per room <childPerRoom>
    And click on search button
    Then verify if list of Hotels or Hotel is displayed
    And verify name in the form
    And close the browser
    Examples:

      | username  | password   | location  | hotel          | type   | rooms | inDate     | outDate    | adultPerRoom | childPerRoom |
      | SpheleleZ | Nok2lasphe | Melbourne | Hotel Sunshine | Double | 2     | 14/02/2024 | 24/02/2024 | 3            | 2            |