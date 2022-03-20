package paths;

import org.openqa.selenium.By;

public class PokemonPath {

    public static String url = "https://emblue-qa-challenge.vercel.app/";
    public By titlePage = By.xpath("//*[@id=\"root\"]/div/div/h3");
    public By listPokemon = By.xpath("//*[@id=\"root\"]/div/div/div/div/button[1]");


}
