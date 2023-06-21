package page;

import base.Base;
import org.openqa.selenium.WebDriver;
import paths.PokemonPath;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PokemonPage extends Base {

    private PokemonPath pokemonPath = new PokemonPath();

    public PokemonPage(WebDriver driver) {
        super(driver);
    }

    public PokemonPage() {
        super();
    }

    public void entryToTheWebsite() {
        new PokemonPage(driver);
        chromeDriverConnection();
        visit(PokemonPath.url);
        maximize();
    }

    public boolean validateWebsiteAvailability(String title) {
        boolean flag = false;
        String text = getText(pokemonPath.titlePage);
        if (text.trim().equals(title.trim())) {
            flag = true;
        } else {
            Logger.getGlobal().log(Level.INFO, "The title is incorrect", pokemonPath.titlePage);
        }
        return flag;
    }

    public void clickShowAllPokemons() throws InterruptedException {
        implicitWait(2000);
        click(pokemonPath.btnListPokemon);
    }

    public void clickCreateNewPokemon() throws InterruptedException {
        implicitWait(2000);
        click(pokemonPath.btnNewPokemon);
    }

    public void enterPokemonData(String valID, String valName, String valColor, String valLevel) throws InterruptedException {
        implicitWait(2000);
        type(valID, pokemonPath.inputID);
        type(valName, pokemonPath.inputName);
        type(valColor, pokemonPath.inputColor);
        type(valLevel, pokemonPath.inputLevel);
    }

    public void createPokemon() throws InterruptedException {
        implicitWait(2000);
        click(pokemonPath.btnCreateNewPokemon);
        implicitWait(2000);
    }

    public boolean validateCreatedPokemon() {
        boolean flag = false;
        String textAlert = alertGetText();
        if (textAlert.trim().equals("Pokemon created!")) {
            flag = true;
        } else {
            Logger.getGlobal().log(Level.INFO, "Wrong pokemon creation", textAlert);
        }
        alertAccept();
        click(pokemonPath.btnListPokemon);
        return flag;
    }

    public void thePokemonsAreListed(){
        String pokemon = getText(pokemonPath.listPokemon);
    }
}
