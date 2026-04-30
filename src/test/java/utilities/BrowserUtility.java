package utilities;

import constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtility {

    private WebDriver driver;

    protected BrowserUtility(WebDriver driver){
        super();
        this.driver = driver;
    }

    protected BrowserUtility(String driver){
        super();
        if(driver.equalsIgnoreCase("chrome")){
            this.driver = new ChromeDriver();
        } else if(driver.equalsIgnoreCase("edge")) {
            this.driver = new EdgeDriver();
        }else{
            System.out.println("Invalid Browser Name");
        }
    }

    protected BrowserUtility(Browser driver){
        super();
        if(driver == Browser.CHROME){
            this.driver = new ChromeDriver();
        } else if(driver == Browser.EDGE) {
            this.driver = new EdgeDriver();
        }else{
            System.out.println("Invalid Browser Name");
        }
    }

    public void gotoWebsite(String URL){
        driver.get(URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void maximizaBrowser(){
        driver.manage().window().maximize();
    }

    public void clickOn(By locator){
        WebElement ele = driver.findElement(locator);
        ele.click();
    }

    public void enterText(By locator , String text){
        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }

    public String getText(By locator){
        WebElement ele = driver.findElement(locator);
        return ele.getText();
    }
}
