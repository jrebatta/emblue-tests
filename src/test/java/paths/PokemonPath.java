package paths;

import org.openqa.selenium.By;

public class PokemonPath {

    public static String url = "https://emblue-qa-challenge.vercel.app/";
    public By titlePage = By.xpath("//*[@id=\"root\"]/div/div/h3");
    public By btnListPokemon = By.xpath("//*[@id=\"root\"]/div/div/div/div/button[1]");
    public By btnNewPokemon = By.xpath("//*[@id=\"root\"]/div/div/div/div/button[2]");
    public By listPokemon = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div");
    public By listPokemonCreated = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div");
    public By inputID = By.id("idInput");
    public By inputName = By.id("nameInput");
    public By inputColor = By.id("colorInput");
    public By inputLevel = By.id("levelInput");
    public By btnCreateNewPokemon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button");





}
