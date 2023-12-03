package Pages;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	WebDriver driver;  //Declaring WebDriver Globally 
	Properties prop;
	public HomePage(WebDriver driver) throws Exception {
		this.driver=driver;
		FileInputStream File = new FileInputStream("src\\test\\resources\\reads\\setup.properties");
		prop = new Properties();
		prop.load(File);  
	}
	
	@FindBy(id="nav-logo") 
	private WebElement amazonlogo;
	
	@FindBy(id = "nav-link-accountList")  
	private WebElement signinotiopn;
	
	@FindBy(id="continue") 
	private WebElement continuebutton;
	
	@FindBy(id="twotabsearchtextbox") 
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-text") 
	private WebElement searchbutton;
	
	@FindBy(id="NATC_SMART_WAGON_CONF_MSG_SUCCESS") 
	private WebElement addedtocartprompt;
	
	@FindBy(id="sc-buy-box-ptc-button") 
	private WebElement proceedtocheckoutbutton;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[8]") 
	private WebElement searchproduct;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img") 
	private WebElement selectedproduct;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]")
	private WebElement price;
	
	@FindBy(id="submit.add-to-cart") 
	private WebElement selectaddtocart;
	
	@FindBy(xpath="//*[@id=\"p_n_feature_twenty-nine_browse-bin/81332996031\"]/span/a/div") 
	private WebElement filterByMemory;

	public boolean checkiflogoisdispalyed() {
		return amazonlogo.isDisplayed();
	}
	
	public void enterValueInSearchBox(String ProductName) {
		searchbox.sendKeys(ProductName);
	}
	
	public void clickonsearchbutton() {
		searchbutton.click();
	}
	
	public boolean searchproductpage() {
		return searchproduct.isDisplayed();
	}
	
	public void selectproduct() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		String Price = price.getText();
		System.out.print(Price);   
		selectedproduct.click();
	}
	
	public void clickaddtocart() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		selectaddtocart.click();	
	}
	
	public String addedtocartprompt() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
        return addedtocartprompt.getText();
        }
	
	public String proceedtocheckoutbutton() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		return proceedtocheckoutbutton.getText();
	}
	
	public void clickonproceedtocheckoutbutton() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		proceedtocheckoutbutton.click();
	}
	
	public void clickMemoryStorageCheckBox() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		filterByMemory.click();
	}
}
