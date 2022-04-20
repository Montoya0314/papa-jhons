#Autor miguel0314@gmail.com

 Feature: As a user, I want to navigate through the page to check locations availability

   @checkingLinks
   Scenario: Navigating checking location link functionality
     Given The user is on the page
     When The user click on the locations link
     Then The user validates the banner text Encuentra tu restaurante más cercano aquí

   @checkingCities
   Scenario: Matching list of cities available
     Given The user is on the page
     When The user select location link
     Then The user validates the list of cities

  @selectACity
  Scenario: Navigating through the page checking locations
    Given The user is on the page
    When The user select a city
      |city    |
      |MEDELLÍN    |
    Then The user validates the phone number Telefono: 6082228

   @selectACityWithoutPhone
   Scenario: Navigating through the page
     Given The user is on the page
     When The user select a city
       |city    |
       |ARMENIA |
     Then The user validates the phone number Telefono: 7362662

   @lookForAStore
   Scenario: Find a store within a city
     Given The user is on the page
     When The user select a city
       |city    |
       |ENVIGADO    |
     Then The user validates if the store exists PJ Viva Envigado
