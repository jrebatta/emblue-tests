package stepdefinition;

import step.PokemonStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PokemonStepDefinition {

    PokemonStep pokemonStep = new PokemonStep();

    @Given("Entry to the website")
    public void entryToTheWebsite() {
        pokemonStep.entryToTheWebsite();
    }

    @And("I validate that the website is available {string}")
    public void iValidateThatTheWebsiteIsAvailable(String title) {
        pokemonStep.iValidateThatTheWebsiteIsAvailable(title);
    }

    @When("I click on Show all pokemons")
    public void iClickOnShowAllPokemons() throws InterruptedException {
        pokemonStep.iClickOnShowAllPokemons();
    }

    @Then("The pokemons are listed")
    public void thePokemonsAreListed() {
    }

    @When("I click on Create new pokemon")
    public void iClickOnCreateNewPokemon() {
    }

    @And("enter the data of the pokemon")
    public void enterTheDataOfThePokemon() {
    }

    @And("create pokemon")
    public void createPokemon() {
    }

    @Then("Validate created pokemon")
    public void validateCreatedPokemon() {
    }



}
