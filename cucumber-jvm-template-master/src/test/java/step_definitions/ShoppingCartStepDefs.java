package step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;


public class ShoppingCartStepDefs{
    public WebDriver driver;
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
    
    
    public ShoppingCartStepDefs()
    {
    	driver = Hooks.driver;
    	    	
    	datamap = new ArrayList<HashMap<String,String>>();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	sampleData.put("username","abc@xyz.com");
    	sampleData.put("password","Test@123");
    	System.out.println("Current data" +sampleData);
    	datamap.add(sampleData);
    }
    
    @Given("^I say hello$")
    public void i_say_hello() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Hello");
    }
    
    @Given("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("http://automationpractice.com");
    }

    @Then("^I sign in$")
    public void i_sign_in() throws Throwable {
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    	driver.findElement(By.id("email_create")).sendKeys("abc@unictest.com");
    	driver.findElement(By.id("SubmitCreate")).click();
    	//assertEquals(driver.findElement(By.id("email_create")), "test failed");
    }

}