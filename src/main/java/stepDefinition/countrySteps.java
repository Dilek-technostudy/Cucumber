package stepDefinition;
import PageObjectModel.leftNav;
import PageObjectModel.signInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class countrySteps {
    WebDriver driver;
    signInPage sip =new signInPage();
    leftNav lv = new leftNav();


    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get( "https://test-basqar.mersys.io" );
        driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS );
    }


    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {


        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
}


    @Given("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {
        lv.clickondropdownSetup();
    }

    @Given("^Click on parameters$")
    public void click_on_parameter() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^Click on countries$")
    public void click_on_countries() throws Throwable {
        lv.clickonbuttonCountries();
    }



}
