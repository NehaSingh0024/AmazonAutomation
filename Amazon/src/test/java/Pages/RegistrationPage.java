package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {


public RegistrationPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}


@FindBy(id="auth-customerName-missing-alert") WebElement missingcustomername;
@FindBy(id="auth-email-missing-alert") WebElement missingemail;
@FindBy(id="auth-password-missing-alert") WebElement missingpassword;
@FindBy(id="ap_customer_name") WebElement customername;
@FindBy(id="ap_email") WebElement enteremail;
@FindBy(id="ap_password") WebElement enterpassword;
@FindBy(id="ap_password_check") WebElement enterpasswordagain;
@FindBy(id="auth-continue") WebElement clickverifyemailbutton;
@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/h4[1]") WebElement registererror;
@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a" ) WebElement NewCustomerRegister;

@FindBy(id="ap_email") 
private WebElement emailfield;

@FindBy(id="continue") 
private WebElement continuebutton;

@FindBy(id="ap_password") 
private WebElement passwordfield;

@FindBy(id="auth-signin-button") 
private WebElement signinbutton;

@FindBy(id="createAccountSubmit") 
private WebElement createaccountbtn;

@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/h4") 
private WebElement warningmessage;

@FindBy(id="auth-email-missing-alert") 
private WebElement emailmissingerror;

@FindBy(xpath="//*[@id=\"ap-account-switcher-container\"]/div[1]/div/div/div[2]/h1") 
private WebElement prompttologin;


public void entercustomername(String CName) {
	customername.sendKeys(CName);
}

public void enteremail(String email) {
	enteremail.sendKeys(email);
}

public void enterpassword(String password) {
	enterpassword.sendKeys(password);
}

public void enterpasswordagain(String passwordagain) {
	enterpasswordagain.sendKeys(passwordagain);
}

public void clickverifyemailbtn() {
	clickverifyemailbutton.click();
}

public boolean registererrormessage() {
	return registererror.isDisplayed();
}

public String customernameerror() {
	return missingcustomername.getText();
}

public String emailaddresserror() {
	return missingemail.getText();
}

public String passworderror() {
	return missingpassword.getText();
}

public void clickcontinue() {
	continuebutton.click();
}

public void clicksigninbutton() {
	signinbutton.click();
}

public void clickregUserbtn() {
	createaccountbtn.click();
}
public boolean displayedwarningmessage() {
	return warningmessage.isDisplayed();
}

public boolean displayedemailmissingerror() {
	return emailmissingerror.isDisplayed();
}

public boolean prompttologin() {
	return prompttologin.isDisplayed();
}

}
