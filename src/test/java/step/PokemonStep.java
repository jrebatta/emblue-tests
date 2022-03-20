package step;


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
    }

    public void iClickOnCreateNewPokemon() {
    }

    public void enterTheDataOfThePokemon() {
    }

    public void createPokemon() {
    }

    public void validateCreatedPokemon() {
    }

}
