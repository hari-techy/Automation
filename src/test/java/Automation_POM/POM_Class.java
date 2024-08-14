package Automation_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class POM_Class {
    public WebDriver driver;

    public POM_Class(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement login;
@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
    private WebElement dis;
@FindBy(xpath = "//input[@placeholder='Name']")
   private WebElement Username;
@FindBy(xpath = "//input[@data-qa='signup-email']")
 private WebElement email;
@FindBy(xpath="//button[@data-qa='signup-button']")
private WebElement up;
@FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
private WebElement check;
@FindBy(xpath = "//input[@value='Mr']")
public WebElement Title;
@FindBy(xpath = "//input[@name='password']")
public WebElement password;
@FindBy(xpath = "//select[@name='days']")
public WebElement date;
@FindBy(xpath = "//select[@name='months']")
public WebElement month;
@FindBy(xpath = "//select[@name='years']")
public WebElement years;
@FindBy(xpath = "//input[@name='newsletter']")
public WebElement select;
@FindBy(xpath = "//input[@name='first_name']")
public WebElement FirstName;
@FindBy(xpath = "//input[@name='last_name']")
public WebElement LastName;
@FindBy(xpath = "//input[@name='company']")
public WebElement Company;
@FindBy(xpath = "//input[@data-qa='address']")
public WebElement Address;
@FindBy(xpath = "//input[@id='address2']")
public WebElement  Address2;
@FindBy(xpath = "//select[@data-qa='country']")
public  WebElement country;
@FindBy(xpath = "//input[@data-qa='state']")
public WebElement State;
@FindBy(xpath = "//input[@data-qa='city']")
public WebElement city;
@FindBy(xpath = "//input[@data-qa='zipcode']" )
public WebElement Pincode;
@FindBy(xpath = "//input[@data-qa='mobile_number']")
public WebElement Number;
@FindBy(xpath = "//button[normalize-space()='Create Account']")
public WebElement Createaccount;
@FindBy(xpath = "")
public WebElement verified;
@FindBy(xpath = "//a[normalize-space()='Continue']")
public  WebElement continuebutton;
@FindBy(xpath = "//h2[@class='title text-center']//b")
public  WebElement logverified;
@FindBy(xpath = "//a[normalize-space()='Delete Account']")
public WebElement Deleted;
@FindBy(xpath = "//a[@class='btn btn-primary']")
public WebElement button;
/*@FindBy(xpath = "//input[@data-qa='login-email']")
public WebElement ee;
@FindBy(xpath = "//input[@placeholder='Password']")
public WebElement ss;
@FindBy(xpath = "//button[@data-qa='login-button']")
public WebElement log;*/

public WebElement getLogin(){
    return login;
}
public WebElement getdis(){
    return dis;
}
public WebElement getUsername() {
    return Username;
    }
    public WebElement getEmail() {
    return email;
    }
    public WebElement getUp() {
    return up;
    }

    public WebElement getCheck() {
        return check;
    }
    public WebElement getTitle() {
        return Title;
    }
    public WebElement getPassword(){
        return password;
    }

    public WebElement getDate() {
        return date;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYears() {
        return years;
    }

    public WebElement getSelect() {
        return select;
    }

    public WebElement getFirstName() {
        return FirstName;
    }

    public WebElement getLastName() {
        return LastName;
    }

    public WebElement getCompany() {
        return Company;
    }

    public WebElement getAddress() {
        return Address;
    }
    public WebElement getAddress2() {
        return Address2;
    }

    public WebElement getCountry() {
     return country;
    }

    public WebElement getState() {
        return State;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getPincode() {
        return Pincode;
    }

    public WebElement getNumber() {
        return Number;
    }

    public WebElement getCreateaccount() {
        return Createaccount;
    }

    public WebElement getVerified() {
        return verified;
    }

    public WebElement getContinuebutton() {
        return continuebutton;
    }

    public WebElement getLogverified() {
        return logverified;
    }

    public WebElement getDeleted() {
        return Deleted;
    }

    public WebElement getButton() {
        return button;
    }

    /*public WebElement getEe() {
        return ee;
    }
    public WebElement getSs(){
    return ss;
    }
    public WebElement getLog() {
    return log;
    }*/
}
