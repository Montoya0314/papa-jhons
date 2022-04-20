#Autor miguel0314@gmail.com

Feature: As user I want to perform manual tests of PapaJohns website to check its functionality

  Scenario: Checking availability for Armenia and Villavicencio
    Given the user in on the page
    When the user select locations links
    And select Armenia or Villavicencio
    Then validates there is at least 1 store available

  Scenario: Checking phone numbers for Armenia and Villavicencio
    Given the user in on the page
    When the user select locations links
    And select Armenia or Villavicencio
    Then validates there is a phone number for each city

  Scenario: Checking if the cart is empty
    Given the user in on the page
    When the user select the cart option
    Then the user will see an information message showing the cart is empty

  Scenario: Checking my orders link
    Given the user in on the page
    When the user select my orders link
    Then the user will be asked to login