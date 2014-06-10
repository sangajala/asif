package asif;


import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.Random;

public class StepDefs
{

    static WebDriver driver;
    LoginPage loginPage;
    HomePage home;
    ForgotPwdPage forgotpwdpage;

    ProjectHomePage projecthomepage;
    Testers testers;

    Random random = new Random();
    String name,name1;

	@Before
	public void StartBrowser() throws MalformedURLException, InterruptedException
	{	
		try 
		{
		BrowserFactory.StartBrowser("firefox", "http://tvishitech.com/webdev/testlab/web/index.php");
		driver = BrowserFactory.driver;
        } catch (Exception e) {
			e.printStackTrace();
		}

        loginPage = new LoginPage();
        home=new HomePage();
        forgotpwdpage = new ForgotPwdPage();

        projecthomepage = new ProjectHomePage();
        testers = new Testers();


	}

	@After
	public void closeBrowser() throws MalformedURLException, InterruptedException
	{

		driver.quit();
        //.QuitBrowser();

	}

    @Given("^Admin is in login page$")
    public void Admin_is_in_login_page() {
        Assert.assertTrue(Utils.getVisibleText().contains("WEB LOGIN"));
    }

    @Given("^User is in home page$")
    public void User_is_in_home_page() {

    }

    @When("^user navigates to the 'Forums'$")
    public void user_navigates_to_the_Forums() {

    }

    @Then("^heading with 'Forums' is shown$")
    public void heading_with_Forums_is_shown() {

    }

    @When("^user navigates to the 'New Products'$")
    public void user_navigates_to_the_New_Products() {

    }

    @Then("^text should be shown with 'Discuss new products and industry trends'$")
    public void text_should_be_shown_with_Discuss_new_products_and_industry_trends() {

    }

    @When("^user starts a new topic$")
    public void user_starts_a_new_topic() {

    }

    @When("^provide title as 'Sample'$")
    public void provide_title_as_Sample() {

    }

    @When("^body as 'sample body'$")
    public void body_as_sample_body() {

    }

    @When("^save the fourm data$")
    public void save_the_fourm_data() {

    }

    @Then("^I should see my fourm with name 'Sample' in the fourm page$")
    public void I_should_see_my_fourm_with_name_Sample_in_the_fourm_page() {

    }


}
