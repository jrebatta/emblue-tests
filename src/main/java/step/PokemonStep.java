package step;

import base.Base;
import io.cucumber.datatable.DataTable;
import page.PokemonPage;
import org.junit.Assert;

public class PokemonStep {

    PokemonPage pokemonPage = new PokemonPage();

    public void entryToTheWebsite() {
        pokemonPage.entryToTheWebsite();
    }

    public void iValidateThatTheWebsiteIsAvailable(String title) {
        Assert.assertTrue(pokemonPage.iValidateThatTheWebsiteIsAvailable(title));
    }

    public void iClickOnShowAllPokemons() throws InterruptedException {
        pokemonPage.iClickOnShowAllPokemons();
    }

    public void thePokemonsAreListed() {
        pokemonPage.thePokemonsAreListed();
    }

    public void iClickOnCreateNewPokemon() throws InterruptedException {
        pokemonPage.iClickOnCreateNewPokemon();
    }

    public void enterTheDataOfThePokemon(DataTable dataTable) throws InterruptedException {
        String id = Base.getValueFromDataTable(dataTable,"ID");
        String name = Base.getValueFromDataTable(dataTable,"Name");
        String color = Base.getValueFromDataTable(dataTable,"Color");
        String level = Base.getValueFromDataTable(dataTable,"Level");

        pokemonPage.enterTheDataOfThePokemon(id,name,color,level);
    }

    public void createPokemon() throws InterruptedException {
        pokemonPage.createPokemon();
    }

    public void validateCreatedPokemon() {
        Assert.assertTrue(pokemonPage.validateCreatedPokemon());

    }

}
