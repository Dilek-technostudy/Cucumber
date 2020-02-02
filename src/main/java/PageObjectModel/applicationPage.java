package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class applicationPage extends AbstractClass {

    private WebDriver driver ;


    public applicationPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(css = "svg[data-icon='plus']" )
    private WebElement plusButton;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully created')]")
    private WebElement successfulMessage;

    //  find all is working like driver.findElements
    @FindAll({
            @FindBy(xpath="//tbody//tr//td[2]")
    }  )
    private List<WebElement> tableListofNames;

    public void clickPlusButton(){
        clickFunction( plusButton );
    }

    public void clickSaveButton(){
        clickFunction( saveButton );
    }

    public void nameIsCreated(String value) throws InterruptedException {

        waitUntilVisibility(successfulMessage);
        waitUntilInVisibility( successfulMessage );
        System.out.println(tableListofNames.size()+"<-------------");
        verifyCreated( tableListofNames ,value );
    }


}