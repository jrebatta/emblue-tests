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
        implicitWait(2000);
        click(pokemonPath.btnListPokemon);
    }

    public void thePokemonsAreListed() {
        String pokemon = getText(pokemonPath.listPokemon);
    }

    public void iClickOnCreateNewPokemon() throws InterruptedException {
        implicitWait(2000);
        click(pokemonPath.btnNewPokemon);
    }

    public void enterTheDataOfThePokemon(String valID, String valName, String valColor, String valLevel) throws InterruptedException {
        implicitWait(2000);
        type(valID,pokemonPath.inputID);
        type(valName,pokemonPath.inputName);
        type(valColor,pokemonPath.inputColor);
        type(valLevel,pokemonPath.inputLevel);
    }

    public void createPokemon() throws InterruptedException {
        implicitWait(2000);
        click(pokemonPath.btnCreateNewPokemon);
        implicitWait(2000);
    }

    public boolean validateCreatedPokemon() {
        boolean flag = false;
        String textAlert = alertgetText();
        if (textAlert.trim().equals("Pokemon created!")){
            flag = true;
        } else {
            Logger.getGlobal().log(Level.INFO, "Wrong pokemon creation", textAlert);
        }
        alertAcept();
        click(pokemonPath.btnListPokemon);
        return flag;
    }




}


