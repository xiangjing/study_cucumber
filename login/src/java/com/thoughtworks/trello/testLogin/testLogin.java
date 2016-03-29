import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testLogin {
    WebDriver dr;

    @Given("^Trello login page has been opened$")
    public void trelloLoginPageHasBeenOpened() throws Throwable {
        dr = new FirefoxDriver();
        dr.get("https://www.trello.com");
    }

    @And("^Input user name \"([^\"]*)\"and password \"([^\"]*)\"$")
    public void inputUserNameAndPassword(String arg0, String arg1) throws Throwable {
        dr.findElement(By.className("quiet")).click();
        dr.findElement(By.id("user")).sendKeys(arg0);
        dr.findElement(By.id("password")).sendKeys(arg1);
    }


    @And("^Click login$")
    public void clickLogin() throws Throwable {
        dr.findElement(By.id("login")).click();
        Thread.sleep(100000);
    }

    @Then("^login success$")
    public void loginSuccess() throws Throwable {
        if(dr.getCurrentUrl().equals("https://trello.com/") ){
            System.out.println("ͨ123");
        }
        else {
            System.out.println("234");
        }
        System.out.println(dr.getCurrentUrl());
    }


}
