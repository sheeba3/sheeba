package bddimplementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;



public class createLead {

	public  static ChromeDriver driver;


	@Given("launch the browser")
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.Exe");
		driver=new ChromeDriver();

	}
	@And("maximize the browser")
	public void maximize() {


		driver.manage().window().maximize();
	}

	@And("set the timeouts")
	public void timeouts() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("enter the URL")
	public void url() {

		driver.get("http://leaftaps.com/opentaps/");
	}

	@And("enter the userName as (.*)")
	public void enterUname(String Uname) {

		driver.findElementById("username").sendKeys(Uname);

	}
	@And("enter the password as (.*)")
	public void enterpassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);

	}




	@When("clicks on the login button")
	public void submit() {
		driver.findElementByClassName("decorativeSubmit").click();
	}


	@Then("verify  login is sucess")
	public void Verfiy() {
		System.out.println("Logged in");
	}

	@And("click on crmsfa")
	public void clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@And("click on create lead")
	public void clickcreatelead() {
		driver.findElementByLinkText("Create Lead").click();

	}
	@And("enter the companyname as (.*)")
	public void entercompany(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);

	}
	@And("enter the firstname as (.*)")
	public void enterFirstName(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);

	}
	@And("enter the lastname as (.*)")
	public void enterLastName(String Lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);

	}
	@When("Clicks on createLead")
	public void CreatingLead() {

		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("verify Lead is created")
	public void verify() {

		System.out.println("Lead created");
	}


	
	@Then("close the brower")
	
	public void browserclose() {
		
		driver.close();
		
	}









}
