package page;

import base.Base;
import paths.PokemonPath;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PokemonPage extends Base{

    PokemonPath pokemonPath = new PokemonPath();

    public PokemonPage(WebDriver driver){
        super(driver);
    }

    public PokemonPage(){
        super();
    }


    public void entryToTheWebsite() {
        new PokemonPage(driver);
        chromeDriverConnection();
        visit(PokemonPath.url);
        maximize();
    }

    public boolean iValidateThatTheWebsiteIsAvailable(String title) {
        boolean flag = false;
        String text = getText(pokemonPath.titlePage);
        if (text.trim().equals(title.trim())){
            flag = true;
        } else {
            Logger.getGlobal().log(Level.INFO, "The title is incorrect", pokemonPath.titlePage);
        }
        return flag;
    }


    public void iClickOnShowAllPokemons() throws InterruptedException {
        Wait("2000");
        click(pokemonPath.listPokemon);
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
