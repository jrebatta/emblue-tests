package base;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.Map;

public class Base {

    public WebDriver driver;

    public Alert alert;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public Base() {

    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver2.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void login(String user, String pass){
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void visit(String url){
        driver.get(url);
    }

    public void isDisplayed(By locator){
        driver.findElement(locator).isDisplayed();
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void choose(String number, By locator) {
        Select selectList = new Select(findElement(locator));
        selectList.selectByValue(number);
    }

    public void chooseByText(String text, By locator) {
        Select selectList = new Select(findElement(locator));
        selectList.selectByVisibleText(text);
    }

    public static String getValueFromDataTable(DataTable dataTable, String title) {
        List<Map<String, String>> list = dataTable.asMaps();
        return (String)((Map)list.get(0)).get(title);
    }

    public void implicitWait(int number) throws InterruptedException {
        Thread.sleep(number);
    }

    public void alertAcept() {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public String alertgetText() {
        alert = driver.switchTo().alert();
        return alert.getText();
    }
}
