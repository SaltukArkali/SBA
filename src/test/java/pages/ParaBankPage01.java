package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParaBankPage01 {

    public ParaBankPage01(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Customer Login']")
    public WebElement customerLogin;

    @FindBy(name = "username")
    public WebElement usernameBox;
    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;

    @FindBy(xpath = "//h1[.='Accounts Overview']")
    public WebElement accountsOverviewTitle;

    @FindBy(xpath = "//*[@class='smallText']")
    public WebElement nameSurnameText;

    @FindBy(className = "ng-binding")
    public WebElement totalAmount;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutLink;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//p[@class='error']")
    public WebElement errorText;

}
