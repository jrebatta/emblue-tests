package step;

import base.Base;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import page.PokemonPage;

public class PokemonStep {

    private PokemonPage pokemonPage;

    public PokemonStep() {
        pokemonPage = new PokemonPage();
    }

    public void entryToTheWebsite() {
        pokemonPage.entryToTheWebsite();
    }

    public void iValidateThatTheWebsiteIsAvailable(String title) {
        Assert.assertTrue(pokemonPage.validateWebsiteAvailability(title));
    }

    public void iClickOnShowAllPokemons() throws InterruptedException {
        pokemonPage.clickShowAllPokemons();
    }

    public void iClickOnCreateNewPokemon() throws InterruptedException {
        pokemonPage.clickCreateNewPokemon();
    }

    public void enterTheDataOfThePokemon(DataTable dataTable) throws InterruptedException {
        String id = Base.getValueFromDataTable(dataTable, "ID");
        String name = Base.getValueFromDataTable(dataTable, "Name");
        String color = Base.getValueFromDataTable(dataTable, "Color");
        String level = Base.getValueFromDataTable(dataTable, "Level");

        pokemonPage.enterPokemonData(id, name, color, level);
    }

    public void createPokemon() throws InterruptedException {
        pokemonPage.createPokemon();
    }

    public void validateCreatedPokemon() {
        Assert.assertTrue(pokemonPage.validateCreatedPokemon());
    }

    public void thePokemonsAreListed() {
        pokemonPage.thePokemonsAreListed();
    }
}
