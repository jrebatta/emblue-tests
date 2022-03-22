#language: en

@TESTS
  Feature: Validate correct operation of Capsule Corp - Monitoring System

    @TEST1
    Scenario: List Pokemons in the system
      Given Entry to the website
      And I validate that the website is available "Capsule Corp - Tracking System"
      When I click on Show all pokemons
      Then The pokemons are listed

    @TEST2
    Scenario: Create new pokemon
      Given Entry to the website
      And I validate that the website is available "Capsule Corp - Tracking System"
      When I click on Create new pokemon
      And enter the data of the pokemon
        | ID | Name       | Color    | Level |
        | 2  | Charmander | Orange   | 13    |
      And create pokemon
      Then Validate created pokemon













