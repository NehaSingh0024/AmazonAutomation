package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import BaseClass.BaseClass;
import java.util.Properties;
import Pages.HomePage;
import StepDefinition.Registration;

public class StepDefinition extends BaseClass{
	 WebDriver driver;  //Declaring WebDriver Globally 
	 Properties prop;
	 HomePage homepage;
	 Registration register;
	
	@Given("user must be on Amazon Webpage")
	public void user_must_be_on_amazon_webpage(){
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
//		BaseClass.initialization();
		
	}

	@When("user search a product in search bar by entering {string}")
	public void user_search_a_product_in_search_bar_by_entering(String productname) throws Exception {
		
		homepage = new HomePage(driver);
		homepage.enterValueInSearchBox(productname); 
	}

	@And("upon clicking search icon, user should see list of products")
	public void upon_clicking_search_icon_user_should_see_list_of_products() {
		
	    homepage.clickonsearchbutton();
	    
	    Assert.assertTrue(homepage.searchproductpage());
	    
	}
	
	@When("user select an item and click add to cart")
	public void user_select_an_item_and_click_add_to_cart() {
		
		homepage.selectproduct();
		homepage.clickaddtocart();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("user should see confirmation message that the product is added to the cart")
	public void user_should_see_confirmation_message_that_the_product_is_added_to_the_cart() {
		
		Assert.assertEquals("Added to Cart", homepage.addedtocartprompt());
	}
	@And("user should be prompted to log in or create account")
	public void user_should_be_prompted_to_log_in_or_create_account() {
		
//		Assert.assertTrue(homepage.prompttologin());
	}
	
	@When("user filters the items with Memory Storage Capacity")
	public void user_filters_the_items_with_memory_storage_capacity() {
		homepage.clickMemoryStorageCheckBox();
	}


//    @Then("Search Result should be displayed")
//    public void search_result_should_be_displayed() {
//        SearchResultPage searchResultPage = new SearchResultPage(DriverManager.getDriver());
//        boolean isSearchDisplayed = searchResultPage.isSearchPageDisplayed();
//        Assert.assertTrue(isSearchDisplayed);
//    }
}